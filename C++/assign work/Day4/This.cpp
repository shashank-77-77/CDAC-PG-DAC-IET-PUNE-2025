#include<iostream>
using namespace std;
class test
{
    int a,b;  // var ins a n b
    public: // access spe
    void show(int a, int b) // fun passs para
    {
        this->a=a;   // this pointer poin to var
        this->b=b;  
    }
    void display()  // displaying 
    {
        cout<<a<<b;  // display op to console
}
};
int main() // main fun begins
{
	test t; // obj created
	t.show(10,20); // value passed 
	t.display();  // disp method call 
}