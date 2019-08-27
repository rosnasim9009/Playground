#include <stdio.h>
int main()
{
  int m,n,flag=0;
  scanf("%d",&m);
  scanf("%d",&n);
  int mat1[m][n],mat2[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      scanf("%d",&mat1[i][j]);
  }
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      scanf("%d",&mat2[i][j]);
  }
  
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
        if(mat1[i][j]==mat2[i][j])
            flag=1;
        else
        {
            flag=0;
            break;
        }
    }
  }
  if(flag==1)
    printf("Yes");
  else
    printf("No");
  return 0;
}