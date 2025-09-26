#include<iostream>
using namespace std;
class test
{
    int a,b;  // var insi
    public:  // access spe
    void show()  // func deff
    {
        a=10; b=20;  // val ini
     cout<<"obj add  "<<this<<endl;  
     cout<<"a"<<this->a<<endl;
     cout<<"a"<<this->b<<endl;   
    }
};
int main()
{
test t; // obj cre
cout<<&t<<endl; // add
t.show(); /// impli shows add
}