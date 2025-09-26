#include<iostream>
using namespace std;
class Employee
{
    int id;
    public:
    Employee();
    Employee(int );
    virtual void display();
    virtual int findSal()
    {
        return 0;
    }
};
Employee ::Employee()
{
    cout<<"in default const of Employee"<<endl;
    id=0;
}
Employee::Employee(int i)
{
    cout<<"In para const of Employee"<<endl;
    id=i;
}
void Employee::display()
{
    cout<<"id is "<<id<<endl;
}
class WageEmp:public Employee
{
    int hour,rate;
    public:
    WageEmp();
    WageEmp(int,int,int);
    void display();
    int findSal();
};
WageEmp::WageEmp()
{
    cout<<"in default const of WageEmp"<<endl;
    hour=0;
    rate=0;
}
WageEmp::WageEmp(int i,int h,int r):Employee(i)
{
    cout<<"In para const of Wageemp"<<endl;
    hour=h;
    rate=r;
}
int WageEmp::findSal()
{
    return hour * rate;
}
void WageEmp::display()
{
    Employee::display();
    cout<<hour<<endl;
    cout<<rate<<endl;
}
int main()
{
    Employee *ptr;
    WageEmp w1(10,5,10000);
    ptr=&w1;
    cout<<"Salary is "<<ptr->findSal()<<endl;
    ptr->display();
}