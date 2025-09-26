#include <iostream>
#include <string.h>
using namespace std;

class string1
{
private:
    int len;
    char *ptr;

public:
    string1();
    string1(char *s);
    ~string1();

    void display() const;
};

string1::string1()
{
    len = 1;
    ptr = new char[len + 1];
    ptr[0] = 'S';
    ptr[1] = '\0';
}

string1::string1(char *s)
{
    if (s)
    {
        len = strlen(s);
        ptr = new char[len + 1];
        strcpy(ptr, s);
    }
    
}


string1::~string1()
{
    cout<<"Destructor is called....."<<endl;
    if(ptr){
        delete []ptr;
        ptr=NULL;
    }
}

void string1::display() const
{
    if(len>1)
	{
			cout<<"length of character is "<<len<<endl;
			cout<<"string is "<<ptr<<endl;
	}
	else
	{
	cout<<"length of character is "<<len<<endl;
	cout<<"character is "<<*ptr<<endl;
	}
}

int main()
{

    string1 s1;
    s1.display();
    char name[20];
    cout<<"Enter name: ";
    cin>>name;
    string1 s2(name);
    s2.display();

    return 0;
}