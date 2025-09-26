#include<iostream>
#include<string.h>
using namespace std;
class Student{
    public:
    char name[50];
    Student(){
    }
    void conCat(char* src){
        strcat(name,src);
    }
    void accept(){
        cout<<"Enter the name"<<endl;
        char input[50];
        cin>>input;
        strcpy(name,input);
    }
    void display(){
        cout<<"Concatinated name is : "<<name<<endl;
    }
};
int main(){
    Student *ptr = new Student[2];
    for(int i = 0;i<2;i++){
        (ptr+i)->accept();
    }
    (ptr+0)->conCat((ptr+1)->name);
    (ptr+0)->display();
}