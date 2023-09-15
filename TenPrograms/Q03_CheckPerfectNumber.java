package TenPrograms;
import java.util.Scanner;
public class Q03_CheckPerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:: ");
		int n = scan.nextInt();
		scan.close();
		int ts=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				ts+=i;
			}
		}
		if(ts==n) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not perfect number");
		}
	}

}
