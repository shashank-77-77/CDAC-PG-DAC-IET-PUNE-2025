#include<iostream>
using namespace std;
int main()
{
    int a='A';
    for(int i=5;i>=0;i--)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<" "<<(char)a;
            a++;
        }
        cout<<"\n";
    }
}