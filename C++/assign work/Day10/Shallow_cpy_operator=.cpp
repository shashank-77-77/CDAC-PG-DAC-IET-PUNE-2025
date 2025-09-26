#include<iostream>
using namespace std;
#include<string.h>
class string1
{
	int len;
	char* c1;
	public:
		void display();
		string1(char*);
		~string1()
		{
			cout<<"destructor is called\n";
			if(c1)
			{
			
			delete[] c1;
			c1=NULL;
		}
		}
};

	void string1::display()
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

int main()
{
	string1 s1("abc");
	{
	
	string1 s2("axyz");
	s2=s1;
}
	s1.display();
	

}