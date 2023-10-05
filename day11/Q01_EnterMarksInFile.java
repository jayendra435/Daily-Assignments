package day11;

import java.io.RandomAccessFile;

public class Q01_EnterMarksInFile {

	public static void main(String[] args) {
		try(RandomAccessFile raf = new RandomAccessFile("Marks.dat","rw")){
			int arr[]= {11,22,11,33,14,33,44,2,3,4,1,5,22,55,66,33,22,77,88,99};
			for(int a: arr) {
				raf.writeInt(a);
			}
			raf.seek(0);
			int len = (int)(raf.length()/4);
			for(int i=0;i<len;i++) {
				System.out.println(raf.readInt());
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
