#include<iostream>
using namespace std;
class A{
    public:
    virtual void display();
};
void A::display(){
    cout<<"In class A"<<endl;
}
class B:public A{
    public:
    void display();
};
void B::display(){
    cout<<"In class B"<<endl;
}
class C:public B{
    public:
    void display();
};
void C::display(){
    cout<<"In class C"<<endl;
}
int main(){
    A *a1 = new C() ; 
    a1->display();
}
 