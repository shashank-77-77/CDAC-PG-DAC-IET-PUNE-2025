#include<iostream>
using namespace std;

namespace First
{
    void function()
    {
        cout<<"In First function "<<endl;
    }
    namespace Second
    {
        void function()
        {
            cout<<"In second function"<<endl;
        }
    }
}
using namespace First::Second;
int main()
{
    function();
}