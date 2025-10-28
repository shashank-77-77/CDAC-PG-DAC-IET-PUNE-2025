#include<iostream>
using namespace std;
class Solution {
public:
    int fib(int n) {
        int n1=0;
        int n2=1;
        int next;
        cout<<n1<<" "<<n2<<" ";
        for(int i =2 ;i < n ;i++)
        {
            next=n1+n2;
            n1=n2;
            n2=next;
            cout<<next<<" ";
        }
        
    }
};
int main()
{
    Solution s1;
    s1.fib(6);
}