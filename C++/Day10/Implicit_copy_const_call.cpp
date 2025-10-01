#include<iostream>
using namespace std;
class Example
{
    int id;
    public:
    void init(int x)
    {
        id=x;
    }
    void display()
    {
        cout<<"ID ="<<id<<endl;
    }
};
int main()
{
    Example e1;
    e1.init(20);
    e1.display();

    Example e2(e1);
    e2.display();
    return 0;
}