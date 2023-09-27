package day8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Q03_SortCollectionByNameOrPrice {

	public static void main(String[] args) {
		ArrayList <Product> Alist = new ArrayList<>();
		Alist.add(new Product("redmi",10000));
		Alist.add(new Product("Realmi",99000));
		Alist.add(new Product("Samsung",25000));
		Alist.add(new Product("Apple",1000));
		Collections.sort(Alist, new Product("",1));
		for (Product obj : Alist) {
			System.out.println(obj);
		}
	}
}

class Product implements Comparator<Product>{
	private String productName;
	private int productPrice;
	Product(String productName, int productPrice){
		this.productName= productName;
		this.productPrice= productPrice;
	}
	public String toString() {
		return "product name:: "+productName+" Product price:: "+productPrice;
	}
	public int getProductPrice() {
        return productPrice;
    }
	public int compare(Product p1, Product p2) {
		return p1.productPrice - p2.productPrice;
	}	
}
