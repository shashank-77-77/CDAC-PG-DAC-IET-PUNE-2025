#include<iostream>
using namespace std;
class Base
{
    public:
    int l;
    int b;
};
class Child:public Base
{
    public:
        void set(int a,int d)
        {
            l=a;
            b=d;
        }
        void display()
        {
            cout<<"area of rec is "<<l*b<<endl;
        }
};
int main()
{
    Child c1;
    c1.set(10,20);
    c1.display();
}
