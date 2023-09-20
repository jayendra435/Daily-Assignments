package day5;

public class Employee {
	protected int emp_id;
	protected String emp_name;
	public Employee(int emp_id, String emp_name) {
		this.emp_id=emp_id;
		this.emp_name= emp_name;
	}
	public void print() {
		System.out.println("Employee id :: "+emp_id);
		System.out.println("Employee name:: "+emp_name);
	}
}
