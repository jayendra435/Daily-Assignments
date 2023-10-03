package day06;

public class Consultant extends Employee {
	protected int nohours, hourrate;

	public Consultant(String name, String desg,int nohours, int hourrate) {

		super(name, desg);

		this.nohours = nohours;

		this.hourrate = hourrate;

	}

	@Override

	public int getPay() {

		return nohours * hourrate;

	}

}
