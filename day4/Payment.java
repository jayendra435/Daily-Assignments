package day4;

public class Payment {
	private int ad_no,fee;
	private String name, course;
	private int price;
	public Payment(int admin_no, String stu_name, String course_joined, int fees_paid) {
		ad_no = admin_no;
		name = stu_name;
		course = course_joined;
		fee = fees_paid;
		
		if( course == "java") {
			price = 10000;
		}
		else if(course == "python") {
			price = 7500;
		}
		else {
			System.out.println("error");
			price =0;
		}
	}
	public void getTotalFee() {
		System.out.println("The price of course "+course +" is "+price);
	}
	public void getDue() {
		System.out.println("The due you have to pay is :: "+(price-fee));
	}
	public void getFeePaid() {
		System.out.println("The fee you have paid is :: "+fee);
	}
	public void payment(int newPayment) {
		fee+=newPayment;
		System.out.println("Payment Successful");
	}
}
