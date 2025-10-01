#include<iostream>
using namespace std;
class Complex
{
    int real,img;

    public:
    Complex();
    Complex(int,int);
    void display();
    Complex operator+(int);
    friend Complex operator+(int, Complex&);
};

Complex::Complex()
{

}
Complex::Complex(int real , int img)
{
    this->real=real;
    this->img=img;
}
void Complex::display()
{
    if(img>0)
    cout<<"if complex no is "<<real<<"+"<<img<<"i"<<endl;
    else
    cout<<"if complex no is "<<real<<img<<"i"<<endl;    
}
Complex Complex::operator+(int num)
{
	Complex temp;
	temp.real=real+num;
	temp.img=img+num;
	return temp;
}
Complex operator+(int num,Complex & c)
{
	Complex temp;
	temp.real=c.real+num;
	temp.img=c.img+num;
	return temp;
}



int main()
{
	/*Complex c1(1,2);
	Complex c2=c1 + 5;
	c2.display();*/
	Complex c1(1,2);
	Complex c2=5+c1;    
	c2.display();
}	