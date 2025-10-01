#include<iostream>
using namespace std;
class Item
{
    int itemid;
    char item_name[15];
    float price;
    int stock_quantity;
    public:
    void accept();
    void display();
};
void Item ::accept()
{
    cout<<"Enter item id"<<endl;
    cin>>itemid;
    cout<<"Enter item name"<<endl;
    cin>>item_name;
    cout<<"Enter price"<<endl;
    cin>>price;
    cout<<"Enter stock quantity"<<endl;
    cin>>stock_quantity;
}
void Item::display()
{
    cout<<"Item id = "<<itemid<<endl;
    cout<<"Item name is "<<item_name<<endl;
    cout<<" item price is "<<price<<endl;
    cout<<"Item quantity ="<<stock_quantity<<endl;  
}


class Bill:public Item
{
    int bill_id;
    char customer_name[20];
    int purchased_item;
    public:
    void display1();
    void accept1();
};
 int n;
void Bill::accept1()
{
    Item::accept();
    cout<<" Enter Bill id"<<endl;
    cin>>bill_id;
    cout<<"Enter Customer Name"<<endl;
    cin>>customer_name;
   
    cout<<"Enter the number of items"<<endl;
    cin>>n;
    for(int i=0;i<n;i++)
    {
    cout<<"Enter Purchased item "<<endl;
    cin>>purchased_item;
    }
}

void Bill:: display1()
{
    Item::display();
    cout<<"Bill id ="<<bill_id<<endl;
    cout<<"Customer name is "<<customer_name<<endl;
    cout<<"list of Purchased Item is "<<purchased_item;

    

}
int main()
{
    Bill b1;
    b1.accept1();
    b1.display1();
}