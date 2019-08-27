#include <stdio.h>
int main()
{
  int c1,r1;
  scanf("%d",&r1);
  scanf("%d",&c1);
  int mat1[r1][c1];
  for(int i=0;i<r1;i++)
  {
    for(int j=0;j<c1;j++)
      scanf("%d",&mat1[i][j]);
  }
  
  for(int i=c1-1;i>=0;i--)
  {
    for(int j=0;j<r1;j++)
    {
     	printf("%d ",mat1[j][i]);
       
        
    }
     printf("\n");
  }
  return 0;
}
