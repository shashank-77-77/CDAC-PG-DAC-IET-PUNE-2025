





//reverse string

#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);

    // Optimal: built-in reverse
    reverse(str.begin(), str.end());

    cout << "Reversed string: " << str << endl;
    return 0;
}





//pascal

#include <iostream>
using namespace std;

void printPascal(int n) {
    for (int line = 0; line < n; line++) {
        int val = 1; // First value in a line is always 1

        // Print spaces for triangle formatting
        for (int s = 0; s < n - line - 1; s++) {
            cout << " ";
        }

        // Compute values for this row
        for (int i = 0; i <= line; i++) {
            cout << val << " ";
            // Update val using binomial coefficient relation
            val = val * (line - i) / (i + 1);
        }
        cout << endl;
    }
}

int main() {
    int n;
    cout << "Enter number of rows: ";
    cin >> n;

    printPascal(n);

    return 0;
}




//amstrong

#include <iostream>
#include <cmath>
using namespace std;

void ams(int n)
{
    int original = n;
    int remainder, result = 0;

    while(n != 0)
    {
        remainder = n % 10;
        result += static_cast<int>(round(pow(remainder, 3)));
        // result += static_cast<int>(pow(remainder, 3));
        n = n / 10;
    }

    if(original == result)
    {
        cout << "The number is Armstrong";
    }
    else
    {
        cout << "The number is not Armstrong";
    }
}

int main()
{
    int num;
    cout << "Enter the number: ";
    cin >> num;
    ams(num);
}


//prime
#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int num;
    cout << "Enter the number: ";
    cin >> num;

    if (num <= 1) {
        cout << "The number is not prime";
        return 0;
    }

    bool isPrime = true;
    int limit = static_cast<int>(sqrt(num));
    for (int i = 2; i <= limit; ++i) {
        if (num % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        cout << "The number is prime";
    } else {
        cout << "The number is not prime";
    }

    return 0;
}
//amstrong
#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int num, originalNum, remainder, result = 0, n = 0;

    cout << "Enter a number: ";
    cin >> num;

    originalNum = num;

    // Count number of digits
    int temp = num;
    while (temp != 0) {
        temp /= 10;
        ++n;
    }

    // Calculate Armstrong sum
    temp = num;
    while (temp != 0) {
        remainder = temp % 10;
        result += pow(remainder, n);
        temp /= 10;
    }

    if (result == num)
        cout << num << " is an Armstrong number." << endl;
    else
        cout << num << " is not an Armstrong number." << endl;

    return 0;
}
//pascal
#include <iostream>
using namespace std;

int main() {
    int rows;

    cout << "Enter number of rows: ";
    cin >> rows;

    for (int i = 0; i < rows; i++) {
        // Print spaces for alignment
        for (int space = 0; space < rows - i - 1; space++) {
            cout << "  ";
        }

        int val = 1; // First value in each row is 1
        for (int j = 0; j <= i; j++) {
            cout << val << "   ";

            // Update val using formula: nCr+1 = nCr * (n-r)/(r+1)
            val = val * (i - j) / (j + 1);
        }
        cout << endl;
    }

    return 0;
}
//second large element
#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter size of array: ";
    cin >> n;

    int arr[n];
    cout << "Enter " << n << " elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int largest = arr[0];
    int secondLargest = -1e9; // very small number

    for (int i = 1; i < n; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }

    if (secondLargest == -1e9)
        cout << "No second largest element (all elements may be same)" << endl;
    else
        cout << "Second largest element: " << secondLargest << endl;

    return 0;
}
//greadbook
#include <iostream>
#include <fstream>
#include <string>
#include <vector>

using namespace std;

// ---------------- Exceptions ----------------
struct InvalidMarkException {
    string msg;
    InvalidMarkException(string m) : msg(m) {}
};

struct DuplicateRollNoException {
    string msg;
    DuplicateRollNoException(int roll) { msg = "Duplicate roll number: " + to_string(roll); }
};

struct EmptyGradebookException {
    string msg;
    EmptyGradebookException() { msg = "Gradebook is empty."; }
};

struct StudentNotFoundException {
    string msg;
    StudentNotFoundException(int roll) { msg = "Student with roll number " + to_string(roll) + " not found."; }
};

// ---------------- Student ----------------
class Student {
    int rollNo;
    string name;
    int marks[3]; // plain C array

    void validateMark(int m) {
        if (m < 0 || m > 100) throw InvalidMarkException("Marks must be between 0 and 100.");
    }
public:
    Student() { rollNo = 0; name = ""; marks[0]=marks[1]=marks[2]=0; }
    Student(int roll, string n, int m1, int m2, int m3) {
        rollNo = roll; name = n;
        setMarks(m1, m2, m3);
    }

    int getRollNo() const { return rollNo; }
    string getName() const { return name; }

