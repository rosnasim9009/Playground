#include <stdio.h>
int main()
{
    int n,arr[20],i,j,found;
    int a[10]={1,2,3,4,5,6,7,8,9,10};
    scanf("%d",&n);
    for(i=0;i<n;i++)
       scanf("%d",&arr[i]);
    
    for(i=0;i<n;i++)
    {
        found=0;
        for(j=0;j<n;j++)
        {
            
            if(a[i]==arr[j])
            {
                found=1;
                break;
            }
        }
        if(found==0)
        {
                printf("%d",a[i]);
                //found=0;
        } 
    }
    return 0;
}
       
