package day2;

import java.util.Scanner;
public class Q04_ReverseTheNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :: ");
		int n = scan.nextInt();
		scan.close();
		int res=0;
		while(n!=0) {
			res=(res*10)+(n%10);
			n=n/10;
		}
		System.out.println("The reverse number is :: "+res);
		
	}

}
