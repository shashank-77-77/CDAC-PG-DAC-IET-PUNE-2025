#include<iostream>
using namespace std;
void sum(){
    int a=100;
    cout<<a<<endl;
    }
int main()
{
    int a=5, b=10;
    
    cout<<"Value of a = "<<a<<endl;
    a=664;
    cout<<"another one = "<<a<<endl;
    cout<<"Value of b = "<<b<<endl;
    



    sum();
    cout<<a;
/*Value of a = 5
another one = 664
Value of b = 10
100
664*/
/*Local variable takes preceedences than global variable   */

}