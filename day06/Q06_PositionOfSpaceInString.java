package day06;
import java.util.Scanner;
public class Q06_PositionOfSpaceInString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		System.out.println("The positions of spaces are :: ");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				System.out.println(i);
			};
		}
	}

}
