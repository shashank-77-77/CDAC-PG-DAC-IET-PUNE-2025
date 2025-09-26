#include<iostream>
using namespace std;
//Example 1: Simple if

int main()
{
    int x = 10;
if (x > 5) {
    std::cout << "x is greater than 5\n";
}

// Example 2: if-else
int age = 17;
if (age >= 18) {
    cout << "Adult\n";
} else {
    std::cout << "Minor\n";
}

// Example 3: if-else if-else
int marks = 85;
if (marks >= 90) {
    cout << "Grade A\n";
} else if (marks >= 75) {
    cout << "Grade B\n";
} else {
    cout << "Grade C\n";
}
}                   