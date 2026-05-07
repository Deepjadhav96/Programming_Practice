#include<iostream>
using namespace std;


int main()
{
    //We can create one reference to one variable 
    int no = 11;
    int &x = no;

    //We can create multiple references for single variable.
     int &y = no;

    //We can create a reference to refrence 
    int &z = y;

    //We can create a reference to the pointer.
    int *p = &no;
    int *(&q) = p;


    return 0;
}