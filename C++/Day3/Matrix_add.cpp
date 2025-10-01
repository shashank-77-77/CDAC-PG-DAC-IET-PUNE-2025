#include <iostream>
using namespace std;

int main() {
    int rows, cols;
    cout << "Enter the number of rows: ";
    cin >> rows;
    cout << "Enter the number of columns: ";
    cin >> cols;

    int matrix1[rows][cols]; 
    int matrix2[rows][cols];
    int sumMatrix[rows][cols];

    cout << "\nEnter elements of the first matrix:\n";
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            cout << "Enter element a[" << i << "][" << j << "]: ";
            cin >> matrix1[i][j];
        }
    }

    cout << "\nEnter elements of the second matrix:\n";
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            cout << "Enter element b[" << i << "][" << j << "]: ";
            cin >> matrix2[i][j];
        }
    }

    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }

    cout << "\nSum of the two matrices:\n";
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            cout << sumMatrix[i][j] << " ";
        }
        cout <<endl;
    }

    return 0;
}