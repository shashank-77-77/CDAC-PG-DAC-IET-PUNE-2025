#include<iostream>
using namespace std;
int main()
{
    int n,i;
    cout<<"Enter number of elements"<<endl;
    cin>>n;
    int *ptr=new int[n];
    cout<<"Accept elements"<<endl;
    for(i=0;i<n;i++)
    {
        cin>>ptr[i];
    }
    cout<<"Display Elements"<<endl;
    for(i=0;i<n;i++)
    {
        cout<<ptr[i]<<"\t";
    }
    delete[]ptr;
}

