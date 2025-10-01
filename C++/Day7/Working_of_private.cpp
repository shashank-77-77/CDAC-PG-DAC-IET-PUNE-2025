#include<iostream>
using namespace std;
class Base
{
    private:
        int pvt=1;
    protected:
        int pro=2;
    public:
        int pub=3;
        int getPvt()
        {
            return pvt;
        }
};
class Child:private Base
{
    public:
        int getPro()
        {
            return pro;
        }
        int getPub()
        {
            return pub;
        }
};
int main()
{
    Child c1;
    //cout<<"private ="<<c1.getPvt()<<endl;
    cout<<"private cannot be accessed"<<endl;
    cout<<"protected ="<<c1.getPro()<<endl;
    cout<<"public ="<<c1.getPub()<<endl;
    return 0;
}