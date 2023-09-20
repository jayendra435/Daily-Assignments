package day5;

public class Q03_FactorySuperSubClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(121,"Rajesh");
		e.print();
		
		FactoryEmployee fe = new FactoryEmployee(122,"jay",200,"Sales");
		fe.print();

	}

}
