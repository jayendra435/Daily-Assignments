package day3;

public class ProductDetails {
	private static 	int prod_id;
	private static int prod_price;
	private static String prod_name;
	private static int quan_on_hand=1;//defaulty lets have one quantity of product 
	
	public static void init(int pid,String pname,int pprice) {
		prod_id = pid;
		prod_name = pname;
		prod_price = pprice;
	}
	
	public static int getNetPrice() {
		double val =(prod_price+( prod_price*0.12));
		return (int)val;
	}
	
	public static void sell() {
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
	
	public static void purchage() {
		quan_on_hand++;
		System.out.println("Product id:: "+prod_id+"\nProduct name :: "+prod_name);
		System.out.println("The items left are :: "+quan_on_hand+"\n");
	}
	
	

}
