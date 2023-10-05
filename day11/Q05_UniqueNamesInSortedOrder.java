package day11;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
public class Q05_UniqueNamesInSortedOrder {
	public static void main(String[] args) {
		try {
			Path p = Paths.get("names.txt");
			List<String> lines = Files.readAllLines(p);
			TreeSet<String> s = new TreeSet<String>();
//			SortedSet<String> s = new TreeSet<String>();
			for(String str: lines) {
				s.add(str);
			}
			for(String str: s) {
				System.out.println(str);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
