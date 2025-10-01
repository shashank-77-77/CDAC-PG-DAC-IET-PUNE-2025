#include<iostream>
using namespace std;
#include<string.h>
class String2
{
    int len;
    char* c1;
    public:
    String2();
    String2(char*);
    String2(int , char);
    String2(int);
    void display();
    ~String2()
		{
			cout<<"destructor is called\n";
			if(c1)
			{
			
			delete[]c1;
		    c1=NULL;
			}
		
		}
};
String2::String2()
{
    len=1;
    c1=new char[len];
    *c1='A';
    
}
String2::String2(char * s)
{
    len=strlen(s);
    c1=new char[len+1];
    strcpy(c1,s);

}
String2::String2(int len, char c)
{
    int i;
    this-> len = len;
    c1=new char[len+1];
    for(i=0;i<len;i++)
    {
        c1[i]=c;
    }
    c1[i]='\0';

}
String2::String2(int l)
{
    len=l;
    c1=new char[len+1];
    cout<<"Enter String"<<endl;
    cin>>c1;
}
void String2::display()
{
    if(len>1)
    {
        cout<<"length is "<<len<<endl;
        cout<<"String is "<<c1<<endl;

    }
    else
    {
        cout<<"Length is "<<len<<endl;
        cout<<"Character is "<<*c1<<endl;
    }

}
int main()
{
    String2 s1;
    s1.display();
    String2 s2(20,'A');
    s2.display();
    String2 s3("Shashank Mankar");
    s3.display();
    String2 s4(7);
    s4.display();

}
