#include<iostream>
using namespace std;
int Max(int arr[])
{
    int max=0;
    for(int i=0;i<5;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];     
        }   
    }
    return max;
}
int secMax(int arr[])
{
    int sec=0;
    int max=Max(arr);
    for(int i=0;i<5;i++)
    { 
        if(arr[i]>sec && arr[i] != max)
        {
            sec=arr[i];    
        }

    }
    return sec;
}
int main()
{
    int arr[5];
    cout<<"Enter array elements"<<endl;
    for(int i=0;i<5;i++)
    {
        cin>>arr[i];
    }
    int sec=secMax(arr);
    cout<<"Second max number is "<<sec;

}