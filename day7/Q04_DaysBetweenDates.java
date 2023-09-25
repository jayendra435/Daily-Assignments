package day7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Q04_DaysBetweenDates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two the dates in format of dd-mm-yyyy");
		String first, last;
		first = scan.nextLine();
		last = scan.nextLine();
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate one = LocalDate.parse(first, d);
		LocalDate two = LocalDate.parse(last, d);
		long days = ChronoUnit.DAYS.between(one, two);
		System.out.println("The days between are:: " + days);
	}

}
