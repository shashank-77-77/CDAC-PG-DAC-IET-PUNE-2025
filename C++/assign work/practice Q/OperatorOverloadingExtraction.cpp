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
};
istream& operator>>(istream &in,Demo &obj){
    cout<<"Enter value of a and b "<<endl;
    in>>obj.a;
    in>>obj.b;
    return in;
}
int main(){
    Demo D1(1,2);
    cin>>D1;
    cout<<"a = "<<D1.a<<endl;
    cout<<"b = "<<D1.b<<endl;
    int a;
    cout<<"Enter value of a in main"<<endl;
    cin>>a;
}