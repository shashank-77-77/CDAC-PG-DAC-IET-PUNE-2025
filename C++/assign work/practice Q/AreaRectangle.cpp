#include<iostream>
int area(int x,int y){
    return x*y;
}
  
int main(){

    int choose;
    char temp = 'y';
    do{
        std::cout<<"Choose the option"<<std::endl;
        std::cout<<"<---------------------------------------->"<<std::endl;
        std::cout<<"1.Area of Rectangle \n2.Exit  "<<std::endl;
        std::cin>>choose;
        switch(choose){
            case 1:{
                std::cout<<"<---------------------------------------->"<<std::endl;
                      std::cout<<"Enter length and height"<<std::endl;
                        int len,h;
                        std::cin>>len>>h;
                        int areaRec = area(len,h);
                        std::cout<<"Area of rectangle is = "<<areaRec<<std::endl;
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