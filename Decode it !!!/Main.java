#include<stdio.h>
#include<string.h>

int main()
{
  char str[100],str1[100]="0";
  int key,i,j=0;
  scanf("%[^\n]s",str);
  scanf("%d",&key);
  int len=strlen(str);
  for(i=0;i<len;i++)
  {
  	if(str[i]==' ')
  	{
    	str1[j]=' ';
    	j++;
  	}
  	else
  	{ 
  	    int p=key%26;
    	str1[j]=str[i]-p;
  	  if(str[i]>='a'&&str[i]<='z')
  	  {
		if(str1[j]<97)
        {
          int t=97-str1[j];
          str1[j]=123-t;
        }
  	  }
  	  else if(str[i]>='A'&&str[i]<='Z')
  	  {
  	    if(str1[j]<65)
        {
          int t=65-str1[j];
          str1[j]=91-t;
        }
  	  }
    j++;
  	}
  }
  printf("%s",str1);
  return 0;
}