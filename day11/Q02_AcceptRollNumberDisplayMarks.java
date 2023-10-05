package day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q02_AcceptRollNumberDisplayMarks {

	public static void main(String[] args) {
		System.out.println("Enter the id number:: ");
		try(Scanner scan = new Scanner(System.in);
				FileReader fr = new FileReader("RollNoMarks.txt");
				BufferedReader bw = new BufferedReader(fr)){
				String id = scan.next();
			    while(true) {
			    	String s = bw.readLine();
			    	if(s==null) {
			    		break;
			    	}
			    	String arr []= s.split(" ");
			    	if(arr[0].equals(id)) {
			    		System.out.print(arr[1]);
			    		break;
			    	}
			    }
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
