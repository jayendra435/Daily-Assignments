package day6;

public class Q01_RunTimePolymorphism {

	public static void main(String[] args) {
		Employee employees[] =

				{ 
						new RegularEmployee("Steve", "Programmer", 25000),

						new Consultant("Kevin", "DBA", 10, 500),

						new RegularEmployee("Tom", "System Analyst", 45000)

				};
		for (Employee e : employees)

			System.out.printf("%s:%d\n",e.getName(), e.getPay());

}
}
