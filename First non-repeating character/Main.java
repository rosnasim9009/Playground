#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];
    scanf("%[^\n]s",str);
    int len=strlen(str);
    int count[26]={0},i,j,k=0,c=0;
    for(i=0;i<len;i++)
    {
        for(j=i+1;j<len;j++)
        {
                if(str[i]==str[j])
                {
                    count[i]++;
                    count[j]++;
                }         
        }
        k++;
    }
    for(k=0;k<len;k++)
    {
        if(count[k]==0)
        {
            printf("%c",str[k]);
            break;
        }
        if(count[k]!=0)
         	c++;
    }
    if(c==len)
        printf("All the characters are repetitive");
    return 0;
}
