package day07;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Q06_DaysBetweenDatesFixedFormat {

	public static void main(String[] args) {
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Enter the two days in format of dd-mm-yyyy");
		Scanner scan = new Scanner(System.in);
		String first = scan.next();
		String last = scan.next();
		scan.close();
		LocalDate one = LocalDate.parse(first,d);
		LocalDate two = LocalDate.parse(last,d);
		long days = ChronoUnit.DAYS.between(one, two);
		System.out.println("The number of days between :: "+days);
		
	}

}
