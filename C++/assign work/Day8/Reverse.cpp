#include<iostream>
using namespace std;

int main()
{
    int num,sum=0,rev=0;
    cout<<"Enter number to reverse"<<endl;
    cin>>num;
    for(int i=0;i<=3;i++);
    {
        num=num%10;
        sum=sum+num;
        num=num/10;
        cout<<sum; 
    }
    
    
}