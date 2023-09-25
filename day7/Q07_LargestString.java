package day7;
import java.util.Scanner;
public class Q07_LargestString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String largest = "";
		System.out.println("Keep entering strings.. press enter if you dont want anymore");
		while(true) {
			String s = scan.nextLine();
			if(s.isEmpty()) {
				break;
			}
			else {
				if(largest.length()<s.length()) {
					largest= s;
				}
			}
		}
		System.out.println(largest);
	}

}
