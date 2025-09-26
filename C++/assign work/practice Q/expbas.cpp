#include <iostream>
using namespace std;
int main() {
    double base;
    int exponent;

    cout << "Enter the base number: ";
    cin >> base;

    cout << "Enter the exponent (number of times to multiply): ";
    cin >> exponent;

    double result = 1.0; // Initialize result to 1 for multiplication

    // Handle negative exponents (for floating-point bases)
    if (exponent < 0) {
        base = 1.0 / base;
        exponent = -exponent;
    }

    for (int i = 0; i < exponent; ++i) {
        result *= base; // Multiply result by base in each iteration
    }

    cout << "Result: " << result << std::endl;

    return 0;
}