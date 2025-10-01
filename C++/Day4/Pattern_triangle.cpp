#include<iostream>
using namespace std;
int main()
{
    for(int i=3;i>=0;i--)
    {
        for(int j=3;j>=i;j--)
        {
            cout<<"   ";
        }
        for(int j=0;j<=i-1;j++)
        {
            cout<<"  "<<i;
        }
        for(int j=0;j<=i;j++)
        {
            cout<<"  "<<i;
        }
        cout<<"\n";
    }
    
    
        
    

}