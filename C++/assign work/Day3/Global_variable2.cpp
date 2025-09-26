#include<iostream>
using namespace std;
void show();
int y=10;
int main()
{
    cout<<y<<endl;
    y++;
    show();
    cout<<y<<endl;
}
void show()
{
    cout<<y<<endl;
    y=0;
    cout<<y<<endl;
    y++;
    cout<<y<<endl;
}