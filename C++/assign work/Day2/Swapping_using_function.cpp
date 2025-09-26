#include<iostream>
using namespace std;
class Swapvalue
{
 int a=10, b=20;
 public:
 void swap(int,int);

};
void Swapvalue::swap(int p,int q)
{    
    cout<<"Before Swapping"<<endl;
    cout<<p<<"\t"<<q<<endl;
    cout<<"swapping in swap function"<<endl;
    p=p-q;
    q=p+q;
    p=q-p;
    cout<<p<<"\t"<<q;
}
int main()
{
    Swapvalue s1;
    s1.swap(10,20);
}
