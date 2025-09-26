#include<iostream>
using namespace std;
int main()
{
    int a=2;
    int pow=3;
    int res=1;
    for(int i=0;i<=pow;i++)
    {
        res=res*a;
    }
    cout<<"power of number "<<a<<" is "<<res<<endl;
}