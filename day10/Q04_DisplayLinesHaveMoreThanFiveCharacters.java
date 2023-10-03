package day10;
import java.io.BufferedReader;
import java.io.FileReader;
public class Q04_DisplayLinesHaveMoreThanFiveCharacters {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("source.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while(true) {
				s=br.readLine();
				if(s==null) {
					break;
				}
				if(s.length()>=5) {
					System.out.println(s);
				}
			}
			fr.close();
			br.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
