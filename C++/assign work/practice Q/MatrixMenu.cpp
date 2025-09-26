#include<iostream>
using namespace std;
void additionMatrix(int (*src1)[3], int (*src2)[3], int (*target)[3]){
    for(int i = 0; i < 3; i++){
        for(int j=0;j<3;j++){
            *(*(target+i)+j) = *(*(src1+i)+j) + *(*(src2+i)+j);
        }
    }
}
void transposeMatrix(int (*target)[3],int (*src)[3]){
    for(int i = 0; i < 3; i++){
        for(int j=0;j<3;j++){
            *(*(target+j)+i) = *(*(src+i)+j);
        }
    }
}
void multiplicationMatrix(int (*src1)[3], int (*src2)[3], int (*target)[3]){

    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            *(*(target+i)+j) = 0;
        }
    }
    
    for(int j=0;j<3;j++){
        for(int k=0;k<3;k++){
            int sum = 0;
            for(int l=0;l<3;l++){
                sum = sum + (*(*(src1+j)+k) * *(*(src2+j)+l));
            }
            *(*(target+j)+k) = *(*(target+j)+k) + sum;
        }
    }  
}
int main(){
    int choose;
    char temp = 'y';
    do{
        std::cout<<"Choose the option"<<std::endl;
        cout<<"<---------------------------------------->"<<endl;
        std::cout<<"1.Addition of Matrix \n2.Transpose of Matrix \n3.Multiplication of Matrix \n4.Exit"<<std::endl;
        std::cin>>choose;
        switch(choose){
            case 1:{
                cout<<"<---------------------------------------->"<<endl;
                int src1[3][3],src2[3][3],target[3][3];
                cout<<"Enter 1st array Elements"<<endl;
                for(int i = 0; i < 3; i++){
                    for(int j=0;j<3;j++){
                        cin>>*(*(src1+i)+j);
                    }
                }
                cout<<"Enter 2nd array Elements"<<endl;
                for(int i = 0; i < 3; i++){
                    for(int j=0;j<3;j++){
                        cin>>*(*(src2+i)+j);
                    }
                }
                additionMatrix(src1,src2,target);
                cout<<"array Elements"<<endl;
                for(int i = 0; i < 3; i++){
                    for(int j=0;j<3;j++){
                        cout<<*(*(target+i)+j)<<"\t";
                    }
                    cout<<endl;
                }
                cout<<"<---------------------------------------->"<<endl;
            } break;
            case 2:{
                cout<<"<---------------------------------------->"<<endl;
                int src[3][3],target[3][3];
                cout<<"Enter 1st array Elements"<<endl;
                for(int i = 0; i < 3; i++){
                    for(int j=0;j<3;j++){
                        cin>>*(*(src+i)+j);
                    }
                }
                transposeMatrix(target,src);
                cout<<"array Elements"<<endl;
                for(int i = 0; i < 3; i++){
                    for(int j=0;j<3;j++){
                        cout<<*(*(target+i)+j)<<"\t";
                    }
                    cout<<endl;
                }
                cout<<"<---------------------------------------->"<<endl;
            } break;

            case 3:{
                cout<<"<---------------------------------------->"<<endl;
                int src1[3][3],src2[3][3],target[3][3];
                cout<<"Enter 1st array Elements"<<endl;
                for(int i = 0; i < 3; i++){
                    for(int j=0;j<3;j++){
                        cin>>*(*(src1+i)+j);
                    }
                }
                cout<<"Enter 2nd array Elements"<<endl;
                for(int i = 0; i < 3; i++){
                    for(int j=0;j<3;j++){
                        cin>>*(*(src2+i)+j);
                    }
                }
                multiplicationMatrix(src1,src2,target);
                cout<<"array Elements"<<endl;
                for(int i = 0; i < 3; i++){
                    for(int j=0;j<3;j++){
                        cout<<*(*(target+i)+j)<<"\t";
                    }
                    cout<<endl;
                }
                cout<<"<---------------------------------------->"<<endl;
            } break;
            default: {
                cout<<"<---------------------------------------->"<<endl;
                std::cout<<"In exit"<<std::endl;
                cout<<"<---------------------------------------->"<<endl;
                temp = 'n';
            }
            break;
        }
        if(temp == 'y' || temp == 'Y'){
            std::cout<<"Do u want to continue (Y/N) "<<std::endl;
            std::cin>>temp;
        }
        if(temp != 'y'){
            cout<<"<---------------------------------------->"<<endl;
            std::cout<<"Thank You for visiting :)"<<std::endl;
            cout<<"<---------------------------------------->"<<endl;
        }
    }while(temp == 'y');
}
