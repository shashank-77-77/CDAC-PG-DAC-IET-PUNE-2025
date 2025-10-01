#include<iostream>
using namespace std;
int main()
{
    int a[5],b[10];
    cout<<"Enter array elements "<<endl;
    for(int i=0;i<=4;i++)
    {
        cin>>a[i]; //*(a+i)
    }
    for(int i=0;i<=4;i++)
    {
        b[i]=a[i]; //*(b+i)=*(a+i);
    }
    cout<<"After copy"<<endl;
    for(int i=0;i<=4;i++)
    {
        cout<<b[i]<<"\t";
    }
}