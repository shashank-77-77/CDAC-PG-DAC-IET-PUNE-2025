#include<iostream>
using namespace std;
class Overloading{
    public:
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
};
int main(){
    Overloading obj1;
    cout<<"Addition "<<obj1.add(10,20)<<endl;
    cout<<"Addition "<<obj1.add(10,20.0)<<endl;
}