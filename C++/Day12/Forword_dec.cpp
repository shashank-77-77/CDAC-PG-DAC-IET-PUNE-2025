#include<iostream>
using namespace std;
class B;
class A
{
	int a;
	public:
		void geta()
		{
			cout<<"enter value of a"<<endl;
			cin>>a;
		}
		friend void big(A&, B&);
};
 class B
{
	int b;
	public:
		void getb()
		{
			cout<<"enter value of b"<<endl;
			cin>>b;
		}
		friend void big(A&, B&);
};

void big(A& x,B& y)
{
	if(x.a>y.b)
	cout<<x.a<<"is greater"<<endl;
	if(x.a<y.b)
	cout<<y.b<<"is greater"<<endl;
	if(x.a == y.b)
    {
	cout<<"both are equal"<<endl;
    }
}
int main()
{
	A aobj;
	B bobj;
	aobj.geta();
	bobj.getb();
	big(aobj,bobj);	
}
