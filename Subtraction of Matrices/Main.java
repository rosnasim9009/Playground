
#include <stdio.h>
int main()
{
  int a,b;
  scanf("%d",&a);
  scanf("%d",&b);
  int mat1[a][b],mat2[a][b];
  for(int i=0;i<a;i++)
  {
    for(int j=0;j<b;j++)
      scanf("%d",&mat1[i][j]);
  }
  for(int i=0;i<a;i++)
  {
    for(int j=0;j<b;j++)
      scanf("%d",&mat2[i][j]);
  }

  for(int i=0;i<a;i++)
  {
    for(int j=0;j<b;j++)
      printf("%d ",mat1[i][j]-mat2[i][j]);
    printf("\n");
  }
   return 0;
}