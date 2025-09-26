#include<iostream>
using namespace std;
void user_strcat(char *,char*);
int main()
{
    char str1[20]="hello";
    char str2[20]="bye";
    user_strcat(str1,str2);
    cout<<"concatinated string is "<<str1;
}
void user_strcat(char *s1,char *s2)
{
    while(*s1 !='\0')
    {
        *s1++;
    }
    while(*s2 != '\0')
    {
        *s1=*s2;
        s1++;
        s2++;
    }
    *s1='\0';
}