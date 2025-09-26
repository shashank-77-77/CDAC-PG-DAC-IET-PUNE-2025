#include<iostream>
using namespace std;
int main()
{
    float a = 5.5;
    int b = (int)a; // explicit type casting
    cout << "The value of a is: " << a << endl;
    cout << "The value of b is: " << b << endl;

    // implicit type casting
    int c = 10;
    int d = 3; // implicit type casting
    cout << "The value of c/d is: " << float(c)/d << endl;

    return 0;
}