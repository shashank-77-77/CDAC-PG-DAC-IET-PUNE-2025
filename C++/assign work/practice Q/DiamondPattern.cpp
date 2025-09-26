#include<iostream>
using namespace std;
void triangle(int row){
    
    for(int i=0;i<row;i++){
        char ch = 'A';
        for(int j=0;j<row-i;j++){
            cout<<"  ";
        }
        for(int j=1;j<=(i*2)+1;j++){
            cout<<ch<<" ";
            ch++;
        }
        cout<<endl;
    }
    int temp=row-1;
    for(int i=1;i<=row-1;i++){
        char ch = 'A';
        for(int j=0;j<=i;j++){
            cout<<"  ";
        }
        for(int j=1;j<=(temp*2)-1;j++){
            cout<<ch<<" ";
            ch++;
        }
        temp--;
        cout<<endl;
    }
}
int main(){
    int row;
    cout<<"Enter row "<<endl;
    cin>>row;
    triangle(row);
}