#include<iostream>
using namespace std;
class Complex
{
    int real,img;
    public:
    void accept();
    void display();
    void setReal(int);
    int getReal();
};
void Complex::accept()
{
    cout<<"Enter value for real and img"<<endl;
    cin>>real>>img;
}
void Complex::display()
{
    cout<<"complex number is "<<real<<"+"<<img<<"i"<<endl;
}
void Complex::setReal(int r)
{
    real=r;
}
int Complex::getReal()
{
    return real;
}
int main()
{
    Complex c1;
    c1.accept();
    c1.display();
    c1.setReal(10);
    c1.display();
    cout<<"real part is "<<c1.getReal()<<endl;
}