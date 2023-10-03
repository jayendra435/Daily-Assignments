package day06;

public abstract class Employee {
	protected String name, desg;
	public Employee(String name, String desg) {
		this.name = name;
		this.desg = desg;
	}
	final public String getDesg() {
		return desg;
	}
	
	final public void setDesg(String desg) {
	
		this.desg = desg;
	}
	final public String getName() {

		return name;
	
	}
	
	public abstract int getPay();
	 
}
