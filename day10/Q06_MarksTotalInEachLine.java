package day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q06_MarksTotalInEachLine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try(FileReader fr = new FileReader("Marks.txt");
				BufferedReader br = new BufferedReader(fr)) 
		{
			while(true) {
				
				int total=0;
				String s = br.readLine();
				if(s==null) {
					break;
				}
				String arr[]=s.split(",");
				for(String j:arr) {
					total+=Integer.parseInt(j);
				}
				System.out.println("The sum of Marks is :"+total);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
