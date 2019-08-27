#include<stdio.h>
int main()
{
  int size;
  scanf("%d",&size);
  int array[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&array[i]);
  }
  int lar=array[0];
  for(int i=1;i<size;i++)
  {
  	if(lar<array[i])
      lar=array[i];
  }
  printf("%d",lar);
  return 0;
}