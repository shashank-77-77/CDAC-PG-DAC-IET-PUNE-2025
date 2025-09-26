#include<iostream>
#include<fstream>
using namespace std;
class persone
{
    string name;
    public:
     virtual void display()=0;
     virtual void role()=0;
     void setname(string n)
     {
        name=n;
     }
     string getname()
     {
        return name;
     }
      
};
class student : public persone
{
    int RollNo,marks;
    string course;
    public:
      student(int r,string n,string c,int m )
      {
        RollNo=r;
        setname(n);
        course=c;
        marks=m;
      }
      virtual void display()override{
        cout<<"Roll NO :"<<RollNo<<endl;
        cout<<"Name : "<<getname()<<endl;
        cout<<"Course : "<<course<<endl;
        cout<<"marks : "<<marks<<endl;
      }
      virtual void role()
      {
        cout<<"Role : Student "<<endl;
      }

};

class faculty : public persone
{
    int EmployeID;
    string sunject;
     public:
      faculty(int id,string n,string s)
      {
        EmployeID=id;
        setname(n);
        sunject=s;
      }
      virtual void display()override{
        cout<<"ID :"<<EmployeID<<endl;
        cout<<"Name : "<<getname()<<endl;
        cout<<"Subject : "<<sunject<<endl;
      
      }
      virtual void role()
      {
        cout<<"Role : Faculty "<<endl;
      }
};
int main(){

    ofstream registerBook("Rsister.txt",ios::app);
    int choice;
    do{
        cout<<"1.student"<<endl;
        cout<<"2.Faculty"<<endl;
        cout<<"3.Exit"<<endl;
        if(choice==1)
        {
            int roll,marks;
            string name,course;
            cout<<"Enter Roll NO :"<<endl;
            cin>>roll;
            cout<<"Enter marks :"<<endl;
            cin>>marks;
            cin.ignore();
            

        }

    }while(choice!=3);
    
    registerBook.close();
    
}