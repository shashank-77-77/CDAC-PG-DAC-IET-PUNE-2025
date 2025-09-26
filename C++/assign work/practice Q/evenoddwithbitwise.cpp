#include<iostream>
using namespace std;
int main()
{
    int a;
    cout<<"Insert your number: ";
    cin>>a;
    int lastbit = a & 1;
    if (lastbit==0)
    {
        cout<<a<<" is Even number";
    }
    else
    {
        cout<<a<<" is an odd number";
    }
    return 0;

}
