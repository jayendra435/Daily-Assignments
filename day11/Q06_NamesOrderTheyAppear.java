package day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Q06_NamesOrderTheyAppear {

	public static void main(String[] args) {
		try {
			Path path1 = Paths.get("names1.txt");
			Path path2 = Paths.get("names2.txt");
			List<String> l1 = new ArrayList <String>();
			l1 = Files.readAllLines(path1);
			List<String> l2 = new ArrayList <String>();
			l2= Files.readAllLines(path2);
			LinkedHashSet <String>lhs = new LinkedHashSet<String>();
			for(String s: l1) {
				if(!(l1.contains(s) && l2.contains(s))) {
					lhs.add(s);
				}
			}
			for(String s: l2) {
				if(!(l1.contains(s) && l2.contains(s))) {
					lhs.add(s);
				}
			}
			for(String s: lhs) {
				System.out.println(s);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
