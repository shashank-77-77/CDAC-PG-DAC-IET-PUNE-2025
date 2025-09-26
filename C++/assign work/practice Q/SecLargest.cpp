#include<iostream>
using namespace std; 
 int main(){
 int arr[3][3];
 cout<<"Enter array Elements"<<endl;
   for(int i=0;i<3;i++)
      for(int j=0;j<3;j++){
        cin>>arr[i][j];
    }
    int secLargest,largest = arr[0][0];
    for(int i=0;i<3;i++)
      for(int j=0;j<3;j++){
        if(largest <= arr[i][j]){
            secLargest = largest;
            largest = arr[i][j];
        }
    }
    cout<<"SEC LArgest = "<<secLargest<<endl;
}