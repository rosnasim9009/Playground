#include<stdio.h>
int Power(int base,int exp)
{
  	int p=pow(base,exp);
  	return p;
}
int main()
{
	int b,e;
  	scanf("%d%d",&b,&e);
  	printf("%d",Power(b,e));
  	return 0;
}
