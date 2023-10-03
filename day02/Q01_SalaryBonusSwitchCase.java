package day02;
import java.util.Scanner;
public class Q01_SalaryBonusSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the day of the week");
		System.out.println("1,2,3,4,5,6,7");
		int day = scan.nextInt();
		System.out.println("Enter the number of hours worked");
		int hours = scan.nextInt();
		scan.close();
		int result = switch(day) {
		case 1,2,3 -> 200;
		case 4,5 -> 400;
		case 6->600;
		case 7->700;
		default ->0;
		};
		double total_wage = result*hours;
		
		if(total_wage>2000) {
			total_wage+=(total_wage*0.10);
		}
		
		System.out.println("The total wage including bonus is :: "+total_wage);
	};

}
