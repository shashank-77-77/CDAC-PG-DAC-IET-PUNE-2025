#include<iostream>
using namespace std;

class cdate
{
    int dd,mm,yy;
     public:
/*public:
This keyword starts the public section. Members declared 
after public: can be used from outside the class. 
Public functions are the interface other code uses to work with
the object.*//*By default (inside a class), these are private, which means code outside the class (like inside main) cannot access them directly.*/
   
    
    void accept();
    //Declares a public member function named accept that takes no arguments and returns nothing (void). The ; means "I'll define what it does later."
    
    void display();//Declares a public function display() that prints the date. Again, it's only a declaration here.

    void setdate(int);
    // Declares a public function setdate that takes one integer (the day) and returns nothing. The parameter name is omitted in this declaration — only the type is required here

    int getmm();
    // Declares a public function getmm() that returns an int — it will give you the month number.
};
void cdate :: accept()// Definitions
{
cout<<"Enter the Date "<<endl;
cin>>dd>>mm>>yy;
}
void cdate:: display() //
{
    cout<<dd<<"/"<<mm<<"/"<<yy<<"\n";
}
void cdate :: setdate(int day)
{
    dd= day;
}
int cdate:: getmm()
{
    return mm;
}
int main ()
{
    cdate d;
    d.accept();
    d.display();
    d.setdate(01);
    d.display();
    d.getmm();
    
    cout<<"The month is "<<d.getmm();


}