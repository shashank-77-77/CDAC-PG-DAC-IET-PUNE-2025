#include <iostream>
#include <math.h>
using namespace std;

class test
{
    int bin_num1;
    int bin_num2;
    int pow1 = 0;
    int pow2 = 0;
    int dec_num1 = 0;
    int dec_num2 = 0;
    int rem1;
    int rem2;

public:
    void accept()
    {
        cout << "Enter bin_num1: ";
        cin >> bin_num1;
        cout << "Enter bin_num2: ";
        cin >> bin_num2;
    }

    int conversion()
    {
        while (bin_num1 > 0)
        {
            rem1 = bin_num1 % 10;
            dec_num1 += (rem1 * pow(2, pow1));
            pow1++;
            bin_num1 /= 10;
        }
        while (bin_num2 > 0)
        {
            rem2 = bin_num2 % 10;
            dec_num2 += (rem2 * pow(2, pow2));
            pow2++;
            bin_num2 /= 10;
        }
        return dec_num1 + dec_num2;
    }

    void display()
    {
        cout<<"dec_num1: "<<dec_num1<<endl;
        cout<<"dec_num2: "<<dec_num2<<endl;
        cout << "Summation of two Num: " << dec_num1+dec_num2;
    }
};

int main()
{
    test t1;
    t1.accept();
    t1.conversion();
    t1.display();
}