#include<iostream>
using namespace std;
class Person
{
    public:
    Person(int a)
    {
        cout<<"person(int) const called"<<endl;
    }
};
class Faculty :public Person
{
    public:
    Faculty(int b):Person(4)
    {
        cout<<" Faculty(int) const called "<<endl;
    }
};
class Student:public Person
{
    public:
    Student(int c):Person(5)
    {
        cout<<" Student(int) const called"<<endl;
    }
};
class TA:public Faculty,public Student
{
    public:
    TA(int d):Faculty(5),Student(5)
    {
        cout<<"TA(int) const called"<<endl;
    }
};
int main()
{
    TA t1(20);
}