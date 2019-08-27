#include<stdio.h>
int Square(int num)
{
  	int s=num*num;
  	return s;
}
int main() 
{
	int n,sq;
  	scanf("%d",&n);
  	sq=Square(n);
  	printf("%d",sq);
  	return 0;
}