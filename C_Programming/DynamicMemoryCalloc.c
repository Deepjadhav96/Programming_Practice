#include<stdio.h>
#include<stdlib.h>

int main()
{
    int Size = 0;
    int *RollNo = NULL;
    int i = 0;
    
    printf("Enter a size:\n");
    scanf("%d",&Size);

    RollNo = (int *)malloc(Size*(sizeof(int)));

    // printf("Memory allocated at %p\n", (void *)RollNo);
    // This line return the starting address.

    printf("Enter you roll no:\n");

    for(i = 0; i < Size; i++)
    {
        scanf("%d",&RollNo[i]);
    }

    printf("Entered RollNo are:\n");

    for(i = 0; i < Size; i++)
    {
        printf("%d\n",RollNo[i]);
    }

    free(RollNo);

    return 0;
}