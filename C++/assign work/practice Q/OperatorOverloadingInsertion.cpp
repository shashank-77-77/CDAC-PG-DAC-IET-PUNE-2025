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
ostream& operator<<(ostream &out,Demo &obj){
    out<<"a = "<<obj.a<<endl;
    out<<"a = "<<obj.b<<endl;
    return out;
}
int main(){
    Demo D1(1,2);
    cout<<D1;
}