#include<iostream>
using namespace std;
class Employee
{
  int id;
  public:
  Employee();
  Employee(int );
  void display();
  virtual int findSalary()
  {
    return 0;

  }

};
 Employee::Employee ()
 {
  cout<<"in  default const of Employee"<<endl;
  id=0;
 }
 Employee::Employee(int i)
 {
    cout<<"in Para const of Employee"<<endl;
    id=i;

 }

 void Employee::display()
 {
    cout<<"id is "<<id<<endl;
 }
 class Wageemp:public Employee
 {
    int hours,rate;
    public:
    Wageemp();
    Wageemp(int , int , int);
    void display();
    int findSalary();

 };
 Wageemp::Wageemp()
 {
    cout<<"in Default Const of Wage Employee"<<endl;
    hours=0;
    rate=0;

 }
 Wageemp::Wageemp(int i, int h, int r):Employee(i)
 {
    cout<<"in para const of wage employee"<<endl;
    hours=h;
    rate=r;

 }
 int Wageemp::findSalary()
 {
    return hours*rate;
 }
 void Wageemp::display()
 {
    Employee::display();
    cout<<hours<<endl;
    cout<<rate<<endl;

 }
 int main()
 {
    Employee * ptr= new Wageemp(100,200,6000);
    cout<<"salary is"<<ptr->findSalary()<<endl;
    ptr->display();


 }