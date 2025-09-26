#include<iostream>
using namespace std;
int main()
{
    int a= ~5;//0101
    cout<<a<<endl;//Output: -6 (in 32 bit system 11111111111111111111111111111010)
    /*In binary representation, the bitwise NOT operation (~) inverts each bit of the number.
      For example, the binary representation of 5 is 00000000000000000000000000000101.
      The bitwise NOT operation inverts the bits, resulting in 11111111111111111111111111111010,
      which is -6 in decimal (two's complement representation).
    */













}