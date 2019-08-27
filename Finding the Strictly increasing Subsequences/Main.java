#include <stdio.h>

int main()
{
    int n,a[100],i,j;
    scanf("%d",&n);
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    int flag=0;
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]<a[j])
            {
                for(int k=i+1;k<=j;k++)
                {
                    if(a[k]<=a[j])
                        flag=1;
                    else
                    {
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                    printf("%d,%d\n",a[i],a[j]);
              }
        }
    }
    return 0;
}
