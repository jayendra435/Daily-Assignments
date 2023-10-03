package day05;

public class DiscountedProducts extends Products {
	private int discountRate;

	public DiscountedProducts(String name, int base_price, int discountRate) {
		super(name, base_price);
		this.discountRate = discountRate;
	}

	public void setDiscountRate(int newDiscountRate) {
		this.discountRate = newDiscountRate;
	}

	public void print() {
		super.print();
		System.out.println("Discount rate:: " + this.discountRate);
	}
	
//	public void setPrice(int newPrice) {
//		super.setPrice(newPrice);
//	}
	public void getNetPrice() {
		System.out.println("NetPrice after discount price is :: " + (base_price - ((base_price * discountRate / 100))));
	}

}
