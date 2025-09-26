#include<iostream>
using namespace std;
int main()
{

  int a,b;
  cout<<"Enter two numbers to assign to a and b respectively: ";
  cin>>a>>b;  
  cout<<"the value of a is: "<<a<<endl;
  cout<<"the value of b is: "<<b<<endl;
  b=a+b;
  a=b-a;
  b=b-a;
  cout<<"After swapping the value of a is: "<<a<<endl;
  cout<<"After swapping the value of b is: "<<b<<endl;
  
  
  return 0;

}