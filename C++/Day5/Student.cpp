#include<iostream>
using namespace std;
class Student{
    int roll,mark;
    char name[10] ;
    public:
    void accept();
    void display();


};
void Student ::accept(){
    cout<<"Enter the Roll Number: ";
    cin>>roll;
    cout<<"Enter the Name of Student: ";
    cin>>name;
    cout<<"Enter the Mark of Students: ";
    cin>>mark;
}
void Student ::display(){
    cout<<"Student Roll No."<<endl;
    cout<<roll;
    cout<<endl;
    cout<<"Student  Name ."<<endl;
    cout<<name;
    cout<<endl;
    cout<<"Student Total Mark: "<<endl;
    cout<<mark;
    cout<<"***********************************************************";

}
int main(){
    int n,i;
    Student s[10];
    cout<<"Enter the Number of Student: ";
    cin>>n;
    for(i=0;i<n;i++){
        s[i].accept();
    }
     for(i=0;i<n;i++){
        s[i].display();
    }

}