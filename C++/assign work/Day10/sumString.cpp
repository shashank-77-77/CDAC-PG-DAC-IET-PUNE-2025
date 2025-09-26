#include <iostream>
#include <string>
using namespace std;

class Test {
    int decNum1, decNum2;

public:
    void accept() {
        cout << "Enter first decimal number: ";
        cin >> decNum1;
        cout << "Enter second decimal number: ";
        cin >> decNum2;
    }

    
    string decimalToBinary(int num) {
        string bin = "";
        while (num > 0) {
            bin = char((num % 2) + '0') + bin;
            num /= 2;
        }
        return bin;
    }

    void display() {
        int sum = decNum1 + decNum2;
        cout << "First number in binary: " << decimalToBinary(decNum1) << endl;
        cout << "Second number in binary: " << decimalToBinary(decNum2) << endl;
        cout << "Sum in decimal: " << sum << endl;
        cout << "Sum in binary: " << decimalToBinary(sum) << endl;
    }
};

int main() {
    Test t;
    t.accept();
    t.display();
    return 0;
}
