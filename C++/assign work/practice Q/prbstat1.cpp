// #include<iostream>
// using namespace std;

// class item{
//     char itemId;
//     string itemName;
//     float price;
//     int stockQuantity;

// };

// class bill{
//     int billId;
//     char customerName;
//     char listOfPurchasedItem[];

// };

// int main()
// {
    
// }


#include <iostream>
#include <fstream>
#include <vector>
#include <stdexcept>
#include <iomanip>
#include <functional>
using namespace std;

// ================== Class Item ==================
class Item {
    int itemID;
    string itemName;
    double price;
    int stockQuantity;

public:
    Item(int id = 0, string name = "", double p = 0, int qty = 0) {
        if (p < 0 || qty < 0) throw invalid_argument("Price or Quantity cannot be negative.");
        itemID = id;
        itemName = name;
        price = p;
        stockQuantity = qty;
    }

    int getID() const { return itemID; }
    string getName() const { return itemName; }
    double getPrice() const { return price; }
    int getStock() const { return stockQuantity; }

    void reduceStock(int qty) {
        if (qty > stockQuantity) throw runtime_error("Not enough stock available.");
        stockQuantity -= qty;
    }

    void display() const {
        cout << "ID: " << itemID << " | Name: " << itemName 
             << " | Price: " << price 
             << " | Stock: " << stockQuantity << endl;
    }
};

// Structure to store purchased items inside a bill
struct PurchasedItem {
    Item item;
    int quantity;
};

// ================== Class Bill ==================
class Bill {
    int billID;
    string customerName;
    vector<PurchasedItem> purchasedItems;

public:
    Bill(int id = 0, string cname = "") {
        billID = id;
        customerName = cname;
    }

    // Operator overloading for adding items
    Bill& operator+(pair<Item&, int> purchase) {
        Item &it = purchase.first;
        int qty = purchase.second;

        if (qty <= 0) throw invalid_argument("Quantity must be greater than 0.");
        if (qty > it.getStock()) throw runtime_error("Not enough stock available.");

        // Deduct stock
        it.reduceStock(qty);

        // Add purchased item
        PurchasedItem pi = {it, qty};
        purchasedItems.push_back(pi);
        return *this;
    }

    // Display Bill (operator<< overload)
    friend ostream& operator<<(ostream& os, const Bill& b) {
        if (b.purchasedItems.empty())
            throw runtime_error("Cannot generate empty bill!");

        os << "========== BILL ==========\n";
        os << "Bill ID: " << b.billID << "\nCustomer: " << b.customerName << "\n";
        os << "--------------------------\n";
        os << left << setw(10) << "ItemID" 
           << setw(15) << "Name" 
           << setw(10) << "Price" 
           << setw(10) << "Qty" 
           << setw(10) << "Total" << endl;

        double grandTotal = 0;
        for (auto &pi : b.purchasedItems) {
            double total = pi.item.getPrice() * pi.quantity;
            grandTotal += total;
            os << left << setw(10) << pi.item.getID()
               << setw(15) << pi.item.getName()
               << setw(10) << pi.item.getPrice()
               << setw(10) << pi.quantity
               << setw(10) << total << endl;
        }

        os << "--------------------------\n";
        os << "Grand Total: " << grandTotal << endl;
        os << "==========================\n";
        return os;
    }

    // Save bill to file
    void saveToFile() {
        ofstream fout("bills.txt", ios::app);
        if (!fout) {
            cerr << "Error opening file for saving bills!\n";
            return;
        }
        fout << *this; // Uses operator<<
        fout.close();
    }
};

// ================== Main Function ==================
int main() {
    try {
        // Load previous bills
        cout << "===== Previous Bills =====\n";
        ifstream fin("bills.txt");
        if (fin) {
            string line;
            while (getline(fin, line)) {
                cout << line << endl;
            }
            fin.close();
        } else {
            cout << "No previous bills found.\n";
        }

        // Items in store
        Item laptop(1, "Laptop", 55000, 5);
        Item mouse(2, "Mouse", 700, 20);
        Item keyboard(3, "Keyboard", 1500, 10);

        cout << "\n===== Available Items =====\n";
        laptop.display();
        mouse.display();
        keyboard.display();

        // Create new Bill
        Bill bill1(101, "John Doe");

        // Customer purchases
        bill1 + make_pair(std::ref(laptop), 1);
        bill1 + make_pair(std::ref(mouse), 2);

        // bill1 + make_pair(laptop, 1);
        // bill1 + make_pair(mouse, 2);

        // Print Bill
        cout << bill1;

        // Save bill to file
        bill1.saveToFile();
    }
    catch (exception &e) {
        cerr << "Error: " << e.what() << endl;
    }

    return 0;
}
