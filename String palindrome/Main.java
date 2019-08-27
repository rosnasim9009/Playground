#include<stdio.h>
#include<string.h>
int main()
{
  char str[100],rev[100];
  gets(str);
  int len=strlen(str);
  int i=0,flag=1;
  int j=len-1;
  while(i<j)
  {
  	if(str[i]==str[j])
    {
      	i++;
      	j--;
    }
    else
    {
      flag=0;
      break;
    }
  }
  if(flag==1)
  	printf("%s is a palindrome",str);
  else
    printf("%s is not a palindrome",str);
  return 0;
}