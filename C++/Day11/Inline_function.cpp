#include<iostream>
using namespace std;
inline int cube(int c)
{
    int c1=c*c*c;
    return c1;    
}
int main()
{
    cout<<"Cube of number is "<<cube(2)<<endl;
    return 0;
}