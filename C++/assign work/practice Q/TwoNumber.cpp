#include<iostream>
int add(int x,int y){
    return x+y;
    
}
int main(){
    int choose;
    char temp = 'y';
    do{
        std::cout<<"Choose the option"<<std::endl;
        std::cout<<"<---------------------------------------->"<<std::endl;
        std::cout<<"1.Addition of Two Numbers \n2.Exit  "<<std::endl;
        std::cin>>choose;
        switch(choose){
            case 1:{
                std::cout<<"<---------------------------------------->"<<std::endl;
                    std::cout<<"Enter two numbers"<<std::endl;
                    int num1,num2;
                    std::cin>>num1>>num2;
                    int sum= add(num1,num2);
                    std::cout<<"Addition of two numbers = "<<sum<<std::endl;
                std::cout<<"<---------------------------------------->"<<std::endl;

            } break;
            case 2: {
                std::cout<<"<---------------------------------------->"<<std::endl;
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