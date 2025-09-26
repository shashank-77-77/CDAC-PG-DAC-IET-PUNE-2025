#include<iostream>
using namespace std;
int main()
{
    int num1, num2, num3;
    cout << "Enter the 1st number: ";
    cin >> num1;
    cout << "Enter the 2nd number: ";
    cin >> num2;
    cout << "Enter the 3rd number: ";
    cin >> num3;

    int largest = num1;

    if (num2 > largest)
    {
        largest = num2;
    }

    if (num3 > largest)
    {
        largest = num3;
    }

    cout << "The largest number is: " << largest << endl;

    return 0;
}