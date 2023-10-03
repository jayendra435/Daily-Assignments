package day10;
import java.util.Scanner;
import java.io.*;
public class Q03_CountCasesFromAFIle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the source file name ");
		String s = scan.next();
		int upper=0,lower=0,number=0;
		try {
			FileReader fr = new FileReader(s);
			int n;
			char ch;
			while(true) {
				n=fr.read();
				if(n==-1) {
					break;
				}
				ch = (char)n;
				if(Character.isUpperCase(ch)) {
					upper++;
				}
				else if(Character.isLowerCase(ch))
				{
					lower++;
				}
				else if(ch>='0'&& ch<='9') {
					number++;
				}
				else {
					
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("The number of Upper Case letters are:: "+upper);
			System.out.println("The number of Lower Case letters are:: "+lower);
			System.out.println("The number of Digits are:: "+number);
		}
	}

}
