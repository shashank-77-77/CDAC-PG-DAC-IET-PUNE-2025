#include<iostream>
using namespace std;
static int count=0;
class Test1
{
    public:
    Test1()
    {
        count++;
        cout<<"No of object is created "<<count<<endl;
    }
    ~Test1()
    {
        cout<<"No of destructor is called"<<count<<endl;
        count--;
    }
};
int main()
{
    Test1 t1,t2,t3,t4,t5;
    
}