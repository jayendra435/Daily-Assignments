package day12;

import java.util.Comparator;
import java.util.TreeSet;

public class Q01_TreeSetSortStrings {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() != s2.length()) {
					return s1.length() - s2.length();
				} else {
					return s1.compareTo(s2);
				}
			}
		});
		ts.add("jayendra");
		ts.add("Satish");
		ts.add("Chakitha");
		ts.add("jahnavi");

		for (String s : ts) {
			System.out.println(s);
		}
	}
}
