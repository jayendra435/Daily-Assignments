package day3;

public class ProductDetails {
	private int prod_id;
	private int prod_price;
	private String prod_name;
	private int quan_on_hand=1;//defaulty lets have one quantity of product 
	
	public void init(int pid,String pname,int pprice) {
		prod_id = pid;
		prod_name = pname;
		prod_price = pprice;
	}
	
	public int getNetPrice() {
		double val =(prod_price+( prod_price*0.12));
		return (int)val;
	}
	
	public void sell() {
		if(quan_on_hand==0) {
			System.out.println("Product id:: "+prod_id+"\nProduct name :: "+prod_name);
			System.out.println("There are no products left to sell\n");
		}
		else {
			System.out.println("Product sold");
			quan_on_hand--;
			System.out.println("Product id:: "+prod_id+"\nProduct name :: "+prod_name);
			System.out.println("The items left are :: "+quan_on_hand+"\n");
		}
	}
	
	public void purchage() {
		quan_on_hand++;
		System.out.println("Product id:: "+prod_id+"\nProduct name :: "+prod_name);
		System.out.println("The items left are :: "+quan_on_hand+"\n");
	}
	
	

}
