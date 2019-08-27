#include<stdio.h>
int Prime(int num)
{
  	int n=2,prime=1;
  	while(n<=num/2)
    	{
      		if(num%n==0)
        	{
          		prime=0;
          		break;
        	}
      		n++;
    	}
  	return prime;
}
int main()
{
	int n;
  	scanf("%d",&n);
  	for(int i=2;i<=n;i++)
    	{
  		int flag=Prime(i);
      		if(flag==1)
      			printf("%d\n",i);
    	}	
    	return 0;
}
