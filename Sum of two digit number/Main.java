#include<stdio.h>
int main()
{
  int num,num1,rem,sum;
  scanf("%d",&num);
  num1=num/10;
  rem=num%10;
  sum=num1+rem;
  printf("%d",sum);
  return 0;
}