#include<iostream>
using namespace std;
class test3
{
    private:
    int pri_num;

    protected:
    int pro_num;
     
    public:
    test3()
{
    pri_num=55;
    pro_num=11; 

} 
  friend void Friendfunction(test3& );
};

void Friendfunction (test3& object)
{
    cout<< "private number"<<object.pri_num<<endl;
    cout<< "protected number"<<object.pro_num<<endl;

}
int main()
{
    test3 object1;
    Friendfunction(object1);

    return 0;
}
    





