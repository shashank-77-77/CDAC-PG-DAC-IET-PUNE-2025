#include<iostream>
using namespace std;
class Test
{
    private:
    int private_num;
    protected:
    int protected_num;
    public:
    Test()
    {
        private_num=78;
        protected_num=90;

    }
    friend class Friend1;
};

class Friend1
{
    public:
        void display(Test& t)
        {
            cout<<"private number is "<<t.private_num<<endl;
            cout<<"protected number is "<<t.private_num<<endl;
        }
};
int main()
{
    Test t1;
    Friend1 f1;
    f1.display(t1);
    return 0;
}