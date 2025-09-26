#include<iostream>
using namespace std;
class Matrix{

    int r,l,i,j;
    int a[3][3];
   
    int b[3][3];
    public:
    void accept();
    void display();
    void trans();

};
void Matrix ::accept(){
    cout<<"Enter value Row: ";
    cin>>r;
    cout<<"Enter value Col: ";
    cin>>l;
    for(i=0;i<r;i++){
        cout<<"Enter value Row{"<<i<<"}::";
        for(j=0;j<l;j++){

           cin>> a[i][j];
        }
    }


}
void Matrix ::display(){
    cout<<"Display the Matrix:"<<endl;
    for(i=0;i<r;i++){
        for(j=0;j<l;j++){

           cout<< a[i][j]<<"\t";
        }
        cout<<endl;
    }
    cout<<"\n\n\n";
    cout<<"Display the transes Matrix"<<endl;
    for(i=0;i<r;i++){
        for(j=0;j<l;j++){

        //   g cout<< b[j][i]<<"\t";
            cout << b[i][j] << "\t";
        }
        cout<<endl;
        
    }
    // cout<<"\n\n\n";
}

void Matrix ::trans(){
    for(i=0;i<r;i++){
        for(j=0; j<l;j++){
            // b[i][j]=a[j][i];
            b[j][i] = a[i][j]; 
        }
    }
    
}
int main ()
{
    Matrix m;
    m.accept();
    m.trans();
    m.display();
    // m.trans();
}
