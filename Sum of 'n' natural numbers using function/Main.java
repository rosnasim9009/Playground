#include<stdio.h>
int SumNatural(int num)
{
  	int sum=(num*(num+1))/2;
  	return sum;
}
  	
int main() 
{

  	int n,s;
  	scanf("%d",&n);
  	s=SumNatural(n);
  	printf("%d",s);
     return 0;
}