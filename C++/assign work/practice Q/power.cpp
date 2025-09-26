#include<iostream>
using namespace std;
int main()
{
    int base,power,pow=1;
    cout<<"Enter the Base\n";
    cin>>base;
    cout<<"Enter the power\n";
    cin>>power;
    for (int i =1; i<=power; i++)
    {
        pow= pow*base;//first the pow is 1 from the global variable then it turns into pow*base and stores the new value in pow and again in next loop stores a new value
    }
    cout<<"Power "<<pow;


}