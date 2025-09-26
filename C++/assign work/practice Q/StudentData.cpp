#include<iostream>
#include<string.h>
using namespace std;
class Student{
    public:
    int rollNum,dD,mM,yY;
    float marks;
    Student(){
    }
    void accept(){
        cout<<"Enter the Roll Number"<<endl;
        cin>>rollNum;
        cout<<"Enter the BirthDate"<<endl;
        cin>>dD>>mM>>yY;
        cout<<"Enter the Marks"<<endl;
        cin>>marks;
    }
};
void sorted(Student* ptr, int n) {
    for (int i = 0; i < n - 1; ++i) {
        for (int j = i + 1; j < n; ++j) {
            if (ptr[i].rollNum > ptr[j].rollNum) {
                Student temp = ptr[i];
                ptr[i] = ptr[j];
                ptr[j] = temp;
            }
        }
    }
}
void display(Student* ptr, int n){
    cout<<"--------------------------------------------"<<endl;
    cout<<"Sorted student data is : "<<endl;
    for (int i = 0; i < n; ++i){
        cout<<"Roll number = "<<(ptr+i)->rollNum<<endl;
        cout<<"Date of birth = "<<(ptr+i)->dD<<"/"<<(ptr+i)->mM<<"/"<<(ptr+i)->yY<<endl;
        cout<<"Marks = "<<(ptr+i)->marks<<endl;
        cout<<"--------------------------------------------"<<endl;
    } 
}
int main(){
    cout<<"Enter the number of students "<<endl;
    int n;
    cin>>n;
    Student *ptr = new Student[n];
    for(int i = 0;i<n;i++){
        (ptr+i)->accept();
    }
    sorted(ptr,n);
    display(ptr,n);

    
}