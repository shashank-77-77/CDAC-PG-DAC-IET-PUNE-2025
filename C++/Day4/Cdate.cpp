#include<iostream>
using namespace std;
class Cdate
{
     int dd,mm,yy;
     public:
     void accept();
     void display();
     void setDd(int);
     int getDd();
};
void Cdate::accept()
{
    cout <<"Enter date"<<endl;
    cin>>dd>>mm>>yy;
}
void Cdate::display()
{
    cout<<"date is "<<dd<<"/"<<mm<<"/"<<yy<<endl;
}
void Cdate::setDd(int d)
{
    dd=d;
}
int Cdate::getDd()
{
    return dd;
}
int main()
{
    Cdate c1;
    c1.accept();
    c1.display();
    c1.setDd(22);
    c1.display();
    cout<<"date part is "<<c1.getDd()<<endl;
}