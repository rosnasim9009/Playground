#include <stdio.h>
int GCD(int n1,int n2)
{
  	int min,g;
  	if(n1<n2)
      min=n1;
  	else
      	min=n2;
  	while(min>=1)
    {
      	if(n1%min==0 && n2%min==0)
        {
          	g=min;
      		break;
        }
      min++;
    }
  	return g;
}
int main() 
{
	int a,b,c,rs1;
  	scanf("%d%d%d",&a,&b,&c);
  	rs1=GCD(a,b);
  	printf("%d",GCD(rs1,c));
  return 0;
}