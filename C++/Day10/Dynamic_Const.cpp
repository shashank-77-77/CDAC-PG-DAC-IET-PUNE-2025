#include<iostream>
using namespace std;
class Test
{
    int *t1;
    public:
    Test();
    void display();
};
Test::Test()
{
    t1=new int;
    *t1=20;
}
void Test::display()
{
    cout<<*t1<<endl;
}
int main()
{
    Test t2;
    t2.display();
}