import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      	int side,len,bre,rad,base,ht;
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			side=sc.nextInt();
			System.out.println(side*side);
			break;
		case 2:
			len=sc.nextInt();
			bre=sc.nextInt();
			System.out.println(len*bre);
			break;
		case 3:
			base=sc.nextInt();
			ht=sc.nextInt();
			System.out.println(0.5*base*ht);
			break;
		case 4:
			rad=sc.nextInt();
			System.out.println(3.14*rad*rad);
			break;
		default:
			System.out.println("Invlid Input");
		}
    }
}