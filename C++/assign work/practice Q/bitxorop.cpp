#include<iostream>
using namespace std;
int main()
{

int a = 5;   // 0101
int b = 3;   // 0011
cout << (a ^ b) << endl; // Output: 6 (0110)
/*bit by bit number check karega aur 2 bits same rahe to 0 lega aur 2 numbers different rahe to 1 lega*/

cout << (12 ^ 10) << endl; // Output: 6 (1100 ^ 1010 = 0110)
cout << (7 ^ 4) << endl; // Output: 3 (0111 ^ 0100 = 0011)
cout << (15 ^ 8) << endl; // Output: 7 (1111 ^ 1000 = 0111)

}