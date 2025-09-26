#include<iostream>
char addChar(char ch1,char ch2){
    return ch1+ch2;
    
}
int main(){
  
    int choose;
    char temp = 'y';
    do{
        std::cout<<"Choose the option"<<std::endl;
        std::cout<<"<---------------------------------------->"<<std::endl;
        std::cout<<"1.Add two num \n 2.Exit  "<<std::endl;
        std::cin>>choose;
        switch(choose){
            case 1:{
                std::cout<<"<---------------------------------------->"<<std::endl;
                  std::cout<<"Enter two characters"<<std::endl;
                    char ch1,ch2;
                    std::cin>>ch1>>ch2;
                    char sumChar = addChar(ch1,ch2);
                    std::cout<<"Addition of two character = "<<sumChar<<std::endl;
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