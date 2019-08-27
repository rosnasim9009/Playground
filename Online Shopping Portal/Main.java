public class Main {
	public static void main(String[] args) 
    {
    	Customers customerObj1=new Customers(1001,"Saakshi",9000000000L,"Bangalore","16-Jul-1990",'F',"Lakme Kajal, Salwar");
      	Customers customerObj2=new Customers(1008,"Rahul",9000000001L,"Chennai","27-Jan-1992",'M',"T-Shirt, Jeans");
      	Suppliers supplierObj1=new Suppliers(7901,"ABC Traders",8000000000L,"Mumbai",10,"Paid",4.75);
      	Suppliers supplierObj2=new Suppliers(7972,"XYZ Enterprises",8000000900L,"Kolkata",7,"Unpaid",4.35);
      	customerObj1.editAddress("Saakshi","Bangalore");
      	supplierObj1.editAddress("ABC Traders","Mumbai");
      	customerObj1.placeOrder();
      	supplierObj1.increaseStockLevel("ABC Traders",15);
      	supplierObj2.increaseStockLevel("XYZ Enterprises",17);	
    }	
}

class Users 
{
		//write the logic for the class Users	      
}

class Customers extends Users
{
	int cId;
    String cName;
    long cMob;
    String cAddress;
    String cDob;
    char cGender;
    String cHistory;
    
    public Customers(int id,String name,long mob,String address,String dob,char gender,String history)
    {
    	this.cId=id;
    	this.cName=name;
    	this.cMob=mob;
    	this.cAddress=address;
    	this.cDob=dob;
    	this.cGender=gender;
    	this.cHistory=history;
        System.out.println(name+", "+mob);
    }
    public void editAddress(String name,String address)
    {
    	System.out.println(name+", "+address);
        address="Coimbatore";
        System.out.println(name+", "+address);
    }
    public void placeOrder()
    {
    	System.out.println("Order placed successfully!");
    }
    /*public void displayProfileDetails(Users object)
    {
    
    }*/
}

class Suppliers extends Users 
{
	int sId;
    String sName;
    long sMob;
    String sAddress;
    int stock;
    String status;
    double rate;
    
    public Suppliers(int id,String name,long mob,String address,int stock,String status,double rate)
    {
    	this.sId=id;
    	this.sName=name;
    	this.sMob=mob;
    	this.sAddress=address;
    	this.stock=stock;
    	this.status=status;
    	this.rate=rate;
        System.out.println(name+", "+mob);
    }
    public void editAddress(String name,String address)
    {
    	System.out.println(name+", "+address);
        address="Delhi";
        System.out.println(name+", "+address);
    }
    public void increaseStockLevel(String name,int stock)
    {
    	System.out.println(name+", "+stock);
    }
    /*public void displayProfileDetails(Users object)
    {
    
    }*/
}