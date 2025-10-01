#include<iostream>
using namespace std;
class Complex
{
    int real,img;
    public:
    Complex();
    Complex(int,int);
    void display() const;
    void setReal(int);
    int getReal() const;

};
void Complex:: setReal(int r)
{
    real=r;
}
int Complex::getReal() const
{
    return real;
}
Complex::Complex()
{
    cout<<"inside no argument constructor"<<endl;
}
Complex::Complex(int rr,int i)
{
    cout<<"inside parameter constructor"<<endl;
    real=rr;
    img=i;
}
void Complex::display() const
{
 cout<<"Complex number is="<<real<<"+"<<img<<"i"<<endl;
}
int main()
{
   
    const Complex c2(5,6);
    c2.display();
    cout<<"real part is "<<c2.getReal()<<endl;
     Complex c1;
    c1.setReal(10);
    cout<<"real part is "<<c1.getReal()<<endl;
   
}