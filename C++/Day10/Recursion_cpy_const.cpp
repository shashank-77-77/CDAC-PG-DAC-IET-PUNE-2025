
#include<iostream>
using namespace std;
#include<string.h>
class string1
{
	int len;
	char *c1;
public:
	string1(char*);
	void stringdisplay();
	~string1();
    string1(string1&);

};
void string1::stringdisplay()
{
	cout<<"length is "<<len<<endl;
	cout<<"string is "<<c1<<endl;
}
string1::string1(char * ss1)
{
	len=strlen(ss1);
	c1=new char[len+1];
	strcpy(c1,ss1);
}
string1::~string1()
{
	cout<<"destructor is called "<<endl;
	if(c1)
	{
		cout<<"destructor is called 1"<<endl;
	delete [] c1;
	}
	cout<<"hello";
}
string1::string1(string1 & c)
{
	this->len=c.len;
	this->c1=new char[this->len+1];
	strcpy(this->c1,c.c1);
}
int main()
{	
	string1 c2("shashank");
	c2.stringdisplay();
	{	
	string1 c3(c2);
    }
	c2.stringdisplay();
}