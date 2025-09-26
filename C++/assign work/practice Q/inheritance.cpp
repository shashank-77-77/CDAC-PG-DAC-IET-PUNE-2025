#include<iostream>
using namespace std;
class Employee{
    int id;
    public:
    Employee(int id){
        this->id = id;
    }
    void display(){
        cout<<"Id is : "<<id<<endl;
    }
};
class WageEmployee:public Employee{    
    public:
    int hrs,rate;
    WageEmployee(int id,int hrs,int rate):Employee(id)
    {
        this->hrs = hrs;
        this->rate = rate;
    }
    int calculateWages(){
        return hrs*rate;
    }
    void display(){
        Employee::display();
        cout<<"Wages are : "<<calculateWages()<<endl;
    }
};
class SalesPerson:public WageEmployee{
    int sales,comm;
    public:
    SalesPerson(int,int,int,int,int);
    int calculateSales(){
        return hrs*rate*sales*comm;
    }
    void display(){
        WageEmployee::display();
        cout<<"Sales are : "<<calculateSales()<<endl;
    }
};
SalesPerson::SalesPerson(int id,int hrs,int rate,int sales,int comm):WageEmployee(id,hrs,rate)
{
     this->comm = comm;
     this->sales = sales;
}
int main(){
    SalesPerson sp1(1,5,200,20,3);
    sp1.display();
   
}
