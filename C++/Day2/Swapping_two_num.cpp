#include<iostream>
using namespace std;
int main()
{
    int a=30,b=40;
    cout<<"Before Swapping "<<endl;
    cout<<a<<"\t"<<b<<endl;
    a=a-b;
    b=a+b;
    a=b-a;
    cout<<"After Swapping "<<endl;
    cout<<a<<"\t"<<b<<endl;
}