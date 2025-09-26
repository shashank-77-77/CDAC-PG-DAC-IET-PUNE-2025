#include<iostream>
using namespace std;
int main(){
    int arr[3][3];
    cout<<"Enter array Elements"<<endl;
    for(int i = 0; i < 3; i++){
        for(int j=0;j<3;j++){
            cin>>*(*(arr+i)+j);
        }
    }
    int maxElement = *(*(arr+0)+0);
    for(int i = 0; i < 3; i++){

        for(int j=0;j<3;j++){
           if(maxElement < *(*(arr+i)+j)){
                maxElement = *(*(arr+i)+j);
           }
        }
        
    }
    cout<<"Max element is "<< maxElement;

}