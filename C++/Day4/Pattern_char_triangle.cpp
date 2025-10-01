#include<iostream>
using namespace std;
int main()
{
    char a='A';
    for(int i=3;i>=0;i--)
    {
        for(int j=3;j>=i;j--)
        {
            cout<<"   ";
        }
        for(int j=0;j<=i-1;j++)
        {
            cout<<"  "<<a;
            a++;
        }
        for(int j=0;j<=i;j++)
        {
            cout<<"  "<<a;
            a++;
        }
        cout<<"\n";
    }

}