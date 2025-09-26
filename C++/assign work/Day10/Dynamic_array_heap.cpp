#include<iostream>
using namespace std;
class Student
{
    int roll_no;
    char name[10];
    public:
    void accept();
    void display();
};
void Student::accept()
{
    cin>>roll_no;
    cin>>name;

}
void Student::display()
{
    cout<<"roll no ="<<roll_no<<endl;
    cout<<"name is "<<name<<endl;
}
int main()
{
    int i,n;
    cout<<"Enter number of students"<<endl;
    cin>>n;
    Student *s1=new Student[n];
    cout<<"Accept details"<<endl;
    for(i=0;i<n;i++)
    {
        cout<<"Enter roll no and name for "<<i+1<<endl;
        s1[i].accept();
    }
    cout<<"Display details"<<endl;
    for(i=0;i<n;i++)
    {
        s1[i].display();
    }
    delete s1;
}