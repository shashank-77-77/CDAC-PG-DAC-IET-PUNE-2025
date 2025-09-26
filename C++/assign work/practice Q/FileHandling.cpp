#include <iostream>
#include <fstream>
using namespace std;

int main() {
    fstream file("Sample.txt", ios::in | ios::out |ios::trunc); // Open for read/write, truncate existing content
    string line;

    // Write to file
    file << "Hello World" << endl;
    file << "Hello World" << endl;

    // Move the read pointer to the beginning
    file.seekg(0);

    // Read first line
    while(!file.eof()){getline(file, line);
    cout << line << endl;}

    file.close();
}
