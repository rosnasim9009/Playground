
#include <stdio.h>
int Greatest(int n1,int n2)
{
  	int g;
  	if(n1<n2)
      	g=n2;
  	else
      	g=n1;
  	return g;
}
int main()
{
	int a,b,c;
  	scanf("%d%d%d",&a,&b,&c);
  	int rs=Greatest(a,b);
  	printf("%d",Greatest(rs,c));
  return 0;
}