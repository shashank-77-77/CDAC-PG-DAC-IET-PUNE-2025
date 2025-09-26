#include<iostream>
using namespace std;
int strLen(char * str){
    int count = 0;
    while(*str !='\0'){
        count++;
        str++;
    }
    return count;
}
void strCopy(char* target, char* src){
    int i=0;
        while(i < strLen(target)){
            *(target+i) = *(src+i);
            i++;
        }
}
void conCat(char* target, char* src){
    int i=0;
        while(i <= strLen(target)){
            target++;
            i++;
        }
        while(*src!='\0'){
            *target = *src;
            target++;
            src++;
        }
        *target = '\0';

}
void strRev(char * input){
    int start = 0;
    int end = strLen(input);
    int mid = (start + end )/2;
    end = end -1;
    cout<<mid<<endl<<end<<endl;
    while(start <= mid ){
        char temp = *(input+end);
        *(input+end) = *(input+start);
        *(input+start) = temp;
        start++;
        end--;    
    
    }
}
void strLower(char *str){
    while(*str != '\0'){
        if(*str >= 65 && *str <= 90)
            *str = *str + 32;
        str++;
    }
}
void strUpper(char *str){
    while(*str != '\0'){
       if(*str >= 97 && *str <= 122)
            *str = *str - 32;
        str++;
    }
}
int strCompare(char *str1,char* str2){
    if (strLen(str1)==strLen(str2))
    {
        while(*str1!='\0'){
            if(*str1!=*str2 ){
                if((*(str1 + 32) = *str2) || (*(str2 + 32) = *str1)) 
                    return 0;
                else 
                return-1;
            }
            str1++;
            str2++;
        }
        return 0;
    }else{return -1;}
    
}
int main(){
    int choose;
    char temp = 'y';
    do{
        std::cout<<"Choose the option"<<std::endl;
        cout<<"<---------------------------------------->"<<endl;
        std::cout<<"1.String Length \n2.String Copy \n3.String Concatination \n4.String Reverse \n5.String Lower \n6.String Upper \n7.String Compare \n8.Exit "<<std::endl;
        std::cin>>choose;
        switch(choose){
            case 1:{
                cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter a String"<<endl;
                char input[50];
                cin>>input; 
                int output = strLen(input);
                cout<<"Length is "<<output<<endl;
                cout<<"<---------------------------------------->"<<endl;
            } break;
            case 2:{
                    cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter two string"<<endl;
                char input[50],input1[50];
                cin>>input>>input1; 
                strCopy(input,input1);
                cout<<"Copied string is "<<input;
                cout<<endl;
                cout<<"<---------------------------------------->"<<endl;
            }break;

            case 3:{
                    cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter two string"<<endl;
                char input[50],input1[50];
                cin>>input>>input1; 
                conCat(input,input1);
                cout<<"Concatinated string is "<<input;
                cout<<endl;
                cout<<"<---------------------------------------->"<<endl;
            }break;
            case 4:{
                cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter a String"<<endl;
                    char input[50];
                    cin>>input; 
                    strRev(input);
                    cout<<"Reversed string is "<<input<<endl;
                cout<<"<---------------------------------------->"<<endl;
            }break;

            case 5:{
                cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter a String"<<endl;
                    char input[50];
                    cin>>input; 
                    strLower(input);
                    cout<<"Lowered string is "<<input<<endl;
                cout<<"<---------------------------------------->"<<endl;
            }break;

              case 6:{
                cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter a String"<<endl;
                    char input[50];
                    cin>>input; 
                    strUpper(input);
                    cout<<"Uppered string is "<<input<<endl;
                cout<<"<---------------------------------------->"<<endl;
            }break;

            case 7:{
                    cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter two string"<<endl;
                char input[50],input1[50];
                cin>>input>>input1; 
                int output = strCompare(input,input1);
                if(output==0)
                cout<<"String are equal "<<endl;
                else
                cout<<"String are not equal "<<endl;
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