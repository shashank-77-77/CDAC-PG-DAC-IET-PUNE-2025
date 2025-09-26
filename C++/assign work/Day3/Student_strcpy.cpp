#include<iostream>
using namespace std;
#include<string.h>
class Student
{
    int roll_no;
    char name[15];
    public:
        Student()
        {
            roll_no=101;
            strcpy(name,"soham");
        }
        Student(int i,char * ptr)
        {
            roll_no=i;
            strcpy(name,ptr);
        }
        void display()
        {
            cout<<"roll no is "<<roll_no<<endl;
            cout<<"name is"<<name;
        }
};
int main()
{
    Student s1;
    s1.display();

    Student s2(102,"rohit");
    s2.display();
}