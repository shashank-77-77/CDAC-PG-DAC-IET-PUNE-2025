#include<iostream>
using namespace std;
int PowerNumber(int base,int power){
    int temp=1;
    for(int i=1;i<=power;i++){
        temp *= base;
    }
    return temp;
}
int main(){

    int choose;
    char temp = 'y';
    do{
        std::cout<<"Choose the option"<<std::endl;
        cout<<"<---------------------------------------->"<<endl;
        std::cout<<"1.Power of Number \n2.Exit  "<<std::endl;
        std::cin>>choose;
        switch(choose){
            case 1:{
                cout<<"<---------------------------------------->"<<endl;
                    cout<<"Enter base and power"<<endl;
                    int base,power;
                    cin>>base>>power;
                    int p= PowerNumber(base,power);
                    cout<<"CI is "<<p<<endl;
                cout<<"<---------------------------------------->"<<endl;
            } break;
            case 2: {
                cout<<"<---------------------------------------->"<<endl;
                temp = 'n';
                cout<<"<---------------------------------------->"<<endl;
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