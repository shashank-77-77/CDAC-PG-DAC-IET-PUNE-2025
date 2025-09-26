#include<iostream>
using namespace std;

class Emp
{

    private:
    int sal;
    public:
    Emp(int s)
    {sal =s;}
 friend void displaysal(Emp emp);

};
void displaysal (Emp emp);
{
    cout<<"salaery"<<emp.sal;
}

int main (){
    Emp myemp(5000);
    displaysal(myemp);
    return 0;
}