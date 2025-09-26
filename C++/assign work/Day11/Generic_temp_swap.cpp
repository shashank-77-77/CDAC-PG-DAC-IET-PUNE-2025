#include<iostream>
using namespace std;
template<class A>
A swap1(A &a,A &b)
{
    A temp;
    temp=a;
    a=b;
    b=temp;
}
int main()
{
    int a=10,b=20;
    swap1(a,b);
    cout<<"a="<<a<<" b="<<b;
}