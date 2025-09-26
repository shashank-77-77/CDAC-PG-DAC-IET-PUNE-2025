#include<iostream>
void Swap(int &x,int &y){
    x=x+y;
    y=x-y;
    x=x-y;
    std::cout<<"X= "<<x<<" Y= "<<y<<std::endl;
}
int main(){
   
    int choose;
    char temp = 'y';
    do{
        std::cout<<"Choose the option"<<std::endl;
        std::cout<<"<---------------------------------------->"<<std::endl;
        std::cout<<"1.Swap \n 2.Exit  "<<std::endl;
        std::cin>>choose;
        switch(choose){
            case 1:{
                std::cout<<"<---------------------------------------->"<<std::endl;
                std::cout<<"Enter values"<<std::endl;
                int x,y;
                std::cin>>x>>y;
                Swap(x,y);
                std::cout<<"After Swapping"<<std::endl;
                std::cout<<"X= "<<x<<" Y= "<<y<<std::endl;
                std::cout<<"<---------------------------------------->"<<std::endl;
            } break;
            case 2: {
                std::cout<<"<---------------------------------------->"<<std::endl;
                std::cout<<"In exit"<<std::endl;
                temp = 'n';
                std::cout<<"<---------------------------------------->"<<std::endl;
            }
            break;
        }
        if(temp == 'y'){
            std::cout<<"Do u want to continue"<<std::endl;
            std::cin>>temp;
        }
        if(temp != 'y'){
            std::cout<<"<---------------------------------------->"<<std::endl;
            std::cout<<"Thank You for using Services :)"<<std::endl;
            std::cout<<"<---------------------------------------->"<<std::endl;
        }
    }while(temp == 'y');
}