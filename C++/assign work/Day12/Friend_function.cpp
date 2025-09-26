#include<iostream>
using namespace std;
class Test2
{
    int a;
    public:
    int geta();
    friend void show(Test2&);

};
int Test2::geta()
{
    cout<<"Enter value of a "<<endl;
    cin>>a;

}
void show(Test2& obj1)
{
    cout<<"Function accessing private class data"<<obj1.a<<endl;
}
int main()
{
    Test2 t1;
    t1.geta();
    show(t1);
}
