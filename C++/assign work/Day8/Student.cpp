#include <iostream>
#include <string.h>
using namespace std;

class Student
{
    int roll_no;
    string name;
    string birth;
    int marks;

public:
    void accept()
    {
        cout << "Enter Roll no: ";
        cin >> roll_no;
        cout<<"Enter name: ";
        cin>>name;
        cout << "Enter Date of Birth: ";
        cin >> birth;
        cout << "Enter Marks: ";
        cin >> marks;
    }

    int getRollNo()
    {
        return roll_no;
    }

    void display()
    {
        cout << "Roll no: " << roll_no << endl;
        cout<<"name : "<<name<<endl;
        cout << "Date of Birth: " << birth << endl;
        cout << "Marks: " << marks << endl;
    }
};

int main()
{

    int n;
    cout << "Enter number of students: ";
    cin >> n;

    Student *s1 = new Student[n];
    for (int i = 0; i < n; i++)
    {
        cout << "\nEnter  student  details " << i + 1 << ":\n";
        (s1 + i)->accept();
    }

    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (s1[j].getRollNo() > s1[j + 1].getRollNo())
            {
                Student temp = s1[j];
                s1[j] = s1[j + 1];
                s1[j + 1] = temp;
            }
        }
    }

    cout << "\n details" << endl;
    for (int i = 0; i < n; i++)
    {
        (s1 + i)->display();
    }
    delete[] s1;
}