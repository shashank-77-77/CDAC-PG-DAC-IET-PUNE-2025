#include<iostream>
using namespace std;

int main()
{


int a = 5;   // 0101
int b = 3;   // 0011
cout << (a & b) << endl; // Output: 1 (0001)
cout << (12 & 10) << endl; // Output: 8 (1100 & 1010 = 1000)
cout << (7 & 4) << endl; // Output: 4 (0111 & 0100 = 0100)
cout << (10 & 4) << endl; // Output: 0 (1010 & 0100 = 0000)

return 0;

}
/*& operator compares each corresponding bit of two numbers and returns a new number whose bits are set to 1 only where both input bits are 1. 0000 0101 & 0000 0011 = 0000 0001
0&0=0 1&0=0 1&1=1*/