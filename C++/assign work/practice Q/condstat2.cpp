#include<iostream>
using namespace std;
int main ()
{
    int age;
    cout<<"Enter your age"<<endl;
    cin>>age;

    if (age<0)
    cout<<"age cannot be cannot be zero or negative";
    else if (age<18)
    cout<<"You are not eligible For voting";
    else if (age>=18)
    cout<<"You are eligible";
    

}