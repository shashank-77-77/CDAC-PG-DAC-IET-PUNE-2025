#include<iostream>
#include<string.h>
using namespace std;

int main(){
    int choose;
    char temp = 'y';
    do{
        std::cout<<"Choose the option"<<std::endl;
        cout<<"<---------------------------------------->"<<endl;
        std::cout<<"1.String Length \n2.String Copy \n3.String Concatination \n4.String Reverse \n5.Exit "<<std::endl;
        std::cin>>choose;
        switch(choose){
            case 1:{
                cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter a String"<<endl;
                char input[50];
                cin>>input; 
                int output = strlen(input);
                cout<<"Length is "<<output<<endl;
                cout<<"<---------------------------------------->"<<endl;
            } break;
            case 2:{
                    cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter two string"<<endl;
                char input[50],input1[50];
                cin>>input>>input1; 
                strcpy(input,input1);
                cout<<"Copied string is "<<input;
                cout<<endl;
                cout<<"<---------------------------------------->"<<endl;
            }break;

            case 3:{
                    cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter two string"<<endl;
                char input[50],input1[50];
                cin>>input>>input1; 
                strcat(input,input1);
                cout<<"Concatinated string is "<<input;
                cout<<endl;
                cout<<"<---------------------------------------->"<<endl;
            }break;
            case 4:{
                cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter a String"<<endl;
                    char input[50];
                    cin>>input; 
                    strrev(input);
                    cout<<"Reversed string is "<<input<<endl;
                cout<<"<---------------------------------------->"<<endl;
            }break;

            default: {
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