import java.util.*;
class Item
{
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
 
class Customer extends Item
{
	private String product;
	private int quantity;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

class Bill extends Customer
{
	public int total(int price,int q)
	{
		int result=price*q;
		return result;
	}
}

class Main
{
  public static void main(String[] args)
  {
    	Scanner sc=new Scanner(System.in);
		String pr=sc.nextLine();
		int price=sc.nextInt();
		int q=sc.nextInt();
		
		Item i = new Item();
		Customer c = new Customer();
		Bill bi = new Bill();
		
		i.setPrice(price);
		c.setQuantity(q);
		
		int a=i.getPrice();
		int b=c.getQuantity();
		System.out.println("Total Price is : "+bi.total(a, b));
	}
}