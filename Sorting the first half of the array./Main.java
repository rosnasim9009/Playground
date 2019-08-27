#include<stdio.h>
int main()
{
        int n;
        scanf("%d",&n);
        int a[100];
        for(int i = 1; i <= n ; i++)
        {
            scanf("%d",&a[i]);
        }
        int front=0,end=n,mid,i,temp,j;
        mid=(front+end)/2;
        for(i=1;i<mid;i++)
        {
            for(j=1;j<mid;j++)
            {
            if(a[j]>a[j+1])
            {
               temp=a[j]; 
               a[j]=a[j+1];
               a[j+1]=temp;
            }
            }
        }
        for(i=1;i<=n;i++)
            printf("%d ",a[i]);
        return 0;
}
        