    void setMarks(int m1, int m2, int m3) {
        validateMark(m1); validateMark(m2); validateMark(m3);
        marks[0]=m1; marks[1]=m2; marks[2]=m3;
    }

    double average() const {
        return (marks[0]+marks[1]+marks[2]) / 3.0;
    }

    bool operator>(const Student& other) const {
        return this->average() > other.average();
    }

    Student& operator++() { // prefix
        for (int i=0;i<3;i++) if (marks[i] < 100) marks[i]++;
        return *this;
    }

    Student operator++(int) { // postfix
        Student tmp = *this;
        ++(*this);
        return tmp;
    }

    string toLine() const {
        return to_string(rollNo) + "|" + name + "|" +
               to_string(marks[0]) + "|" + to_string(marks[1]) + "|" + to_string(marks[2]);
    }

    static Student fromLine(const string& line) {
        int parts[5], count=0;
        string tokens[5];
        string temp="";
        for (char c : line) {
            if (c=='|') { tokens[count++]=temp; temp=""; }
            else temp+=c;
        }
        tokens[count++]=temp;

        if (count!=5) throw InvalidMarkException("Corrupt record.");

        int roll = stoi(tokens[0]);
        string name = tokens[1];
        int m1 = stoi(tokens[2]);
        int m2 = stoi(tokens[3]);
        int m3 = stoi(tokens[4]);

        return Student(roll, name, m1, m2, m3);
    }

    void print() const {
        cout << "Roll: " << rollNo << " | Name: " << name
             << " | Marks: " << marks[0] << " " << marks[1] << " " << marks[2]
             << " | Avg: " << average() << "\n";
    }
};

// ---------------- Gradebook ----------------
class Gradebook {
    vector<Student> students;

public:
    void addStudent(const Student& s) {
        for (auto& st : students)
            if (st.getRollNo() == s.getRollNo()) throw DuplicateRollNoException(s.getRollNo());
        students.push_back(s);
    }

    Student& getStudent(int roll) {
        if (students.empty()) throw EmptyGradebookException();
        for (auto& s : students) if (s.getRollNo()==roll) return s;
        throw StudentNotFoundException(roll);
    }

    void updateMarks(int roll, int m1, int m2, int m3) {
        getStudent(roll).setMarks(m1,m2,m3);
    }

    void giveBonusToStudent(int roll) {
        ++getStudent(roll);
    }

    void giveBonusToAll() {
        if (students.empty()) throw EmptyGradebookException();
        for (auto& s : students) ++s;
    }

    void listStudents() const {
        if (students.empty()) throw EmptyGradebookException();
        for (auto& s : students) s.print();
    }

    void topper() const {
        if (students.empty()) throw EmptyGradebookException();
        const Student* best = &students[0];
        for (auto& s : students) {
            if (s > *best) best = &s;
        }
        cout << "Topper: "; best->print();
    }

    void loadFromFile(const string& filename) {
        students.clear();
        ifstream in(filename);
        if (!in) return;
        string line;
        while (getline(in, line)) {
            if (line.empty()) continue;
            students.push_back(Student::fromLine(line));
        }
    }

    void saveToFile(const string& filename) const {
        ofstream out(filename);
        for (auto& s : students) out << s.toLine() << "\n";
    }
};

// ---------------- Main ----------------
int main() {
    Gradebook gb;
    string filename = "gradebook.txt";
    gb.loadFromFile(filename);

    while (true) {
        cout << "\nMenu:\n"
             << "1. Add student\n"
             << "2. List students\n"
             << "3. Update marks\n"
             << "4. Bonus to student\n"
             << "5. Bonus to all\n"
             << "6. Show topper\n"
             << "7. Save & Exit\n"
             << "Choice: ";
        int choice; cin >> choice;
       
            if (choice==1) {
                int roll,m1,m2,m3; string name;
                cout << "Roll No: "; cin >> roll;
                cin.ignore();
                cout << "Name: "; getline(cin,name);
                cout << "Marks (3): "; cin >> m1 >> m2 >> m3;
                gb.addStudent(Student(roll,name,m1,m2,m3));
            }
            else if (choice==2) gb.listStudents();
            else if (choice==3) {
                int roll,m1,m2,m3;
                cout << "Roll No: "; cin >> roll;
                cout << "Marks (3): "; cin >> m1 >> m2 >> m3;
                gb.updateMarks(roll,m1,m2,m3);
            }
            else if (choice==4) {
                int roll; cout << "Roll No: "; cin >> roll;
                gb.giveBonusToStudent(roll);
            }
            else if (choice==5) gb.giveBonusToAll();
            else if (choice==6) gb.topper();
            else if (choice==7) { gb.saveToFile(filename); cout << "Saved. Bye!\n"; break; }
            else cout << "Invalid choice.\n";
       
    }
    return 0;
}


//bill
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
