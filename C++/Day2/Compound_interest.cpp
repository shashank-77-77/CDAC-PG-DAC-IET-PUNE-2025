#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int p,r,n;
    float c;
    cout<<"Enter value of p"<<endl;
    cin>>p;
    cout<<"Enter value of r"<<endl;
    cin>>r;
    cout<<"Enter value of n"<<endl;
    cin>>n;
    c=p*pow((1+r/100.0),n);
    cout<<"Compound interest is "<<c<<endl;
}