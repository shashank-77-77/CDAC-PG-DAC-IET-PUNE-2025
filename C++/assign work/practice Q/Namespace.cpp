#include<iostream>
using namespace std;
namespace physic{
    int speed(int a, int b){
        int c = a/b;
        return c;
    }
}
using namespace physic;
int main(){
    cout<<speed(100,5);
}