package day5;

public class Person {
	protected String name, email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println();
		System.out.println("name :: "+this.name);
		System.out.println("Email is : " +this.email);
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("Email changed");
	}

}
