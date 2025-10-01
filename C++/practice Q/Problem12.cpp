#include <iostream>
#include <fstream>
#include <stdexcept>
#include <cstring>  // for strcpy
using namespace std;

const int MAX_ITEMS = 100;  // Max items in inventory or bill

class Item {
    int itemID;
    char itemName[30];
    float price;
    int stockQuantity;

public:
    Item() {}
    Item(int id, const char* name, float p, int qty) {
        if (p < 0 || qty < 0)
            throw invalid_argument("Negative price or quantity not allowed.");
        itemID = id;
        strcpy(itemName, name);
        price = p;
        stockQuantity = qty;
    }

    void accept() {
        cout << "Enter item ID: ";
        cin >> itemID;
        cout << "Enter item name: ";
        cin >> itemName;
        cout << "Enter price: ";
        cin >> price;
        if (price < 0) throw invalid_argument("Negative price is not allowed.");
        cout << "Enter stock quantity: ";
        cin >> stockQuantity;
        if (stockQuantity < 0) throw invalid_argument("Negative quantity is not allowed.");
    }

    void display() const {
        cout << "Item ID: " << itemID << ", Name: " << itemName
             << ", Price: " << price << ", Stock: " << stockQuantity << endl;
    }

    int getID() const { return itemID; }
    const char* getName() const { return itemName; }
    float getPrice() const { return price; }
    int getStock() const { return stockQuantity; }

    void reduceStock(int qty) {
        if (qty > stockQuantity)
            throw runtime_error("Attempt to purchase more than available stock.");
        stockQuantity -= qty;
    }

    friend ostream& operator<<(ostream& out, const Item& item);
};

ostream& operator<<(ostream& out, const Item& item) {
    out << "Item ID: " << item.itemID << ", Name: " << item.itemName
        << ", Price: " << item.price << ", Quantity: " << item.stockQuantity << endl;
    return out;
}

class Bill {
    int billID;
    char customerName[30];
    Item purchasedItems[MAX_ITEMS];
    int purchasedCount = 0;

public:
    Bill() {}

    void accept() {
        cout << "Enter Bill ID: ";
        cin >> billID;
        cout << "Enter Customer Name: ";
        cin >> customerName;
    }

    void addItem(Item& item) {
        if (purchasedCount >= MAX_ITEMS)
            throw runtime_error("Exceeded maximum items in bill.");

        int qty;
        cout << "Enter quantity to purchase for item " << item.getName() << ": ";
        cin >> qty;

        if (qty <= 0)
            throw invalid_argument("Quantity must be positive.");

        item.reduceStock(qty);

        // Create a copy with purchased quantity
        Item purchased(item.getID(), item.getName(), item.getPrice(), qty);
        purchasedItems[purchasedCount++] = purchased;
    }

    void display() const {
        cout << "\n=== BILL DETAILS ===\n";
        cout << "Bill ID: " << billID << endl;
        cout << "Customer Name: " << customerName << endl;
        cout << "Purchased Items:\n";
        for (int i = 0; i < purchasedCount; ++i)
            cout << purchasedItems[i];
    }

    void saveToFile(const char* filename) const {
        ofstream out(filename, ios::app);
        if (!out) {
            cerr << "Error opening file for writing!" << endl;
            return;
        }

        out << "Bill ID: " << billID << "\n";
        out << "Customer Name: " << customerName << "\n";
        out << "Purchased Items:\n";
        for (int i = 0; i < purchasedCount; ++i)
            out << purchasedItems[i];
        out << "----------------------------------\n";
        out.close();
    }

    bool isEmpty() const {
        return purchasedCount == 0;
    }

    static void loadPreviousBills(const char* filename) {
        ifstream in(filename);
        if (!in) {
            cout << "No previous bills found.\n";
            return;
        }

        cout << "Previous Bills:\n";
        cout << "-----------------------------\n";
        string line;
        while (getline(in, line))
            cout << line << endl;
        in.close();
    }
};

// ------------------------ MAIN ------------------------
int main() {
    try {
        Bill::loadPreviousBills("bills.txt");

        // Inventory
        Item inventory[MAX_ITEMS] = {
            Item(1, "Pen", 10.5, 100),
            Item(2, "Notebook", 45.0, 50),
            Item(3, "Eraser", 5.0, 200)
        };
        int inventoryCount = 3;

        Bill bill;
        bill.accept();

        char choice;
        do {
            cout << "\nAvailable Items:\n";
            for (int i = 0; i < inventoryCount; ++i)
                inventory[i].display();

            int itemID;
            cout << "Enter Item ID to purchase: ";
            cin >> itemID;

            bool found = false;
            for (int i = 0; i < inventoryCount; ++i) {
                if (inventory[i].getID() == itemID) {
                    bill.addItem(inventory[i]);
                    found = true;
                    break;
                }
            }

            if (!found)
                cout << "Item not found.\n";

            cout << "Add more items? (y/n): ";
            cin >> choice;
        } while (choice == 'y' || choice == 'Y');

        if (bill.isEmpty())
            throw runtime_error("Cannot generate empty bill.");

        bill.display();
        bill.saveToFile("bills.txt");
    }
    catch (const exception& ex) {
        cerr << "Error: " << ex.what() << endl;
    }

    return 0;
}
