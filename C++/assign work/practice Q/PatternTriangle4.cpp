#include<iostream>
using namespace std;
void triangle(int row){
    
    for(int i=row;i>=0;i--){
        for(int j=0;j<row-i;j++){
            cout<<"  ";
        }
        for(int j=1;j<=(i*2)+1;j++){
            cout<<"* ";
        }
        cout<<endl;
    }
}
int main(){
    int row;
    cout<<"Enter row "<<endl;
    cin>>row;
    triangle(row);
}