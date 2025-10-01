#include<iostream>
using namespace std;
class A
{
	int c;
public:
	int a;
protected:
	int b;
public:
	void display()
	{
		cout<<"in display of A\n";
	}

};
class B:public A
{
public:
		public:
	void show()
	{
	    display();
		cout<<a<<b;
	}
};
class C:public B
{
	public:
	void show()
	{
		cout<<"a= "<<a<<"b= "<<b;
			}
};
int main()
{
	B bobj;
	bobj.show();
	bobj.display();
}