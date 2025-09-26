#include<iostream>
using namespace std;
class Complex
{
  int real,img;
  public:
  
  void accept();
  void display();
  Complex();
  Complex(int,int);
  void setReal(int);
  int getReal();

};
void Complex::accept()
{
    cout<<"Enter value for real & img"<<endl;
    cin>>real>>img;    
}
void Complex ::display()
{
    cout<<"Complex number is "<<real<<"+"<<img<<"i"<<endl;
}
void Complex::setReal(int r)
{
    real=r;
}
int Complex::getReal()
{
    return real;
}
Complex::Complex()
{
    cout<<"Inside parameter less constructor"<<endl;

}
Complex::Complex(int a,int b)
{
    cout<<"Inside para constructor"<<endl;
    real=a;
    img=b;
    
}
int main()
{

    Complex c1;
    c1.accept();
    c1.display();
    c1.setReal(10);
    Complex c2(5,2);
    c2.display();
    
}

