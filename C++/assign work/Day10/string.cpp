#include<iostream>
using namespace std;

string addBinary(string str1,string str2){
    string res = "";
    int carry = 0;

    int a = str1.length() - 1;
    int b = str2.length() -1;

    while(a>=0||b>=0||carry!=0)
    {
        int sum = carry;
        if (a>=0)
        {
            /*
            '1' - '0' = 49 - 48 = 1
            '0' - '0' = 48 - 48 = 0
            */
            sum+=str1[a--] - '0'; 
        }
        if (b>=0)
        {
            sum+=str2[b--] - '0';
        }

        char bit = (sum%2)+'0';
        res = bit+res;
        carry=sum/2;
    }
    return res;

}

int main(){
    string str1;
    string str2;
    cout<<"Enter str1: ";
    cin>>str1;
    cout<<"Enter str2: ";
    cin>>str2;
    cout<<addBinary(str1,str2);
}