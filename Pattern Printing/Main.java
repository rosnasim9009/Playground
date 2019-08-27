import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      	int r,c,i,j;
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		for(i=1;i<=r;i++)
		{
			int no=r;
			System.out.print(no);
			for(j=1;j<i;j++)
			{
				no--;
				System.out.print(no);
			}
			for(int k=1;k<=c-i;k++)
					System.out.print(no);
			System.out.println();
		}
    }
}