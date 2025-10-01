#include<iostream>
using namespace std;

class test{
    public:
    
     ~test(){
        cout<<"Destructor of test called"<<endl;

    }
};
class test1:public test{
    public:
    
    ~test1(){
        cout<<"Destructor of test1 called"<<endl;
    }
};

int main(){
    test1 ptr;
    
}