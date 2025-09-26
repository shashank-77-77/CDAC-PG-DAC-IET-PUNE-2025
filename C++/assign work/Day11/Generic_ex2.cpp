#include<iostream>
using namespace std;
template<class A,class B>
B add(A &x, B &y)
{
    B ans=x+y;
    return ans;
}
int main()
{
    int a=10;
    float b=2.5;
    cout<<"Addition of a and b is "<<add(a,b);

}