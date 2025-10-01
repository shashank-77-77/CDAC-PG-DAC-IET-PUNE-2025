#include<iostream>
using namespace std;
namespace First
{
    int a=24;
    void function()
    {
        cout<<"In first_namespace function"<<endl;
    }  
} 
namespace Second
{
    void function()
    {
        cout<<"In second_namespace function"<<endl;
    }
}
using namespace Second;
int main()
{
   function();
   //cout<<a;
}