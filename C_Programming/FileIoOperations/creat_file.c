#include<stdio.h>
#include<fnctl.h>//file control

int main()
{
    int fd = 0;

    fd = creat("Loveletter.txt",0777);

    if(fd==-1)
    {
        printf("Unable to create the file\n");

    }
    else
    {
        printf("File gets created at the address of %d",fd);
    }
    return 0;
}