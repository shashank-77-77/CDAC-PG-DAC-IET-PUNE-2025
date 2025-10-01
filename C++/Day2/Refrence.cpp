#include<iostream>
using namespace std;
int main()
{
    int a=20;
    int &a_new=a;
    cout<<"refrence variable value= "<<a_new<<endl;
    cout<<"actual variable value= "<<a<<endl;
    cout<<"a_new address = "<<&a_new <<"\t"<<"address of a= "<<&a<<endl;
}