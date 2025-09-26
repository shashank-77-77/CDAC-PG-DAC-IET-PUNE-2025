#include <iostream>
using namespace std;

int main(){
    int i,j;
    int n=5;
    char c='A';
    cout<<"\n\n";
     for(i=0;i<n;i++){
        for(j=i;j<n;j++){
            cout<<" ";
           cout<<c<<"   ";
            c++;
        }
        cout<<endl;
    }
}