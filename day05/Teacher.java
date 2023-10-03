package day05;

public class Teacher extends Person {

	private String subjects;

	public Teacher(String name, String email, String subjects) {
		super(name, email); 
		this.subjects = subjects;
	}

	@Override

	public void print() { 
		super.print();
		System.out.println("The subjects are:: " +subjects);

	}

	public void setSubjects(String subjects) {

		this.subjects = subjects;
		System.out.println("Subject name changed");

	}

}
