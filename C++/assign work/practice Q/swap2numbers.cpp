#include<iostream>
using namespace std;
int main()
{
    int a=10, b=250;
    cout<<"The value of a is: "<<a<<endl;
    cout<<"The value of b is: "<<b<<endl;
    

    int temp;
    temp=a;
    a=b;
    b=temp;

    cout<<"After swapping, the value of a is: "<<a<<endl;
    cout<<"After swapping, the value of b is: "<<b<<endl;

    return 0;
}