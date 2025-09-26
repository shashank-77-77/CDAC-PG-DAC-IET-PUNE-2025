#include <iostream>
int main() {
    int day = 2;
    switch(day) {
        case 1: std::cout << "Monday\n"; break;
        case 2: std::cout << "Tuesday\n"; break;
        default: std::cout << "Other day\n";
    }
    return 0;
}