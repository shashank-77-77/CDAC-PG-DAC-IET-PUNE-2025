#include<iostream>
using namespace std;

void pattern(int row,int col){
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            if(i==j || (i+j) == row+1)
                cout<<"* "; 
            else
                cout<<"  ";
        }
        cout<<endl;
    }
}
int main(){
    cout<<"Enter row and col"<<endl;
    int row,col;
    cin>>row>>col;
    pattern(row,col);
}