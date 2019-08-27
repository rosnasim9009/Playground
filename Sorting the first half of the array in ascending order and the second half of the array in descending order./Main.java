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
        int front=0,end=n,mid;
        mid=(front+end)/2;
        asc(mid,a);
        desc(n,mid,a);
        return 0;
}

void asc(int n,int a[])
{
    int i,j,temp;

        for(i=1;i<n;i++)
        {
            for(j=1;j<n;j++)
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
}
void desc(int n,int mid,int a[])
{
    int i,j,temp;

        for(i=mid+1;i<n;i++)
        {
            for(j=mid+1;j<n;j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j]; 
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(i=mid+1;i<=n;i++)
            printf("%d ",a[i]);
}

        
