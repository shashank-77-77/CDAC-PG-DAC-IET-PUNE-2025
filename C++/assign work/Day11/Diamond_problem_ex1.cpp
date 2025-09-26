
#include<iostream>
using namespace std;
 class A
{
public:
	int a;
  A()  { cout << "A's default constructor called" << endl; }
 
};
 
class B: public A
{

public:
	int b;
  B()  { cout << "B's constructor called" << endl; }
  
};
 
class C:public A  
{
public:
	int c;
  C()
    { 
	cout << "C's default constructor called" << endl; 
	}
	
};
 class D:public C,public B  
{
public:
	int d;
	D()
	{
		cout << "D's default constructor called" << endl; 
	}
  
};
int main()
{
  A aobj;
  B bobj;
  C cobj;
  D dobj;
  cout<<sizeof(dobj);
}
