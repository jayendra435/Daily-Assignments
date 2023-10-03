package day10;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Q02_PutNamesInTextFile {

	public static void main(String[] args) {
		String s;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the names");
		System.out.println("Enter \"END\" to stop");
		try {
			File f = new File("src/day10/names.txt");
			FileWriter fw = new FileWriter("src/day10/names.txt");
			f.createNewFile();
			while(true) {
				s=scan.next();
				if(s.equals("END")) {
					break;
				}
				fw.write(s+"\n");
			}
			fw.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
