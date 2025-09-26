#include<iostream>
using namespace std;
// static polymorphism also known as compile time polymorphism
// achieved by function overloading and operator overloading
void print(int i)
{
    cout<<"printing int: "<<i<<endl;

}
 
void print(double d)
{
    cout<<"printing double: "<<d<<endl;

}
void print(char c)
{
    cout<<"printing char: "<<c<<endl;

}

int main()
{
    print(1);
    print('h');
    print(15.7);
    return 0;
}

/*here function 'print' is overloaded for different data types*/