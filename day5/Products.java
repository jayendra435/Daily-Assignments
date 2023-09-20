package day5;

public class Products {
	protected String name;
	protected int base_price;
	Products(String name, int base_price){
		this.name=name;
		this.base_price=base_price;
	}
	public void print() {
		System.out.println("Product name:: "+this.name);
		System.out.println("Product base price:: "+this.base_price);
	}
	public void setPrice(int new_price) {
		this.base_price=new_price;
	}
}
