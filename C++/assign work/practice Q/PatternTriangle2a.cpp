#include<iostream>
using namespace std;
void triangle(int row){
    
    for(int i=0;i<=row;i++){
        int flag = 0;
        int num = i+1;
        for(int j=0;j<row-i;j++){
            cout<<"  ";
        }
        
        for(int j=1;j<=(i*2)+1;j++){
            num = j;
            cout<<num<<" ";
            num++;
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