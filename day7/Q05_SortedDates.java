package day7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q05_SortedDates {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter number of dates you want to enter");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		String str[] = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = scan.next();
		}
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate str1[] = new LocalDate[n];
		for (int i = 0; i < n; i++) {
			str1[i] = LocalDate.parse(str[i], d);
		}
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=(str1[i].getYear()*10000)+(str1[i].getMonthValue()*100)+(str1[i].getDayOfMonth());
		}
		for (int i = 0; i < n; i++) {
			LocalDate temp = null;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = str1[i];
					str1[i] = str1[j];
					str1[j] = temp;
				}
			}
		}
		System.out.println("the sorted dates are");

		for (int i = 0; i < n; i++) {
			System.out.println(str1[i]);

		}

	}

}
