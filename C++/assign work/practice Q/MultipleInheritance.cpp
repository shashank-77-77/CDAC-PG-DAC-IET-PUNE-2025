#include<iostream>
using namespace std;
class A{
    public:
    A(int x){
        cout<<"In class A para constructor"<<endl;
    }    
};
class B: virtual public A{
    public:
    B(int x):A(x){
        cout<<"In class B para constructor"<<endl;
    }
};
class C: virtual public A{
    public:
    C(int z):A(z){
        cout<<"In class C para constructor"<<endl;
    }
};
class D: public B,public C{
    public:
    D(int g):B(g),C(g),A(g){
        cout<<"In class D default constructor"<<endl;
    }
};
int main(){
    D d1(1);
}