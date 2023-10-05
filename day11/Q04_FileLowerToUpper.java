package day11;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Q04_FileLowerToUpper {
	public static void main(String[] args) {
	try {
		Path path = Paths.get("lowertoupperfile.txt");
		String s = Files.readString(path);
		s=s.toUpperCase();
		System.out.println(s);
		FileWriter fw = new FileWriter("lowertoupperfile.txt");
		fw.write(s);
		fw.close();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
