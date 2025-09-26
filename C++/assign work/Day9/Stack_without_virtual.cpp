#include<iostream>
using namespace std;
class Employee
{
 int id;

  public:
  Employee();
  Employee(int );
  void display();
  int findSalary()
  {
    return 0;
  }
};
Employee :: Employee()
{
 cout<<"in default Constructor of Employee"<<endl;
 id=0;

}
Employee::Employee(int i)
{
    cout<<"in para const"<<endl;
    id=i;
}

void Employee :: display()
{
    cout<<"id is "<<id<<endl;
}
class Wageemployee: public Employee 
{
    int hours,rate;
    public:
    Wageemployee();
    Wageemployee(int , int, int);
    void display();
    int findSalary();

};

Wageemployee::Wageemployee()
{
    cout<<"In default of Wage Employee"<<endl;
    hours=0;
    rate=0;

}

Wageemployee::Wageemployee(int i, int h, int r)
{
    cout<<"in Para of Wage Employee"<<endl;
    hours=h;
    rate=r;

}

int Wageemployee :: findSalary()
{
    return hours*rate;

}

void Wageemployee :: display()
{
    Employee::display();
    cout<<hours<<endl;
    cout<<rate<<endl;
}

int main()
{
    Employee *ptr ;
    Wageemployee W1(1,11,22);
    ptr = &W1;
    cout<<"salary is "<<ptr-> findSalary()<<endl;
    ptr->display();


}