// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int size;
  scanf("%d",&size);
  int array[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&array[i]);
  }
  MaxIndex(array,size);
  return 0;
}

int MaxIndex(int array[],int size)
{
  int large=array[0],index;
  for(int i=1;i<size;i++)
  {
    if(large<array[i])
    {
    	large=array[i];
      	index=i;
    }
  }
  printf("%d",index);
   return 0;
}
