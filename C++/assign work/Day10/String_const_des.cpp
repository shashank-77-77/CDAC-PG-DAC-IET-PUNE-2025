#include<iostream>
#include<string.h>
using namespace std;
class String1
{
    int len;
    char *c1;
    public:
    String1();
    void display();
    String1(int,char);
    String1(char*);
   ~String1()
		{
			cout<<"destructor is called\n";
			if(c1)
			{
			delete[]c1;
			c1=NULL;
			}
		
		}
};
String1::String1()
{
    len=1;
    c1=new char[len];
    *c1='S';

}
String1::String1(char * s)
{
    len=strlen(s);
    c1=new char[len + 1];
    strcpy(c1,s);
}
String1::String1(int len ,char c)
{
    int i;
    this->len=len;
    c1=new char[len+1];
    for(i=0;i<len;i++)
    {
        c1[i]=c;    
    }
    c1[len]='\0';
}
void String1::display()
{
    if(len>1)
    {
        cout<<"Length of character is "<<len<<endl;
        cout<<"String is "<<c1<<endl;
    }
    else
    {
        cout<<"Length of character is "<<len<<endl;
        cout<<"Character is"<<*c1<<endl;
    }
}
int main()
{
    String1 s1;
    s1.display();
    String1 s2("Shashank");
    s2.display();
    String1 s3(30,'*');
    s3.display();
}