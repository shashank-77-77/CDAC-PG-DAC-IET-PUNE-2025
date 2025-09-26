#include<iostream>
using namespace std;
int main()
{
    int num;
    cout<<"Enter number :"<<endl;
    cin>>num;
    int count=0;
    for(int i=3;i<num;i++)
    {
        if(num%i==0)
        {
            count++;
        }
        break;
    }
    if(count==1)
    {
        cout<<"Number is not prime"<<endl;
    }
    else
    {
    cout<<"Number is prime";
    }
}
