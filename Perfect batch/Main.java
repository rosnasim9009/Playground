/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
	int size,sum=0,sum1=0;
  scanf("%d",&size);
  int array[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&array[i]);
  }
  //Batch(array,size/3)
  for(int i=0;i<size/2;i++)
  {
  	sum=sum+array[i];
  }
  for(int i=size/2;i<size;i++)
  {
  	sum1=sum1+array[i];
  }
  if(sum==sum1)
    printf("Perfect Batch");
  else
      printf("Not a Perfect Batch");  
    return 0;
}