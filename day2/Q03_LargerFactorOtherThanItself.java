package day2;
import java.util.Scanner;
public class Q03_LargerFactorOtherThanItself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:: ");
		int n = scan.nextInt();
		scan.close();
		int res=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				res=i;
			}
		}
		System.out.println("The biggest factor of number "+n+" Other than itself is "+res);
	}

}
