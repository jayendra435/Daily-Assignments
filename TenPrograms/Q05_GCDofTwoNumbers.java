package TenPrograms;
import java.util.Scanner;
public class Q05_GCDofTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:: ");
		int first = scan.nextInt();
		System.out.println("Enter the second number: ");
		int second = scan.nextInt();
		scan.close();
		System.out.println("The gcd of two numbers is :: "+GCD(first,second));
	}
	public static int GCD(int a, int b) {
		if(a%b==0) {
			return b;
		}
		else {
			return GCD(b,a%b);
		}
	}
}
