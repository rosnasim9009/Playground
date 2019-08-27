#include <stdio.h>
int main() 
{
	int num,count=0,rem,sum=0;
  	scanf("%d",&num);
  	int n=num;
  	while(n>0)
    {
      	count=count+1;
      //printf("%d\n",count);
      	n=n/10;
    }
  	n=num;
  	for(int i=1;i<=count;i++)
    {
      	rem=n%10;
      	sum=sum+pow(rem,count);
      //printf("%d\n",sum);
      	n=n/10;
    }
  	if(sum==num)
      	printf("Armstrong Number");
  	else
      	printf("Not an Armstrong Number");
	return 0;
}
