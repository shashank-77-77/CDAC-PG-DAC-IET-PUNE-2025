#include<iostream>
#include<fstream>
using namespace std;
int main(){
    string line;
    ofstream my_file("Example.txt");
    my_file<<"Hello world again!!!";
    my_file.close();
    ifstream my_file1("Example.txt");
    getline(my_file1,line);
    cout<<line;
}