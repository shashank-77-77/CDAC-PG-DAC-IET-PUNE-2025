#include<iostream>
using namespace std;
 int binaryAddition(int a, int b){
    int result = 0;
    int carry = 0;
    int place = 1;
    while(a>0 || b>0 || carry>0){
        int bitA = a%10;
        int bitB = b%10;
        int sum = bitA + bitB + carry;
        int resultBit = sum % 2;
        carry = sum / 2;
        result += resultBit * place;
        place *= 10;
        a = a/10;
        b = b/10; 
    }
    return result;
 }
int main(){
    int a,b;
    cout<<"Enter 2 binary number"<<endl;
    cin>>a>>b;
    int result = binaryAddition(a,b);
    cout<<"Addition is "<<result;
}