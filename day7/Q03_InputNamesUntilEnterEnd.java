package day7;

import java.util.Scanner;
public class Q03_InputNamesUntilEnterEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string:: ");
		String s,full="";
		s = scan.next();
		if(s.equals("end")) {
			System.out.println("");
		}
		else {
			full+=s;
			while(true) {
				s = scan.next();
				if(s.equals("end")) {
					break;
				}
				else {
					full+=" - "+s;
				}
			}
		}
		System.out.println(full);

	}

}
