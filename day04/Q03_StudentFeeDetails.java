package day04;

public class Q03_StudentFeeDetails {

	public static void main(String[] args) {
		Payment p1 = new Payment(110,"jayendra","python",5000);
		Payment p2 = new Payment(111,"satish","java",7000);
		p1.getTotalFee();
		p1.getFeePaid();
		p1.getDue();
		p1.payment(2000);
		p1.getTotalFee();
		p1.getFeePaid();
		p1.getDue();
		
		p2.getTotalFee();
		p2.getFeePaid();
		p2.getDue();
		p2.payment(2000);
		p2.getTotalFee();
		p2.getFeePaid();
		p2.getDue();
	}

}
