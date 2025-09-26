#include<iostream>
using namespace std;
#define MIN(a,b) (a<b) ? a:b;
int main(){
    int c,b;
    cout<<"Enter 1st number :"<<endl;
    cin>>c;
    cout<<"Enter 2nd number :"<<endl;
    cin>>b;
    int x = MIN(c,b);
    cout<<"Minimun no. is : "<<x<<endl;

}