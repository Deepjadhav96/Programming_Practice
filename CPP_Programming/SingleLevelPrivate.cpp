#include<iostream>
using namespace std;

class Base
{
    private:
        int i,j;
    
    public:

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

    public:
        int x;

        Derived()
        {
            cout<<"Inside Derived Constructor\n";
            x = 0;
        }

        ~Derived()
        {
            cout<<"Inside Derived Destructor\n";
        }

        void gun()
        {
            cout<<"Inside gun of Derived\n";
        }
};

int main()
{
    cout<<"Inside Main\n";

    Derived dobj;

    cout<<"Sizeof Base class object is :"<<sizeof(Base)<<"\n";   //8 
    cout<<"Sizeof Derived class object is :"<<sizeof(Derived)<<"\n";  //12   its important here

    // cout<<dobj.i<<"\n"; // error
    // cout<<dobj.j<<"\n"; // error

    cout<<dobj.x<<"\n"; // 0

   
    cout<<"End of main()\n";


    return 0;
}