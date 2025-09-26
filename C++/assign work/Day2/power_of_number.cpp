#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int s=2;

    int n;
    cout<<"Enter power number"<<endl;
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        s=s*s;
       
    }
    cout<<"power of number is "<<s<<endl;
    int a,b,p;
    a=3;
    b=4;
    p=pow(a,b);
    cout<<"power is "<<p;
}