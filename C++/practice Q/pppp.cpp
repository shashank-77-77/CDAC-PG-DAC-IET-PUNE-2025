#include<iostream>

#include <vector>

#include<fstream>

using namespace std;

class Item{

int itemID;

string itemName;

double price;

int stockQuantity;



public:

Item(int id=0,string name="",double p=0.0,int q=0){

    if(p<0.0||q<0){

        throw invalid_argument("Price or quantity cant be negative");

    }

    itemID=id;

    itemName=name;

    price=p;

    stockQuantity=q;

}



int getId(){

    return itemID;

}

string getName(){

    return itemName;

}

double getPrice(){

    return price;

}

int getStock(){

    return stockQuantity;

}



void reduceStock(int qty){

    if(qty>stockQuantity){

        throw runtime_error("Not Enough Stock Available");

    }

    stockQuantity = stockQuantity - qty;

}

};

struct Purchase

{

    int itemID;

    string itemName;

    double price;

    int quantity;

};

class Bill{

int billID;

string customerName;

vector<Purchase> items;

double total = 0.0;



public:

Bill(int id=0,string name=""){

    billID=id;

    customerName=name;

}

 Bill& operator+(Purchase& p){

    items.push_back(p);

    total= total+p.price*p.quantity;

    return *this;

 }



 friend ostream& operator<<(ostream &out, Bill &b){

    if(b.items.empty()){

        throw runtime_error("Bill is Empty!!!");

    }

    out<<"\n============Bill #"<<b.billID<<" ======\n";

    out<<"Customer: "<<b.customerName<<"\n";

    out<<"-------------------------------"<<endl;



    for(auto &p: b.items){

        out<<p.itemName<<" x "<<p.quantity

            <<" = "<<p.price*p.quantity<<endl;

    }

    out<<"---------------------------------"<<endl;

    out<<"Total: "<<b.total<<"\n";

    return out;

 }



 void saveToFile(){

    if(items.empty()){

        throw runtime_error("Cannot Save Empty Bill!!");

    }

    ofstream fout("bill.txt",ios::app);

    fout<<"Bill #"<<billID<<" | "<<customerName<<" | Total: "<<total<<endl;

    fout.close();

 }

};

int main(){

try{

    //Inventory

    vector<Item>inventory={

        Item(1,"USB Cable",200,10),

        Item(2,"Mouse",500,5),

        Item(3,"Keyboard",800,3)

    };



    Bill b1(101,"John");

    cout<<"Available Items: "<<endl;

    for(auto &it: inventory){

        cout<<it.getId()<<". "<<it.getName()

            <<" (Price: "<<it.getPrice()

            <<", Stock: "<<it.getStock()<<")\n";

    }



    int id,qty;

    cout<<"Enter Item ID To Buy: ";

    cin>>id;

    cout<<"Enter Quantity: ";

    cin>>qty;



    for(auto &it:inventory){

        if(it.getId()==id){

            it.reduceStock(qty);

            Purchase p{

                it.getId(),it.getName(),it.getPrice(),qty

            };

            b1+p;

        }

    }



    cout<<b1;

    b1.saveToFile();

    cout<<"Bill saved to File."<<endl;

}

catch(exception &e){

    cout<<"Error: "<<e.what()<<endl;

}
return 0;
}

//explanation line by line in simplest way