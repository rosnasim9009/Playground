#include <stdio.h>
#include <string.h>
int main()
{
    char str[100],check[4]="the";
    scanf("%[^\n]s",str);
    int len=strlen(str);
    int count=0,index,val[500]={0},i,j,k=0;
    for(int i=0;i<len;i++)
    {
        if(str[i]>='A'&&str[i]<='Z')
           str[i]=str[i]+32;
    }
    j=0,i=0;
    while(i<len)
    {    
            if(str[i]=='t'&&str[i+1]=='h'&&str[i+2]=='e')
            {
                    val[i]=1;
                    val[i+1]=1;
                    val[i+2]=1;
                    val[i+3]=1;
                	i=i+4;
            }
            else
                i++;
    }
    for(i=0;i<len;i++)
    {
        if(val[i]==0)
            printf("%c",str[i]);
	}
    return 0;
}