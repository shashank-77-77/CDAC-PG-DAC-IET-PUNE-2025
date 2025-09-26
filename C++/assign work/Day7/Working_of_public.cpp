#include<iostream>
using namespace std;
class Base
{
    private:
      int pvt=1;
    protected:
        int povt=2;
    public:
        int pub=3;
        int getPvt()
        {
            return pvt;
        }
};
class Child:public Base
{
    public:
    int getPovt()
    {
        return povt;
    }

};
int main()
{
    Child c1;
    cout<<"Private ="<<c1.getPvt()<<endl;
    cout<<"protected ="<<c1.getPovt()<<endl;
    cout<<"public ="<<c1.pub<<endl;
}