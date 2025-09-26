#include<iostream>
#include<string.h>
#include<fstream>
using namespace std;
int n;
class Item{
    int itemID;
    int stockQuantity;
    char itemName[50];
    float price;
    public:
    Item(){};
    void setData(int itemID,int stockQuantity, char itemName[50],float price){
        this->itemID = itemID;
        strcpy(this->itemName,itemName);
        this->price = price;
        this->stockQuantity = stockQuantity;  
    }
    friend class Bill;
};
class Temp{
    public:
    Item arr[50];
    friend class Bill;
};
class Bill{
    int billID;
    static int index;
    char customerName[50];
    Item purchased[50];
    public:
    Bill(){};
    Bill(int billID,char customerName[50]){
        this->billID = billID;
        strcpy(this->customerName,customerName);
    }
    Bill operator+(const Temp& i1);

    ostream& operator<<(ostream& out){
        out<<"===================== Bill Details ========================"<<endl;
        out <<"Bill ID : "<< this->billID <<endl;
        out <<"Customer Name : "<< this->customerName<<endl;
        out<<"------------------- Item Details --------------------"<<endl;
        for(int i=0;i<n;i++){
            out <<"Item ID : " <<this->purchased[i].itemID<<endl;
            out <<"Item Name : "<<this->purchased[i].itemName<<endl;
            out <<"Item Quantity : "<<  this->purchased[i].stockQuantity<<endl;
            out <<"Total Cost : "<< (this->purchased[i].price)*(this->purchased[i].stockQuantity)<<endl;
            out <<"==============================================="<<endl;
        }
        return out;
    }
    void saveTOFile(){
        ofstream my_file("Bill.txt" , ios::app);
        if(!my_file.is_open()){
            cout<<"Error : File not opened"<<endl;
        }
        else{
            my_file<<"Bill ID : "<<this->billID<<endl;
            my_file<<"Customer : "<<this->customerName<<endl;
            my_file<<"------------------Items-----------------"<<endl;
            for(int i = 0;i<n;i++){
                my_file<<"Item ID : "<< this->purchased[i].itemID<<endl;
                my_file<<"Item Name : "<< this->purchased[i].itemName<<endl;
                my_file<<"Quantity : "<< this->purchased[i].stockQuantity<<endl;
                my_file<<"Price : "<< (this->purchased[i].price)*(this->purchased[i].stockQuantity)<<endl;
                my_file<<"============================================="<<endl;
            }
            my_file.close();   
        }
    } 
};
Bill Bill::operator+(const Temp& i1) {
    Bill result = *this;
    for (int i = 0; i < n; i++) {
        result.purchased[i] = i1.arr[i];
    }
    return result;
}
int Bill::index = 0;
void loadFile(){
        ifstream my_file("Bill.txt");
        if(!my_file.is_open()){
            cout<<"Error : File not found"<<endl;
        }
        else{
            string line;
            while(getline(my_file,line)){
                cout<<line<<endl;
            } 
        }
}
int main(){
    loadFile();

    int choose;
    char temp = 'y';
    do{
        std::cout<<"Choose the option"<<std::endl;
        cout<<"<---------------------------------------->"<<endl;
        std::cout<<"1.Enter Bill Data \n4.Exit"<<std::endl;
        std::cin>>choose;
        switch(choose){
            case 1:{
                cout<<"Enter the number of item you want to buy"<<endl;
                cin>>n;
                Item *ptr = new Item[n];
                int i;
                for(i = 0;i<n;i++){
                    int stock;
                    int itemID;
                    float price;
                    char itemName[50];
                    cout<<"Enter Product details"<<endl;
                    cout<<"Enter Product ID"<<endl;
                    cin>>itemID;
                    cout<<"Enter Product name"<<endl;
                    cin>>itemName;
                    cout<<"Enter quantity"<<endl;
                    cin>>stock;
                     try{
                        if(stock<=0){
                            throw "Error : Qyt cannot be zero or negative";
                        }
                    }catch(const char* str){
                        cout<<str<<endl;
                        i=-1;
                        break;
                    }
                    cout<<"Enter Price"<<endl;
                    cin>>price;
                    try{
                        if(price<=0){
                        throw "Error : Price cannot be zero or negative";
                        }
                    }catch(const char* str){
                        cout<<str<<endl;
                        i=-1;
                        break;
                    } 
                    ptr[i].setData(itemID,stock,itemName,price);
                }
                if(i==-1)
                    break;
            
                char name[50];
                int billID;
                cout<<"Enter Bill ID"<<endl;
                cin>>billID;
                cout<<"Enter Customer Name"<<endl;
                cin>>name;
                Temp t1;
                for(int i =0 ; i< n ;i++){
                    t1.arr[i] = ptr[i];
                }
                Bill b1(billID,name);
                Bill b2 = b1 + t1;
                b2<<cout; 
                b2.saveTOFile();
                cout<<"<---------------------------------------->"<<endl;
            }break;
            default: {
                cout<<"<---------------------------------------->"<<endl;
                std::cout<<"In exit"<<std::endl;
                cout<<"<---------------------------------------->"<<endl;
                temp = 'n';
            }break;
        }
        if(temp == 'y' || temp == 'Y'){
            std::cout<<"Do u want to continue shopping (Y/N) "<<std::endl;
            std::cin>>temp;
        }
        if(temp != 'y'){
            cout<<"<---------------------------------------->"<<endl;
            std::cout<<"Thank You for visiting :)"<<std::endl;
            cout<<"<---------------------------------------->"<<endl;
        }
    }while(temp == 'y');
}