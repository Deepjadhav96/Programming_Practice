#include<stdio.h>
#include<stdlib.h>
struct Demo
{
    int RollNo;
    float Marks;

};

int main()
{
    int Size = 0;

    int i = 0;

    struct Demo *dobj= NULL;

    printf("Enter a number of students:\n");
    scanf("%d",&Size);

    dobj = (struct Demo *)malloc(Size * sizeof(struct Demo));

    printf("Enter RollNo and Marks of students:\n");

   for(i = 0; i < Size; i++)
   {
       scanf("%d %f", &dobj[i].RollNo, &dobj[i].Marks);
   }

  printf("Entered makrs are:\n");
   for(i = 0; i < Size; i++)
   {
  printf("%d %.2f\n", dobj[i].RollNo, dobj[i].Marks);      
   }

   free(dobj);

    return 0;

}