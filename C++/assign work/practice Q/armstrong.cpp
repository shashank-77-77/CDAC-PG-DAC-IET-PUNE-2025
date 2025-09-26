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