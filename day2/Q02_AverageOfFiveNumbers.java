package day2;
import java.util.Scanner;
public class Q02_AverageOfFiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum =0;
		int num;
		for(int i=0;i<5;i++) {
			System.out.println("Enter the number:: ");
			num = scan.nextInt();
			sum+=num;
		}
		scan.close();
		System.out.println("The average of 5 numbers is :: "+(float)sum/5);
	}

}
