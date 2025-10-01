#include<iostream>
using namespace std;
class Complex
{
    int real,img;
    public:
    Complex();
    Complex(int,int);
    void display();
    Complex operator++(int);

};
Complex::Complex()
{
    real=0;
    img=0;
}
Complex::Complex(int r,int i)
{
    real=r;
    img=i;
}
void Complex::display()
{
    cout<<real<<"+"<<img<<"i"<<endl;
}
Complex Complex ::operator++(int)
{
    Complex temp=(*this);
    this->real=this->real+1;
    this->img=this->img+1;
    return temp;
}
int main()
{
    Complex c1(5,2);
    Complex c2=c1++; //c2=c1.operator++(int);
    c1.display();
    c2.display();

}
