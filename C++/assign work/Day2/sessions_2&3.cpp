//Write a Student class and use it in your program. Store the data of 10 students 
//and display the sorted data according to their roll numbers, name, and total marks
#include<iostream>
using namespace std;
class Student
{
    int roll_no;
    char name[10];
    float marks;
    public:
    void accept();
    void display();
};
void Student::accept()
{
    for(int i=1;i<=3;i++)
    {
        cout<<"Enter data for "<<i<< " Student "<<endl;
        cin>>roll_no>>name>>marks;

    }
}
void Student::display()
{
    for(int i=1;i<=3;i++)
    {
        cout<<"Roll_no= "<<roll_no<<"Name = "<<name<<"Marks = "<<marks<<endl;
    }
}
int main()
{
    Student s1;
    s1.accept();
    s1.display();
}