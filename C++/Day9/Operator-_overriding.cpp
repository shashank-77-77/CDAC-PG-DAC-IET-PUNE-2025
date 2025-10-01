#include<iostream>
using namespace std;
class Complex
{
    int real,img;
    public:
    Complex();
    Complex(int,int);
    void display();
    Complex operator-(Complex &);

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
    if(img>0)
    {
    cout<<real<<"+"<<img<<"i"<<endl;
    }
    else
    {
        cout<<real<<img<<"i"<<endl;
    }
}
Complex Complex ::operator-(Complex &c2_new)
{
    Complex temp;
    temp.real=this->real-c2_new.real;
    temp.img=this->img-c2_new.img;
    return temp;
}
int main()
{
    Complex c1(5,2);
    Complex c2(6,3);
    Complex c3=c1-c2; //c3=c1.operator-(c2);
    c3.display();

}
