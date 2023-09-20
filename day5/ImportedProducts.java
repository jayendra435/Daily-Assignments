package day5;

public class ImportedProducts extends Products {
	private int importDuty;

	public ImportedProducts(String name, int base_price, int importDuty) {
		super(name, base_price);
		this.importDuty = importDuty;
	}

	public void setImportDuty(int newImportDuty) {
		this.importDuty = newImportDuty;
	}

	public void print() {
		super.print();
		System.out.println("Import Duty(tax):: " + this.importDuty);
	}

//	public void setPrice(int newPrice) {
//		super.setPrice(newPrice);
//	}
	public void getNetPrice() {
		System.out.println("NetPrice after import duty is :: " + (base_price + ((base_price * importDuty / 100))));
	}
}
