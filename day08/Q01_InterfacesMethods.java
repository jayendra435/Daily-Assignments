package day08;

interface Account{
	void deposit(int amount);
	int getBalance();
}

public class Q01_InterfacesMethods implements Account {
	private String name;
	private double account;
	private int amount;
	public static void main(String[] args) {
		Q01_InterfacesMethods obj = new Q01_InterfacesMethods("jay",1234234234,20000);
		System.out.println(obj.getBalance());
		obj.deposit(200);
		System.out.println(obj.getBalance());
	}
	 Q01_InterfacesMethods(String name, double account,int amount){
		this.name = name;
		this.account=account;
		this.amount=amount;
	}
	public void deposit(int new_amount) {
		this.amount+=new_amount;
	}
	public int getBalance() {
		return amount;
	}
}
