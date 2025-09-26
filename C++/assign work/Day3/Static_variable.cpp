#include<iostream>
using namespace std;
void show();
static int y=10;
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
    static int x=0;
    cout<<x<<endl;
    x++;
    cout<<y<<endl;
}