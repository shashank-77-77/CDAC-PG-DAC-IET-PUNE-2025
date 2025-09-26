#include<iostream>
using namespace std;
int main()
{
    int arr[5];
    int *arr1[5];
    for(int i=0;i<5;i++)
    {
        cout<<"Enter number  for "<<i<<"location"<<endl;
        cin>>arr[i];
    }
    for(int i=0;i<5;i++)
    {
        arr1[i]=&arr[i];
    }
    cout<<"Display values"<<endl;
    for(int i=0;i<5;i++)
    {
        cout<<*arr1[i]<<endl;

    }
    cout<<"size of arr is "<<sizeof(arr)<<endl;
    cout<<"size of arr1 is "<<sizeof(arr1)<<endl;
}