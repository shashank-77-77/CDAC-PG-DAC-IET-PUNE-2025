#include<iostream>
using namespace std;
int main()
{
    int a = 10;
    int* p = &a; // p holds the address of a

    cout << "Value of a: " << a << endl;
    cout << "Address of a: " << &a << endl;
    cout << "Value of p (address): " << p << endl;
    cout << "Value pointed by p: " << *p << endl; // Dereferencing

    int arr[3] = {1, 2, 3};
    int* pArr = arr; // Points to arr[0]
    cout << *pArr << endl;     // 1
    cout << *(pArr + 1) << endl; // 2

    return 0;
}