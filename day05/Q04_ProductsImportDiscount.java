package day05;

public class Q04_ProductsImportDiscount {

	public static void main(String[] args) {
		//for products
		Products p = new Products("Samsung",12000);
		p.print();
		p.setPrice(13000);
		p.print();
		
		System.out.println();
		
		ImportedProducts i = new ImportedProducts("Redmi",15000,10);
		i.print();
		i.getNetPrice();
		i.setImportDuty(20);
		i.setPrice(20000);
		i.getNetPrice();
		i.print();
		
		System.out.println();
		
		DiscountedProducts d= new DiscountedProducts("Realme",40000,30);
		d.print();
		d.getNetPrice();
		d.setDiscountRate(35);
		d.setPrice(50000);
		d.getNetPrice();
		d.print();
		
		//upcasting 
		System.out.println();
		Products p1 = i;
		Products p2 = d;
		
		p1.print();
		System.out.println();
		p2.print();
		
		System.out.println();
		
		
		
		// downcasting
		ImportedProducts ip = (ImportedProducts)p1;
		ip.getNetPrice();
		
	}

}
