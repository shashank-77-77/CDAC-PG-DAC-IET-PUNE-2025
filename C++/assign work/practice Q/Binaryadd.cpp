#include <iostream>

using namespace std;

int main ()
{
    int a, b, c, m,n,o,p,q,r,s,t;
    cout<<"Enter first number: ";
    cin>> a;
    cout<<"Enter second number: ";
    cin>> b;
    c=a+b;

    m=c%2;
    n=(c/2)%2;
    o=((c/2)/2)%2;
    p=(((c/2)/2)/2)%2;
    q=((((c/2)/2)/2)/2)%2;
    r=(((((c/2)/2)/2)/2)/2)%2;
    s=((((((c/2)/2)/2)/2)/2)/2)%2;
    t=(((((((c/2)/2)/2)/2)/2)/2)/2)%2;
    cout<<t<<s<<r<<q<<p<<o<<n<<m;
    return 0;

    
}