#include<iostream>
using namespace std;
class A
{
    int c;
    public:
    int a;
    protected:
    int b;
    public:
        void display()
        {
            cout<<"In display function of class A"<<endl;
        }
};
class B:private A
{
    public :
        int c;
        void show()
        {
            display();
            cout<<"a= "<<a<<"  b= "<<b;
        }
};
class C:private B
{
    public:
    void show()
    {
        cout<<c<<endl;
    }

};
int main()
{
    B obj;
    obj.show();
}