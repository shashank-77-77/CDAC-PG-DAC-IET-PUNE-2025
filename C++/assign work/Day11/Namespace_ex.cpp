#include<iostream>
using namespace std;
namespace First
{
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
int main()
{
    First::function();
    Second::function();
}