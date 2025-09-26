#include<iostream>
using namespace std;
int main()
{
    int num,sum=0;
    int rem;
    cout<<"Enter number "<<endl;
    cin>>num;
    int org=num;
    while(num !=0)
    {
        rem=num %10;
        sum=sum+rem*rem*rem;
        num=num/10;
        
    }
    if(sum==org)
    {
        cout<<"Armstrong number is"<<sum;
    }
    else
    {
        cout<<"number is not a armstrong";
    }
    
}