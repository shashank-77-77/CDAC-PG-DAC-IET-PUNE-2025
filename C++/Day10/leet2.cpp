#include<iostream>
using namespace std;
class Solution {
public:
    int findClosest(int x, int y, int z) 
    {
        x=x-z;
        y=y-z;
        if(x>y){
            return 1;
        }else if(x<y){
            return 2;
        }else if(x==y){
            return 0;
        }
    }
   
};
int main()
{
    Solution s1;
    cout<<s1.findClosest(2,7,4);
}