#include <iostream>
#include <fstream>
#include <string>
using namespace std;

const int MAX_ITEMS = 100;

class Item {
public:
    int itemID;
    string itemName;
    double price;
    int stockQuantity;

    Item(int id = 0, string name = "", double p = 0, int qty = 0) {
        if (p < 0 || qty < 0) throw "Price/Quantity cannot be negative!";
        itemID = id;
        itemName = name;
        price = p;
        stockQuantity = qty;
    }
};

class Bill {
    int billID;
    string customerName;
    Item purchasedItems[MAX_ITEMS];  // fixed-size array instead of vector
    int itemCount;

public:
    Bill(int id, string name) : billID(id), customerName(name), itemCount(0) {}

    // Operator+ to add item to the bill
    Bill& operator+(Item &it) {
        if (it.stockQuantity <= 0) throw "Item out of stock!";
        if (itemCount >= MAX_ITEMS) throw "Bill cannot hold more items!";
        purchasedItems[itemCount++] = it;
        return *this;
    }

    // Friend function to display bill
    friend ostream& operator<<(ostream& out, const Bill& b) {
        if (b.itemCount == 0) throw "Bill is empty!";

        double total = 0;
        out << "\n========= BILL =========\n";
        out << "Bill ID: " << b.billID << "\nCustomer: " << b.customerName << "\n";
        out << "Items Purchased:\n";
        for (int i = 0; i < b.itemCount; i++) {
            out << " - " << b.purchasedItems[i].itemName 
                << " | Price: " << b.purchasedItems[i].price << "\n";
            total += b.purchasedItems[i].price;
        }
        out << "------------------------\n";
        out << "Total: " << total << "\n";
        out << "========================\n";
        return out;
    }

    // Save bill to file
    void saveBill() {
        ofstream fout("bills.txt", ios::app); // append mode
        fout << "Bill ID: " << billID << "\nCustomer: " << customerName << "\n";
        for (int i = 0; i < itemCount; i++) {
            fout << purchasedItems[i].itemName << " - " 
                 << purchasedItems[i].price << "\n";
        }
        fout << "------------------------\n";
        fout.close();
    }
};

// Load previous bills (just display them at startup)
void loadBills() {
    ifstream fin("bills.txt");
    if (!fin) return; // No previous bills
    cout << "\n📂 Previous Bills:\n";
    string line;
    while (getline(fin, line)) {
        cout << line << endl;
    }
    fin.close();
}

int main() {
    try {
        // Load old bills
        loadBills();

        // Inventory
        Item store[4] = {
            Item(1, "Laptop", 75000, 10),
            Item(2, "Mouse", 500, 50),
            Item(3, "Keyboard", 1500, 30),
            Item(4, "Monitor", 12000, 20)
        };

        // Create a new bill
        Bill b1(101, "Alice");

        // Customer buys items
        b1 + store[0]; // Laptop
        b1 + store[1]; // Mouse

        // Display bill
        cout << b1;

        // Save bill to file
        b1.saveBill();

    } catch (const char* msg) {
        cerr << "Error: " << msg << endl;
    }

    return 0;
}
