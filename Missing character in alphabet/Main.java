// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  char str[100];
  int count[26]={0},i,j=0;
  gets(str);
  int len=strlen(str);
  for(i=0;i<len;i++)
  {
    if(str[i]>='a'&&str[i]<='z')
    {
      j=str[i]-'a';
      count[j]++;
    }
  }
  //for(i=0;i<26;i++)
  //{
    //printf("%d",count[i]);
 // }
  for(i=0;i<26;i++)
  {
    if(count[i]==0)
    {
      printf("%c ",i+'a');
    }
  } 
   return 0;
}