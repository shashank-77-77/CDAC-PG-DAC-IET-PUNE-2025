#include<iostream>
using namespace std;
int main()
{
    char a='A';
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<a;
            a++;
        }
        cout<<"\n";
    }
}
