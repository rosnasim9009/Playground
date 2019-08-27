#include <stdio.h>
int main()
{
  int a,b;
  scanf("%d",&a);
  scanf("%d",&b);
  int mat[a][b];
  for(int i=0;i<a;i++)
  {
    for(int j=0;j<b;j++)
      scanf("%d",&mat[i][j]);
  }
  int trans[b][a];
  for(int i=0;i<a;i++)
  {
    for(int j=0;j<b;j++)
      trans[j][i]=mat[i][j];
  }
  for(int i=0;i<b;i++)
  {
    for(int j=0;j<a;j++)
  		printf("%d ",trans[i][j]);
    printf("\n");
  }
  return 0;
}
