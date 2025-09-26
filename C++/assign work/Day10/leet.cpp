#include <iostream>
using namespace std;
class Solution
{
public:
    int display()
    {
        int num[] = {11, 7, 2, 15};
        int target = 9;
        int res;
        int c1,c2;
        for (int i = 0; i < 3; i++)
        {
            c1++;
            for (int j = i + 1; j <= 3; j++)
            {
                c2++;
                res = num[i] + num[j];
                //cout << res << endl;

                if (res == target)
                {
                    cout<< i<<" "<<j;
                    break;
                }
                
            }
            
        }

    }
};
int main()
{
    Solution s1;
    s1.display();
}