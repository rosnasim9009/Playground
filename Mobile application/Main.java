class MyModel1 
{
	int mp;
	String lock;
	int display;
	MyModel1(){}
	MyModel1(int mp,String lock,int display)
	{
		this.mp=mp;
		this.lock=lock;
		this.display=display;
		System.out.println("Features of MyModel 1");
		System.out.println("Camera mega pixels: "+mp);
	}
}
class MyModel2 extends MyModel1 
{
	MyModel2(){}
	MyModel2(String lock,int mp,int display)
	{
		this.mp=mp;
		this.lock=lock;
		this.display=display;
		System.out.println("Features of MyModel 2");
		System.out.println("Camera mega pixels: "+mp);
		System.out.println("Lock mechanism: "+lock);
		System.out.println("Display size: "+display);
	}
}
class MyModel2T extends MyModel2 
{
	MyModel2T(int mp,String lock,int display)
	{
		this.mp=mp;
		this.lock=lock;
		this.display=display;
		System.out.println("Features of MyModel 2T");
		System.out.println("Camera mega pixels: "+mp);
		System.out.println("Lock mechanism: "+lock);
		System.out.println("Display size: "+display);
	}

}
public class Main 
{
    public static void main(String[] args) 
    {
      	   MyModel1 m1=new MyModel1(2,"No lock",5);
		   MyModel2 m2=new MyModel2("Fingerprint",5,m1.display);
		   MyModel2T m3=new MyModel2T(16,m2.lock,6);
    }
}