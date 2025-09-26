#include<iostream>
using namespace std;

int main(){
    
    int choose;
    char temp = 'y';
    do{
        std::cout<<"Choose the option"<<std::endl;
        cout<<"<---------------------------------------->"<<endl;
        std::cout<<"1.Do you want to print Hello World \n2.Exit  "<<std::endl;
        std::cin>>choose;
        switch(choose){
            case 1:{
                cout<<"<---------------------------------------->"<<endl;
                cout<<"Hello world"<<endl;
                cout<<"<---------------------------------------->"<<endl;
            } break;
            case 2: {
                cout<<"<---------------------------------------->"<<endl;
                std::cout<<"In exit"<<std::endl;
                cout<<"<---------------------------------------->"<<endl;
                temp = 'n';
            }
            break;
        }
        if(temp == 'y'){
            std::cout<<"Do u want to continue"<<std::endl;
            std::cin>>temp;
        }
        if(temp != 'y'){
            cout<<"<---------------------------------------->"<<endl;
            std::cout<<"Thank You for using Services :)"<<std::endl;
            cout<<"<---------------------------------------->"<<endl;
        }
    }while(temp == 'y');
    
}