#include <iostream>
#include <vector>
using namespace std;

int main() {
    // Declare a vector of integers
    vector<int> numbers;

    // Add elements
    numbers.push_back(10);
    numbers.push_back(20);
    numbers.push_back(30);

    // Access elements
    cout << "First element: " << numbers[0] << endl;
    cout << "Second element: " << numbers.at(1) << endl;

    // Size of the vector
    cout << "Size: " << numbers.size() << endl;

    // Loop through the vector
    cout << "All elements: ";
    for (int num : numbers) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}