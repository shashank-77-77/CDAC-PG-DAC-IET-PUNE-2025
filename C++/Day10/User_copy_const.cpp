#include<iostream>
using namespace std;
class Cdate
{
    int dd,mm,yy;
    public:
    void show();
    Cdate(int,int,int);
    Cdate(Cdate &);
};
Cdate::Cdate(int d,int m,int y)
{
    dd=d;
    mm=m;
    yy=y;
}
void Cdate::show()
{
    cout<<"Date is "<<dd<<"/"<<mm<<"/"<<yy<<endl;
}
Cdate::Cdate(Cdate & c1)
{
    this->dd=c1.dd;
    this->mm=c1.mm;
    this->yy=c1.yy;
}
int main()
{
    Cdate d1(01,9,2025);
    Cdate d2(d1);
    d1.show();
    d2.show();
    
}