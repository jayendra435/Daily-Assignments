package day05;

public class Student extends Person {
	protected String courses;
	public Student(String name, String email, String courses) {
		super(name, email);
		this.courses=courses;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Courses are :: "+this.courses);
	}
	
	public void changeCourse(String courses) {
		this.courses=courses;
		System.out.println("Courses Changed");
	}

}
