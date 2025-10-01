#include <iostream>
using namespace std;
#include<stdlib.h>

class G {
    int a;
public:
   
 
    G()
    {
        cout << "Constructor was Called!"<< endl;
    }

    ~G()
    {
        cout << "Destructor was Called!"<< endl;
    }
};
 
int main()
{
 
    G* a = new G;
    cout << "Object of class G was created using new operator!"<< endl;
 
    delete a;
    cout << "Object of class G was deleted using delete keyword!"<< endl;
 
 
    G* b = (G*)malloc(sizeof(G));
    cout << "Object of class G was created using malloc()!"<< endl;
 
    free(b);
    cout << "Object of class G was deleted using free()!"<< endl;
 
    return 0;
}

