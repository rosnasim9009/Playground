#include<stdio.h>
int main()
{
  int num,num1,rem;
  scanf("%d",&num);
  //num1=num/10000;
  rem=num%100;
  num1=rem/10;
  printf("%d",num1);  
  return 0;
}