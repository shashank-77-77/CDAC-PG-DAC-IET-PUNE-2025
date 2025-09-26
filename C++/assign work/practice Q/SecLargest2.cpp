#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter the size of array"<<endl;
    cin>>num;
    cout<<"enter the array elements"<<endl;
    int* ptr = new int[num];
    for(int i = 0;i <num;i++){
        cin>>*(ptr+i);
    }
    int largest = *(ptr+0),seclargest;
    for(int i = 0;i<num;i++){
        if(*(ptr+i)>=largest){
            seclargest = largest;
            largest = *(ptr+i);
        }
    }
    cout<<"Second largest number : "<<seclargest;
}