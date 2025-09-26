#include<iostream>
using namespace std;

int main(){
    int numerator,denominator;
    cin>>numerator>>denominator;
    try{
        if(denominator == 0)
        throw "Denominator cant be zero";
        else{
            cout<<"Division : "<<numerator/denominator<<endl;
        }
    }
    catch(const char* str){
        cout<<str;
    }
}