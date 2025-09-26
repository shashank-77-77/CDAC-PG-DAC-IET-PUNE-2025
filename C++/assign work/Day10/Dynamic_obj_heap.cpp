#include<iostream>
using namespace std;
class Cdate
{
    int dd,mm,yy;
    public:
    Cdate();
    Cdate(int,int,int);
    void display();

};
Cdate::Cdate()
{
    cout<<"in  default const of cdate "<<endl;
    dd=0;
    mm=0;
    yy=0;
}
Cdate::Cdate(int d,int m,int y)
{
    cout<<"in  para const of Cdate"<<endl;
    dd=d;
    mm=m;
    yy=y;
}
void Cdate :: display()
{
    cout<<"Date is "<<dd<<"/"<<mm<<"/"<<yy;
} 
int main()
{
    Cdate * c1=new Cdate(01,9,2025);
    c1->display();
    delete c1;

}