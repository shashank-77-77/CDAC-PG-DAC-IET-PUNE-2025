#include<iostream>
using namespace std;
#include<string.h>
class Student
{
	int rollno;
	char name[10];
	float per;
	public:
		Student(int r,char* ptr,float p)
		{
			rollno=r;
			strcpy(name,ptr);
			per=p;			
		}
		void display()
		{
			cout<<"rollno  is  "<<rollno<<"name is "<<name<<"per is "<<per; 
		}
		
};
int main()
{
	Student s1(83,"Soham",67.42);
	s1.display();
	
}
