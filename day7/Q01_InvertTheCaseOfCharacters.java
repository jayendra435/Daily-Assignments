package day7;

import java.util.Scanner;

public class Q01_InvertTheCaseOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :: ");
		String s = scan.nextLine();
		char arr[] = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (Character.isUpperCase(ch)) {
				arr[i]=Character.toLowerCase(ch);
			}
			else if (Character.isLowerCase(ch)) {
				arr[i]=Character.toUpperCase(ch);
			}
			else {
			}
		}
		s=new String(arr);
		System.out.println("The inverted String is");
		System.out.println(s);
	}

}
