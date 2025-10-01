#include<iostream>
using namespace std;
#include<string.h>
 class String {
public:
    char* s1;
    int size;
 public:
    String(char*); // constructor
    ~String(); // destructor
};
 String::String(char* ch)
{
    size = strlen(ch);
    s1 = new char[size + 1];
    strcpy(s1, ch);
}
String::~String() { 
    cout<<"dest called";
    delete[] s1;
    cout<<s1;
    }
 
int main()
{
    String str("Hello, World!");
}