#include <iostream>
using namespace std;

int main(){
    int i,j;
    int n=10;
    for(i=0;i<n;i++){
        for(j=i;j<n;j++){
            cout<<"*";
        }
        cout<<endl;
    }
}