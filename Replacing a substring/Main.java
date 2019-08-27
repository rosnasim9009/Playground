#include <stdio.h>
#include <string.h>
int main()
{
    char text[100],word[100],rp[100];
    scanf("%[^\n]s",text);
    scanf("%s",word);
    scanf("%s",rp);
    int l,l1,l2,index;
    l=strlen(text);
    l1=strlen(word);
    l2=strlen(rp);
    for(int i=0;i<l;i++)
    {
        if(text[i]==word[0])
        {
            index=i;
            for(int j=0;j<l1;j++)
            {
                if(text[i+j]!=word[j])
                {
                    index=-1;
                    break;
                }
            }
            if(index!=-1)
            {
                    text[index]='\0';
                    break;
            }

        }
    }
    printf("%s",text);
    printf("%s",rp);
    printf("%s",&text[index+l1]);
    return 0;
}
