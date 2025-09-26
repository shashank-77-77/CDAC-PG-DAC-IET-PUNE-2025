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
    Demo operator++(int);
};
Demo Demo::operator++(int){
    Demo D3 = *this;
    this->a =a+1;
    this->b =b+1;
    return D3;
}

int main(){
    Demo D1(1,2);
    Demo D3 = D1++;
    cout<<"a = "<<D3.a<<endl<<"b = "<<D3.b<<endl;
    cout<<"a = "<<D1.a<<endl<<"b = "<<D1.b;

}