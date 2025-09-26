#include<iostream>
using namespace std;
int main()

{//initializing the variables
int a=4, b=5 ;
cout<<"Operators in C++:"<<endl;

// arithmetic operators
cout<<"The Value of a+b is "<<a+b<<endl;
cout<<"The Value of a-b is "<<a-b<<endl;
cout<<"The Value of a*b is "<<a*b<<endl;
cout<<"The Value of a/b is "<<a/b<<endl;
cout<<"The Value of b%a is "<<b%a<<endl;
cout<<"The Value of a++ is "<<a++<<endl;
cout<<"The Value of a-- is "<<a--<<endl;
cout<<"The Value of ++a is "<<++a<<endl;
cout<<"The Value of --a is "<<--a<<endl;

// assignment operators
// int a=3, b=0;
// char d= 'd'; '=' is the assign operator


// Comparison operator
cout<<"Comparison operators"<<endl;

cout<<"The Value of a==b is "<<(a==b)<<endl;
//a is not equal to b so it will return 0 since its false
cout<<"The Value of a!=b is "<<(a!=b)<<endl;
// a is less than b so it will return 1 since its true
cout<<"The Value of a>=b is "<<(a>=b)<<endl;
// a is less than b so it will return 0 since its false
cout<<"The Value of a<=b is "<<(a<=b)<<endl;
// a is less than b so it will return 1 since its true
cout<<"The Value of a<b is "<<(a<b)<<endl;
// a is less than b so it will return 1 since its true
cout<<"The Value of a>b is "<<(a>b)<<endl;
// a is not greater than b so it will return 0 since its false


// logical operators
cout<<"Logical operators"<<endl;
cout<<"The Value of (a<b) && (a>b) is "<<((a<b) && (a>b))<<endl;
// a is less than b so it will return 0 since its false if both the conditions are not true it will return false
cout<<"The Value of (a<b) || (b<a) is "<<((a<b) || (b<a))<<endl;
// a is less than b so it will return 1 since one of them is true
cout<<"The Value of !(a<b) is "<<(!(a<b))<<endl;
// a is less than b so it will return 0 since its false
return 0;


}  