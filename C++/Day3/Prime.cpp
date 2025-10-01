#include<iostream>
using namespace std;
bool isPrime(int);
int main()
{
    int n;
    cin>>n;

    bool prime = isPrime(n);
    if(prime)
    {
        cout<<"Number is Prime";
    }
    else
    {
        cout<<"number is not prime";
    }

}
bool isPrime(int num)
{
    for(int i=2; i<num; i++)
    {
        if(num % i==0)
        {
            return false;
        }
    }
    return true;
}
