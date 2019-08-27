#include<stdio.h>
int main()
{
  //Type your code here
  int size;
  scanf("%d",&size);
  int array[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&array[i]);
  }
  Subset(array,size);
  
  return 0;
}

int Subset(int array[],int size)
{
  	int i,j,k;
  	for(int i=0;i<=size-2;i++)
    {
      for(int j=i+1;j<=size-1;j++)
      {
        for(int k=i+2;k<=size-1;k++)
        {
          if(j==k)
            k++;
          if(j<k&&k<size)
          	printf("(%d, %d, %d) ",array[i],array[j],array[k]);
        }
      }
      printf("\n");
    }
}    
