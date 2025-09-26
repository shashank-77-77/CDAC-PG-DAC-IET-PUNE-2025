#include<iostream>
using namespace std;
class Parent
{
    protected:
    int id_protected;
};
class Child :public Parent
{
    public:
        void setId(int id)
        {
            id_protected=id;
        }
        void displayId()
        {
            cout<<"Id  is "<<id_protected<<endl;
        }
};
int main()
{
    Child c1;
    c1.setId(83);
    c1.displayId();
    
}