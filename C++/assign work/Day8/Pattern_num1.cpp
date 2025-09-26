#include<iostream>
using namespace std;
int main()
{
    for(int i=5;i>=0;i--)
    {
        for(int j=5;j>=i;j--)
        {
            cout<<i;
        }
        cout<<"\n";
    }
}