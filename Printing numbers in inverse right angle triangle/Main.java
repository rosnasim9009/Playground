#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
	int num = n;
	for(int i = 1 ; i <= n ; i++)
       {
		  for(int j = num ; j >= 1 ; j--)
            {
			  printf("%d",j);
			}
		  printf("\n");
	      num = num - 1;
		}
return 0;
}