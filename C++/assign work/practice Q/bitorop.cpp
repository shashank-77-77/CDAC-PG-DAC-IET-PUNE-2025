#include<iostream>
using namespace std;
int main()
{

int a = 5;   // 0101
int b = 3;   // 0011
cout << (a | b) << endl; // Output: 7 (0111) The bitwise OR operation (|) is a binary operation that takes two numbers, compares them bit by bit, and returns a new number where each bit is set (1) if at least one of the corresponding bits in either input number is set (1); otherwise, the bit is unset (0).
/*0000 0101 | 0000 0011 = 0000 0111*/
cout << (12 | 10) << endl; // Output: 14 (1100 | 1010 = 1110)
cout << (7 | 4) << endl; // Output: 7 (0111 | 0100 = 0111)
cout << (15 | 8) << endl; // Output: 15 (1111 | 1000 = 1111)

}