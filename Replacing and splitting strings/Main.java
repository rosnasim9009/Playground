import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      	String str1,str2;
		int rep;
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		str2=sc.nextLine();
		rep=sc.nextInt();
		String s[]=str2.split(" ",rep);
		for(int i=0;i<rep;i++)
				System.out.println(s[i]);
    }
}