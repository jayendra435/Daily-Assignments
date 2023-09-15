package day3;

public class Q04_ClassForProducts {

	public static void main(String[] args) {
		//Note:::::::::
		//ProductDetails class file is saved separately
		//name if it is ProductDetails
		ProductDetails ob = new ProductDetails();
		ob.init(1,"Mobile",1000);//default product quantity value is 1
		System.out.println("the net price is :: "+ob.getNetPrice()+"\n");//to print net price
		ob.sell();//quantity now became 0
		ob.sell();// prints no quantities left to sell
		ob.purchage();// quantity value is now became 1
		ob.purchage();// quantity value is now became 2
	}
}