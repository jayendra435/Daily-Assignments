package day05;

public class FactoryEmployee extends Employee{
	private int bus_no;
	private String emp_board;
	public FactoryEmployee(int emp_id,String emp_name,int bus_no, String emp_board) {
		super(emp_id, emp_name);
		this.bus_no=bus_no;
		this.emp_board=emp_board;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("bus_no :: "+bus_no);
		System.out.println("emp_board:: "+emp_board);
	}
}
