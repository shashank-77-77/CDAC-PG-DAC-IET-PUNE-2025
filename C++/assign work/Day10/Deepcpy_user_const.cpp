
#include<iostream>
using namespace std;
#include<string.h>
class string3
{
	int len;
	char *c1;
public:
	string3(char*);
	void stringdisplay();
	~string3();
	string3(string3&);
};
void string3::stringdisplay()
{
	cout<<"length is "<<len<<endl;
	cout<<"string is "<<c1<<endl;
}
string3::string3(char * ss1)
{
	len=strlen(ss1);
	c1=new char[len+1];
	strcpy(c1,ss1);
}
string3::~string3()
{
	cout<<"destructor is called"<<endl;
	if(c1)
	{
		cout<<"destructor is called 1"<<endl;
	    delete [] c1;
	}
	cout<<"hello"<<endl;
}
string3::string3(string3 & c)
{
	this->len=c.len;
	this->c1=new char[this->len+1];
	strcpy(this->c1,c.c1);
}
int main()
{	
	string3 c2("soham");
	c2.stringdisplay();
	string3 c3(c2);
	c3.stringdisplay();
}