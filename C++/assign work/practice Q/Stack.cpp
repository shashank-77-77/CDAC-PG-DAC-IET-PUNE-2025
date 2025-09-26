#include<iostream>
#include<stack>
using namespace std;
int main(){
    stack<int> s;
    s.push(10);
    s.push(20);
    s.push(30);
    cout<<"size : "<<s.size()<<endl;
    while(s.size()){
        cout<<s.top()<<" ";
        s.pop();
    }
}