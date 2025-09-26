#include<iostream>
using namespace std;
class A
{
    public:
    A()
    {
        cout<<"In default const of class A"<<endl;
    }
    A(int a)
    {
        cout<<"In para const of class A"<<endl;
    }
};
class B
{
    public:
    B()
    {
        cout<<"In default const of class B"<<endl;
    }
    B(int b)
    {
        cout<<"In para const of class B"<<endl;
    }
};
class C:public B,public A
{
    public:
    C():B(),A(5)
    {
        cout<<"In default const of class C"<<endl;
    }

};
int main()
{
    C c1;
}