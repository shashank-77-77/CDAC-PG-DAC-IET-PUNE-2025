#include<iostream>
using namespace std;
int main()
{
    int a='A';
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<" "<<(char)a;
            a++;
        }
        cout<<"\n";
    }
}