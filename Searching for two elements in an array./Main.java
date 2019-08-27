#include<stdio.h>
int main()
{
  int size,search1,search2,found1=0,found2=0;
  scanf("%d",&size);
  int array[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&array[i]);
  }
  scanf("%d\n",&search1);
  scanf("%d\n",&search2);

  for(int i=0;i<size;i++)
  {
    if(search1==array[i])
    {
      	printf("%d\n",i);
      found1=1;
    }
    else if(search2==array[i])
    {
      	printf("%d\n",i);
      found2=1;
  }
  }
    if(found1==0||found2==0)
      	printf("-1");
  
    return 0;
}
