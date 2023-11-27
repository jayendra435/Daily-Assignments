package exam1;
//package practice;

import java.util.ArrayList;

public class Banking {
	public static void main(String args[]) {
		Bank bank = new Bank("current", "John Doe", 123456, 1000);
        bank.deposit(123456, 500);
        bank.viewBalance(123456);
        bank.withdraw(123456, 200);
        bank.withdraw(123456, 200);
        bank.withdraw(123456, 200);
        bank.withdraw(123456, 1100);
        bank.withdraw(123456, 100);
        bank.viewBalance(123456);
        System.out.println("---------------------");
        Bank bank2 = new Bank("savings", "Jane Doe", 789012, 500);
        bank2.deposit(789012, 300);
        bank2.viewBalance(789012);
        bank2.withdraw(789012, 600);
        bank2.viewBalance(789012);
	}
}

interface Accounts {
	void deposit(int amount);

	void withdraw(int amount);

	int viewBalance();

	int getAccountNumber();
}

class SavingsAccount implements Accounts {
	private String name;
	private int AccountNumber;
	private int balance = 0;

	public SavingsAccount(String name, int AccountNumber, int balance) {
		this.name = name;
		this.AccountNumber = AccountNumber;
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance += amount;
		System.out.println("deposition successful");
	}

	public void withdraw(int amount) {
		if (amount > this.balance) {
			System.out.println("Insufficient amount");
		} else {
			balance -= amount;
			System.out.println("withdraw Successful");
		}
	}

	public int viewBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}
}

class CurrentAccount implements Accounts {
	private String name;
	private int AccountNumber;
	private int balance = 0;

	private int overFlow = 300;

	public CurrentAccount(String name, int AccountNumber, int balance) {
		this.name = name;
		this.AccountNumber = AccountNumber;
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance += amount;
		System.out.println("deposition successful");
	}

	public void withdraw(int amount) {
		if (amount > this.balance + overFlow) {
			System.out.println("Insufficient Amount");
		} else {
			if (balance > amount)
				balance -= amount;
			else {
				overFlow -= (amount - balance);
				balance = 0;
			}
			System.out.println("withdraw Successful");
		}
	}

	public int viewBalance() {
		System.out.println("overflow is " + overFlow);
		return balance;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}
}

class Bank {
	private String AccountType;
	private String name;
	private int AccountNumber;
	private int balance = 0;
	ArrayList<Accounts> li = new ArrayList<>();

	public Bank(String AccountType, String name, int AccountNumber, int balance) {
		if (AccountType.equals("current")) {
			li.add(new CurrentAccount(name, AccountNumber, balance));
		} else if (AccountType.equals("savings")) {
			li.add(new SavingsAccount(name, AccountNumber, balance));
		} else {
			System.out.println("invalid");
		}
	}

	public void viewBalance(int AccountNumber) {
		for (Accounts obj : li) {
			if (obj.getAccountNumber() == AccountNumber) {
				System.out.println(obj.viewBalance());
			}
		}
	}

	public void deposit(int AccountNumber, int amount) {
		for (Accounts obj : li) {
			if (obj.getAccountNumber() == AccountNumber) {
				obj.deposit(amount);
			}
		}
	}

	public void withdraw(int AccountNumber, int amount) {
		for (Accounts obj : li) {
			if (obj.getAccountNumber() == AccountNumber) {
				obj.withdraw(amount);
			}
		}
	}
}