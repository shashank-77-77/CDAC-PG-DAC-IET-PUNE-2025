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
    Test1 t1;
    cout<<&t1<<endl;
    Test1 t2 ;
    cout<<&t2<<endl;
    Test1 t3;
    cout<<&t3<<endl;
    Test1 t4;
    cout<<&t4<<endl;
    Test1 t5;
    cout<<&t5<<endl;
    
}