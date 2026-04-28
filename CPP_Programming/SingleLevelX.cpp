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

    cout<<"Sizeof Derived class object is :"<<sizeof(Base)<<"\n";   //8 
    cout<<"Sizeof Derived class object is :"<<sizeof(Derived)<<"\n";  

    cout<<dobj.i<<"\n"; // 0
    cout<<dobj.j<<"\n"; // 0
    cout<<dobj.x<<"\n"; // 0

    dobj.fun();
    dobj.gun();

    cout<<"End of main()\n";


    return 0;
}