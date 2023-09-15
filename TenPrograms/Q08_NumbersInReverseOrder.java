package TenPrograms;
import java.util.Scanner;
public class Q08_NumbersInReverseOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:: ");
		int n = scan.nextInt();
		scan.close();
		while(n!=0) {
			System.out.print(n%10);
			n=n/10;
		}

	}

}
