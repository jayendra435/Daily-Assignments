package day06;

import java.util.Scanner;
public class Q04_DisplayStringVertically {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = scan.nextLine();
		String [] arr = s.split(" ");
		for(String ele: arr) {
			System.out.println(ele);
		}
	}

}
