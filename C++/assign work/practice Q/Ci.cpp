#include<iostream>
using namespace std;
float compoundInterest(int p,int r,int t){
    double rate = 1+((double)r/100);
    double temp = 1;
    for(int i=1;i<=t;i++){
        temp *= rate;
    }
    cout<<temp<<endl;
    return double((p*temp)-p);
}
int main(){
 
    int choose;
    char temp = 'y';
    do{
        std::cout<<"Choose the option"<<std::endl;
        std::cout<<"<---------------------------------------->"<<std::endl;
        std::cout<<"1.Compound Interest \n2.Exit  "<<std::endl;
        std::cin>>choose;
        switch(choose){
            case 1:{
                std::cout<<"<---------------------------------------->"<<std::endl;
                       cout<<"Enter principle,Rate,Time"<<endl;
                        int p,r,t;
                        cin>>p>>r>>t;
                        float interest = compoundInterest(p,r,t);
                        cout<<"CI is "<<interest<<endl;
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