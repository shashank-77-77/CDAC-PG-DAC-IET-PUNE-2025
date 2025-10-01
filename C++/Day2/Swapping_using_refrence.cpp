#include<iostream>
using namespace std;
void Swap(int&,int&);
int main()
{
    int a=10,b=20;
    Swap(a,b);
    cout<<"Swapping in main Function"<<endl;
    cout<<a<<"\t"<<b<<endl;
}
void Swap(int &p,int &q)
{
    cout<<"Before swapping"<<endl;
    cout<<p<<"\t"<<q<<endl;
    cout<<"After swapping in swap function"<<endl;
    int temp=p;
    p=q;
    q=temp;
    cout<<p<<"\t"<<q<<endl;
}