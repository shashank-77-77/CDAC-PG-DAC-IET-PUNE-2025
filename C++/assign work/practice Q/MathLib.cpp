#include<iostream>
#include<math.h>
using namespace std;
template <class L>
class Math{
    int a,b;
    public:
    double squrt(int a){
        double temp = sqrt(a);
        cout<<"Square Root is : "<<temp<<endl;
    }
    L Absolute(){
        cout<<"enter a number : "<<endl;
        cin>>a;
        L temp = abs(a);
        cout<<"Absolute value of a is : "<<temp<<endl;
        return temp;
    }
};
int main(){
    Math<int> m1;
    m1.squrt(-10);
    m1.Absolute();
    return 0;
}