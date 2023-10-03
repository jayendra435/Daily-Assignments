package day10;

import java.util.Scanner;

public class Q01_AcceptNumbersUntilO {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		int total=0,inter;
		try {
			System.out.println("Enter the numbers:: ");
			System.out.println("Enter \"O\" to stop the program");
			while (true) {
				s = scan.next();
				if (s == "O") {
					break;
				}
				inter=Integer.parseInt(s);
				if(inter%2==0) {
					total+=inter;
				}
			}

		} catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());

		} finally {
			System.out.println("The sum of positive numbers is :: "+total);
			scan.close();
			
		}
	}

}
