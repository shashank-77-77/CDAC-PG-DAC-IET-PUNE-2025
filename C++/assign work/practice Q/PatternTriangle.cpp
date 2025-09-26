#include<iostream>
using namespace std;
void triangle(int row,int col){
    char ch = 'A';
    for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
            cout<<ch<<"\t";
        }
        ch++;
        cout<<endl;
    }
}
int main(){
    int row,col;
    cout<<"Enter row and column"<<endl;
    cin>>row>>col;
    triangle(row,col);
}