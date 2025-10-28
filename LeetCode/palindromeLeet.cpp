#include<iostream>
using namespace std;
class Solution {
public:
    bool isPalindrome(int x) {
        int org=x;
        int rev=0,rem;
        while(x != 0)
        {
            rem=x%10;
            rev= rev * 10 + rem;
            x=x/10;
        }

        if(rev == org)
        {
            return true;   
        }
        else
        {
           return false;
        }
    return rev;
    }
    
};
int main()
{
    Solution s1;
    cout<<s1.isPalindrome(121);
}