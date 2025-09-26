#include <iostream>
using namespace std;


int main() {
    
    int n, first, second;

    cout<<"Enter no. of elements in array: "<<endl;
    cin>>n;
    
    int arr[n];
    for(int i=0; i<n; i++)//accepting i in array

    {
        cin>>arr[i];
    }
    for(int i=0; i<n; i++)//for displaying i in array[i]
    {
        cout<<arr[i]<<'\t';
    }    
    
if (n<2)
{
    cout<<"Enter atleast 2 number to find 1st and 2nd largest number "<<endl;
    
}
for(int i=0; i<n; i++) 
    if (arr[i] > arr[i+1]) 
    {
        first = arr[i];
           
        
    }
    else{
        first=arr[i+1];
        cout<<first;
    }
        
        // else (arr[i]>arr[i+1]);
        // {first =arr[i+1];
        //     cout<<first;    



    


    
    return 0;
}