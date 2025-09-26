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
class Child : protected Base
{
    public:
        int getPovt()
        {
            return povt;
        }
        int getPub()
        {
            return pub;
        }
};
int main()
{
    Child c1;

    //cout<<"private = "<<c1.getPvt()<<endl;
    cout<<"private cannot be access"<<endl; 
    cout<<"protected = "<<c1.getPovt()<<endl;
    cout<<"public = "<<c1.getPub()<<endl;
}