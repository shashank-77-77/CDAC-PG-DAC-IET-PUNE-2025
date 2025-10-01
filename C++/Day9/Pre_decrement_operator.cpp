#include<iostream>
using namespace std;
class Complex
{
    int real,img;
    public:
    Complex();
    Complex(int,int);
    void display();
    Complex operator--();

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
Complex Complex ::operator--()
{
   this->real--;
	this->img=this->img-1;
	return (*this);
}
int main()
{
    Complex c1(5,2);
    
    Complex c2=--c1; //c2=c1.operator--();
    
    c2.display();

}
