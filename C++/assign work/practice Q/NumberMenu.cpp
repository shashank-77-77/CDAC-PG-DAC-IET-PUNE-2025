#include<iostream>
using namespace std;
int armstrong(int num){
    int temp = num;
    int count = 0;
    while(temp > 0){
        temp=temp/10;
        count++;
    }
    int temp1 = num; 
    int sum = 0; 
    while(temp1 > 0){
        int rem = temp1%10;
        temp = 1;
        for(int i = 1; i <= count; i++){
            temp *= rem;
        }
        sum += temp;
        temp1 = temp1/10; 
    }
    if(sum == num)
        return 1;
    else
        return 0;
}
void primeNumber(int start, int end){
    for (int i = start; i <= end; i++){
        int count=0;
        for(int j = 1; j<= i; j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==2)
            cout<<i<<"\t";
    }
    
}
int factorial(int num){
    int fact = 1;
    for(int i = 1;i<=num;i++){
        fact *= i;
    }
    return fact;
}
void fibo(int fibo){
    int c,a =0,b=1;
    for(int i =0;i<fibo;i++){
        cout<<a<<"\t";
        c = a+b;
        a =b;
        b=c;
    }
}
int main(){
    int choose;
    char temp = 'y';
    do{
        std::cout<<"Choose the option"<<std::endl;
        cout<<"<---------------------------------------->"<<endl;
        std::cout<<"1.ArmStrong Calculation \n2.Prime Number \n3.Factorial \n4.Fibonacci number \n5.Exit"<<std::endl;
        std::cin>>choose;
        switch(choose){
            case 1:{
                cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter a number"<<endl;
                int input;
                cin>>input;
                cout<<"<---------------------------------------->"<<endl; 
                int output = armstrong(input);
                if(output == 1){
                    cout<<"number is armstrong = "<<input<<endl;
                }else{
                    cout<<"number is not armstrong = "<<input<<endl;
                }
                cout<<"<---------------------------------------->"<<endl;
            } break;
            case 2:{
                cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter the range"<<endl;
                int input,input1;
                cin>>input>>input1;
                cout<<"<---------------------------------------->"<<endl; 
                cout<<"Prime number are = ";
                primeNumber(input,input1);
                cout<<endl;
                cout<<"<---------------------------------------->"<<endl;
            }break;

            case 3:{
                cout<<"<---------------------------------------->"<<endl;
                cout<<"Enter a number"<<endl;
                int input;
                cin>>input; 
                cout<<"<---------------------------------------->"<<endl;
                int fact = factorial(input);
                cout<<"The factorial = "<<fact<<endl;
                cout<<"<---------------------------------------->"<<endl;
            }break;

            case 4:{
                cout<<"<---------------------------------------->"<<endl;
                int num;
                cout<<"Enter the number"<<endl;
                cin>>num;
                cout<<"<---------------------------------------->"<<endl;
                cout<<"Fibonacci Number is :"<<endl;
                fibo(num);
                cout<<endl<<"<---------------------------------------->"<<endl;
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
