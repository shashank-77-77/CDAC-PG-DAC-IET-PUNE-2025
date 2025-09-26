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
    void func()
    {
        cout<<"In function of A class"<<endl;
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
    void func()
    {
        cout<<"In function of B class"<<endl;
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
    c1.func();
}
/*
.\Multiple_inh_function.cpp: In function 'int main()':
.\Multiple_inh_function.cpp:47:8: error: request for member 'func' is ambiguous
     c1.func();
        ^~~~
.\Multiple_inh_function.cpp:14:10: note: candidates are: void A::func()
     void func()
          ^~~~
.\Multiple_inh_function.cpp:30:10: note:                 void B::func()
     void func()
*/