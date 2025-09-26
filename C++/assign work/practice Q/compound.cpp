// #include<iostream>
// using namespace std;
// int main()
// {
//     float a,p,r,n,t,b,d,c,e;
//     cout<<"Enter Principal amount= "<<endl;
//     cin>>p;
//     cout<<"Enter rate of interest= "<<endl;
//     cin>>r;
//     cout<<"Enter number of times interest compounded in 1 year= "<<endl;
//     cin>>n;
//     cout<<"Enter time in years= "<<endl;
//     cin>>t;
    
//     b=(r/100)/n;
//     c=n*t;
//     d=1+b;
//      for (int i = 1; i <= c; ++i) {
//         e *= d; // Multiply result by base in each iteration
//     }
//     a=p*e;
//     cout<<a<<endl;

   
//     // for (int i = 0; i < exponent; ++i) {
//     //     result *= base; // Multiply result by base in each iteration
//     // }

//     // cout << "Result: " << result << std::endl;

//     // return 0;
   

    
//     return 0;
   
// }




#include <iostream> 
using namespace std;

int main() {
    double p, r;
    int t;
    // int n; // number of times compounded per year

    cout << "Enter principal amount: ";
    cin >> p;

    cout << "Enter annual interest rate (as a decimal, e.g., 0.05 for 5%): ";
    cin >> r;

    cout << "Enter time in years: ";
    cin >> t;

    // cout << "Enter compounding frequency per year (e.g., 1 for annually, 12 for monthly): ";
    // cin >> n;
     // Calculate (1 + r)^t using a loop
    double base = 1 + r;
    double power = 1;
    for (int i = 0; i <t; ++i) {
        power *= base;
    }

    double A = p * power;
    double ci = A - p;

    cout << "Compound Interest: " << ci << endl;
    cout << "Total Amount: " << A << endl;

    return 0;
    return 0;
}

/*A=P(1 + r)^(t), where: 
A = the future value of the investment/loan, including interest. 
P = the principal investment amount (the initial amount of money). 
r = the annual interest rate (as a decimal). 
t = the number of years the money is invested or borrowed for. */