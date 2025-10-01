#include<iostream>
using namespace std;
class A
{
int c;
public:
	int a;
protected:
	int b;
protected:
	void display()
	{
		cout<<"in display of A\n";
	}

};
class B:protected A
{
public:
	int d;
	public:
	void show()
	{
	    	B bobj;
	bobj.display();
		cout<<"a= "<<a<<" b= "<<b;
	
	}
};

int main()
{
    B bobj;
    bobj.show();
}