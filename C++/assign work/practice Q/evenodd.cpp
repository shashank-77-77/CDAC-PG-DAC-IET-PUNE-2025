#include<iostream>
using namespace std;
int main ()
{
    double a;
    cout<<"Insert your number: ";
    cin>>a;
    int int_a = static_cast<int>(a);
    int b = int_a % 2;
    if (a != int_a) // check if input is not an integer
    {
        cout<<a<<" is not an integer number";
    }
    else if (b==0)
    {
        cout<<a<<" is Even number";
    }
    else
    {
        cout<<a<<" is an odd number";
    }
    return 0;

}