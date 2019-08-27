#include<stdio.h>
#include<string.h>
int main()
{
  // Type your code here
  char str[100];
  scanf("%[^\n]s",str);
  int len=strlen(str);
  for(int i=len-1;i>=0;i--)
  {
    if(str[i]==' ')
    {
      printf("%s ",&str[i+1]);
      str[i]='\0';
    }
  }
  printf("%s",str);
  return 0;
}