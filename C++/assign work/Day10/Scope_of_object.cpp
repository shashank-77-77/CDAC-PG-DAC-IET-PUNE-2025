#include<iostream>
using namespace std;
class Test
{
    public:
    Test()
    {
        cout<<"constructor is invoked"<<endl;
    }
    ~Test()
    {
        cout<<"Destructor is invoked"<<endl;
    }
};
Test t1;
int main()
{
    cout<<"in main"<<endl;
    Test t2;
    {
        cout<<"in block"<<endl;
        Test t3;
        cout<<"end of block"<<endl;
    }
    cout<<"End of main"<<endl;
}