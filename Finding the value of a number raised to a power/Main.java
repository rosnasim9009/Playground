import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
		int base,exp,power=0;
		Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
		exp=sc.nextInt();
		int i=1;
		while(i<=exp)
		{
			power=(int) Math.pow(base,i);
			i++;
		}
		System.out.println(power);
    }
}