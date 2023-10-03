package day04;

public class ProductDetails {
	private int prod_id;
	private int prod_price;
	private String prod_name;
	private int quan_on_hand;

	public ProductDetails() {
		System.out.println("Default Constructor is being called");
	}

	public ProductDetails(int pid, int pprice, String pname, int qah) {
		prod_id = pid;
		prod_price = pprice;
		prod_name = pname;
		quan_on_hand = qah;
	}

	public ProductDetails(int pid, int pprice, String pname) {
		prod_id = pid;
		prod_price = pprice;
		prod_name = pname;
		System.out.println("The quantity on hand is set to 1 ");
		quan_on_hand = 1;
	}

	public void display() {
		System.out
				.println("product id :: " + prod_id + " product name:: " + prod_name + " prod price :: " + prod_price);
		System.out.println("Quantity on hand " + quan_on_hand);
	}
}
