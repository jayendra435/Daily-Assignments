package day9;

public class Q03_InsufficientBalanceException {

	public static void main(String[] args) {
		BankTransactions obj = new BankTransactions("Chowdary Jayendra", 4001, 1000);
		obj.displayDetails();
		obj.deposit(200);
		System.out.println();
		try {
			obj.withdraw(800);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println();
		try {
			obj.withdraw(800);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	 finally {
			obj.displayDetails();
		}
	}

}

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("InsufficientBalanceException");
	}

	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

class BankTransactions {
	private String name;
	private long accountNumber;
	private int balanceAmount;

	public BankTransactions(String name, long accountNumber, int balanceAmount) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balanceAmount = balanceAmount;
	}

	public void deposit(int amount) {
		balanceAmount += amount;
		System.out.println("Deposit Successful");
	}

	public void withdraw(int amount) throws InsufficientBalanceException {
		if (amount > this.balanceAmount) {
			throw new InsufficientBalanceException();
		}
		balanceAmount -= amount;
		System.out.println("Withdraw Successful");
	}

	public void displayDetails() {
		System.out.println("Details are::");
		System.out.println(
				"Name:: " + name + "\nAccount Number:: " + accountNumber + "\nBank Balance:: " + balanceAmount + "\n");
	}
}