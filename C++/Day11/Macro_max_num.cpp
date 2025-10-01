#include<iostream>
using namespace std;
#define MAX(a,b) (a>b) ? a : b;
int main()
{
    int a,b;
    cout<<"Enter first number"<<endl;
    cin>>a;
    cout<<"Enter Second number "<<endl;
    cin>>b;
    int c=MAX(a,b);
    cout<<"Maximum number is "<<c<<endl;
}