#include <stdio.h>
int main()
{
  int m,n,flag=0,i,j,k;
  scanf("%d",&m);
  scanf("%d",&n);
  int mat1[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      scanf("%d",&mat1[i][j]);
  }
  
   for(i=0;i<n;i++)
  {
    for(j=0,k=i;k<n;j++,k++)
      printf("%d ",mat1[j][k]);
  }
  return 0;
}