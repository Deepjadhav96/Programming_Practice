#include<iostream>
using namespace std;

class Base
{
    public:
        int i,j;
    
    Base()
    {
        cout<<"Inside Base constructor\n";
        i = 0;
        j = 0;
    }

    void fun()
    {
        cout<<"Inside base fun function\n";
    }
    
    ~Base()
    {
        cout<<"Inside Base Destructor\n";
    }

};

class Derived : public Base
{

};




int main()
{

    Base bobj;
    // Derived dobj;





    return 0;
}