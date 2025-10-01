#include<iostream>
using namespace std;
class Person
{
    public:
    Person(int x)
    {
        cout<<"person(int) const called"<<endl;
    }
    Person()
    {
        cout<<"Person default const called"<<endl;
    }
};
class Faculty : virtual public Person
{
    public:
    Faculty(int x):Person(x)
    {
        cout<<" Faculty(int) const called "<<endl;
    }
};
class Student: virtual public Person
{
    public:
    Student(int x):Person(x)
    {
        cout<<" Student(int) const called"<<endl;
    }
};
class TA:public Faculty,public Student
{
    public:
    TA(int x):Student(x),Faculty(x),Person(x)
    {
        cout<<"TA(int) const called"<<endl;
    }
};
int main()
{
    TA t1(20);
}