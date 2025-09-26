#include<iostream>
using namespace std;
void butterFly(int n){
    for(int i = 0; i<n ;i++){
        for(int j = 0; j<=i;j++){
            cout<<"* ";
        }
        for(int j = 0; j<2*(n-i-1);j++){
            cout<<"  ";
        }

        for(int j = 0; j<=i;j++){
            cout<<"* ";
        }
        cout<<endl;
    }
    for(int i = 0; i<n-1 ;i++){
        for(int j = 0; j<n-i-1;j++){
            cout<<"* ";
        }
        for(int j = 0; j<=(i+i)+1;j++){
            cout<<"  ";
        }
        for(int j = 0; j<n-i-1;j++){
            cout<<"* ";
        }
        cout<<endl;
    }
}
int main(){
    int n;
    cout<<"enter the number : ";
    cin>>n;
    butterFly(n);
}