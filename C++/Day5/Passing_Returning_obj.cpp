#include<iostream>
using namespace std;
class temp
{
    int a;
    public:
    void get();
    temp add(temp &b1)
    {
        temp aobj3;
        aobj3.a=this->a+b1.a;
        return aobj3;
    }
    void show()
    {
        cout<<"value is"<<a;
    }
};
void temp::get()
{
   
    cin>>this->a;
}
int main()
{
    temp aobj1,aobj2;
    cout<<"Enter first number"<<endl;
    aobj1.get();
    cout<<"Enter second number"<<endl;
    aobj2.get();
    temp aobj4=aobj1.add(aobj2);
    aobj4.show();
}