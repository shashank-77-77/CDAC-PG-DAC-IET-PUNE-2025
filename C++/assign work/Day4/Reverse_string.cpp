#include <iostream>
#include <string.h> 
using namespace std;
void reverseString(char*); 
int main() 
{
    char str1[20];
    cout<<"Enter string"<<endl;
    cin>>str1;
    cout << "Original string: " << str1 <<endl;
    reverseString(str1);
    cout << "Reversed string: " << str1 <<endl;

    return 0;
}

void reverseString(char* str) 
{
    if (str == nullptr) 
    {
        return; 
    }

    char* a = str;
    char* b= str + strlen(str) - 1;
    

    while (a < b)
    {
        char temp = *a;
        *a = *b;
        *b = temp;
        a++;
        b--;
    }
}