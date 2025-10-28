#include<iostream>
using namespace std;
class Solution {
public:
    int reverse(int x) {
        int rem;
        int rev=0;
        while(x != 0)
        {
            rem=x%10;
            rev= rev * 10 + rem;
            x=x/10;

        }

        return rev;
    }
   
};
 int main()
    {
        Solution s1;
        cout<<s1.reverse(123);
    }