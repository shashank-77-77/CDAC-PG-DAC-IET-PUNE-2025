#include<iostream>
#include<string.h>
using namespace std;
class string1{
    int len;
    char* ptr;
    public:
    string1();
    string1(char* );
    void display();
    ~string1(){
        cout<<"destructor is called "<<endl;
        if(ptr)
        delete []ptr;
        ptr = NULL;
    }
};
string1::string1(){
    len = 1;
    ptr = new char(len);
    *ptr = 'S';
}
string1::string1(char* S ){
    len = strlen(S);
    ptr = new char[len+1];
    strcpy(ptr,S);
}

void string1::display(){
    if(len > 1 )
    {
        cout<<"Length if string is "<<len<<endl;
        cout<<"String is "<<ptr<<endl;
    }
    else{
        cout<<"Length if string is "<<len<<endl;
        cout<<"String is "<<*ptr<<endl;
    }
};
int main(){
    string1 s1;
    s1.display();
    char nam[50]; 
    cout<<"Ener: ";
     cin>>nam;
    string1 s2(nam);
    s2.display();
    
    // s1.~string1();
	// s2.~string1();
	// s3.~string1();
   // delete []s2;
}
