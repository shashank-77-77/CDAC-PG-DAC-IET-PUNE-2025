#include<iostream>
using namespace std;
#include<string.h>
int main()
{
    char ch[10]="soham";
    char ch1[10]="shelar";
    strcpy(ch,ch1);
    cout<<"ch1 is copied to ch "<<ch;
}