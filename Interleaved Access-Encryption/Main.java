#include <stdio.h>
#include <string.h>

int main()
{
    char str[100];
    scanf("%[^\n]s",str);
    int col,row,len,i,j;
    scanf("%d",&col);
    len=strlen(str);
    row=len/col;
    if((len%col)>0)
        row=row+1;
    for(i=0;i<col;i++)
    {
        for(j=0;j<row;j++)
        {
            int curInd=i+(j*col);
            if(j%2!=0)
            {
                int lastInd=(col-1)+(j*col);
                curInd=lastInd-i;
            }
            char ch;
            if(curInd>=len)
                ch='X';
            else
                ch=str[curInd];
            printf("%c",ch);
        }
    }
    return 0;
}
