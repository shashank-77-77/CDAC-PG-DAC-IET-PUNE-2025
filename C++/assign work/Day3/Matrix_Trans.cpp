#include<iostream>
using namespace std;
int main() {
    int rows, cols;
    cout << "Enter the number of rows: ";
    cin >> rows;
    cout << "Enter the number of columns: ";
    cin >> cols;

    int matrix1[rows][cols]; 
    int matrix2[rows][cols];

    cout << "\nEnter elements of the first matrix:\n";
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            cout << "Enter element a[" << i << "][" << j << "]: ";
            cin >> matrix1[i][j];
        }
    }
}