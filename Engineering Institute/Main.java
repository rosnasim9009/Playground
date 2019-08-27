import java.util.*;

class Faculty
{
	public void salary(int sal)
	{	
		System.out.println("Base Salary: "+sal);
	}
}

class CSE extends Faculty
{
	int cseSal;
	public void salary(int sal)
	{
		cseSal=sal+3000;
		System.out.println("CSE Faculty: "+cseSal);
	}
}

class IT extends CSE
{
	int itSal;
	public void salary(int sal)
	{
		itSal=sal+5000;
		System.out.println("IT Faculty: "+itSal);
	}
}

class ECE extends IT
{
	int eceSal;
	public void salary(int sal)
	{
		eceSal=sal+4500;
		System.out.println("ECE Faculty: "+eceSal);
	}
}
class Main
{
  public static void main(String[] args)
  {
    	Scanner sc=new Scanner(System.in);
		int sal=sc.nextInt();
			Faculty f=new Faculty();
			f.salary(sal);
			ECE obj = new ECE();
			IT obj1=new IT();
			CSE obj2=new CSE();
			obj2.salary(sal);
			obj1.salary(sal);
			obj.salary(sal);
  }
}