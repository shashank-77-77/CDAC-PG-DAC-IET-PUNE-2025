#include<iostream>
using namespace std;
class Demo{
    public:
    int a,b;
    Demo(){};
    Demo(int a,int b){
        this->a = a;
        this->b = b;
    }
    Demo operator-();
};
Demo Demo::operator-(){
    Demo D3;
    D3.a =-a;
    D3.b =-b;
    return D3;
}

int main(){
    Demo D1(1,2);
    Demo D3 = -D1;
    cout<<"a = "<<D3.a<<endl<<"b = "<<D3.b;
}