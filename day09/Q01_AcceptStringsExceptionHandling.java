package day09;
import java.util.Scanner;
public class Q01_AcceptStringsExceptionHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total=0;
		System.out.println("Enter the 5 numbers:: ");
		for(int i=0;i<5;i++) {
			String s = scan.next();
			try {
				int n = Integer.parseInt(s);
				total+=n;
				
			}
			catch(NumberFormatException e){
				System.out.println("please enter Strings only");
				i--;
			}
		}
		System.out.println("The sum of the numbers is :; "+total);
	}

}
