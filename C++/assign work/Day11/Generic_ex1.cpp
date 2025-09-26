#include<iostream>
using namespace std;
template <class A>
A add(A &x,A &y)
{
    A result=x+y;
    return result;
}
int main()
{
    int i=2;
    int j=3;
    float s=3.4f;
    float s1=5.4f;
    cout<<"Addition of i and j is "<<add(i,j)<<endl;
    cout<<"Addition of s and s1 is "<<add(s,s1)<<endl;
}