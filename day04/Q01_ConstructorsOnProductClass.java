package day04;

public class Q01_ConstructorsOnProductClass {

	public static void main(String[] args) {
		ProductDetails obj1= new ProductDetails();
		ProductDetails obj2= new ProductDetails(120,20000,"samsung mobile",3);
		ProductDetails obj3= new ProductDetails(121,23842,"Umbrella");
		obj1.display();
		obj2.display();
		obj3.display();
	}

}
