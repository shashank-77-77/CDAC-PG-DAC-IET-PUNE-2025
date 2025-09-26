#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    char str1[10];
    cout<<"Enter string one"<<endl;
    cin>>str1;
    char str2[10];
    cout<<"Enter string two to concatinate"<<endl;
    cin>>str2;
    
    strcat(str1,str2);
    cout<<"concatinated string is "<<str1;
}