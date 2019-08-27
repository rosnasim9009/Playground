#include <stdio.h>
int main()
{
	int num,sum=0,rem;
  	scanf("%d",&num);
  	int n=num;
  	while(n>0)
    {
  		rem=n%10;
      	int f=1;
      	for(int i=1;i<=rem;i++)
    	{
      		f=f*i;
   	    }
      	sum=sum+f;
      	n=n/10;
    }
  	if(num==sum)
      	printf("Yes");
  	else
      	printf("No");
	return 0;
}