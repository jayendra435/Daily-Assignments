package day6;

public class RegularEmployee extends Employee {
	protected int salary;

	public RegularEmployee(String name, String desg,int salary) {

		super(name, desg);

		this.salary = salary;
	}

	@Override

	public int getPay() {

		return salary;

	}

}
