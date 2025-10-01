#include<iostream>
using namespace std;

class Circle
{
    private:
     double radius;
    public:
     double  area()
     {
        return 3.14 *radius*radius;
     }
};

int main()
{
    Circle c1;
    c1.radius=1.5; // compile time error 
    cout<<"Area is "<<c1.area()<<endl;

}