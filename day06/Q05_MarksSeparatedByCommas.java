package day06;
import java.util.Scanner;
public class Q05_MarksSeparatedByCommas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the comma separated array");
		String mString = scan.nextLine();
		String [] arr = mString.split(",");
		int total=0;
		for(String val: arr) {
			total+=Integer.parseInt(val);
		}
		System.out.println("The total is :: "+total);
	}

}
