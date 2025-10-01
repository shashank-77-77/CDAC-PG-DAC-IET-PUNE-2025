#include <iostream>
using namespace std;

void user_strcat(char* s1, char* s2);

int main() {
    char str[10];
    char str1[10];

    cout << "Enter the first string : ";
    cin >> str;
    cout << "Enter the second string : ";
    cin >> str1;

    user_strcat(str, str1);
    cout << "Concatenated string: " << str << endl;

    return 0;
}

void user_strcat(char* s1, char* s2) {
 
    while (*s1 != '\0') {
        s1++;
    }


    while (*s2 != '\0') {
        *s1 = *s2; 
        s1++;     
        s2++;      
    }
    *s1 = '\0'; 
}
