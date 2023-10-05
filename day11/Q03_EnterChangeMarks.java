package day11;

import java.io.RandomAccessFile;

class raf {
	RandomAccessFile raf;

	raf() {
		try {
			raf = new RandomAccessFile("rafOperations.txt", "rw");
			raf.writeInt(1);
			raf.writeInt(79);

			raf.writeInt(2);
			raf.writeInt(59);

			raf.writeInt(3);
			raf.writeInt(58);
		} catch (Exception e) {

		}
	}

	void searchMarks(int s) {
		try {
			int see = 0;
			while (see <= raf.length() - 4) {
				raf.seek(see);
				if (raf.readInt() == s) {
					raf.seek(see + 4);
					System.out.println("Marks are :: " + raf.readInt());
					break;
				}
				see += 8;
			}

		} catch (Exception e) {

		}
	}

	void enterNewMarks(int id, int marks) {
		try {
			raf.writeInt(id);
			raf.writeInt(marks);
		} catch (Exception e) {

		}
	}

	void alterMarks(int id, int newMarks) {
		try {
			int see = 0;
			while (see <= raf.length() - 4) {
				raf.seek(see);
				if (raf.readInt() == id) {
					raf.seek(see + 4);
					raf.writeInt(newMarks);
					break;
				}
				see += 8;
			}

		} catch (Exception e) {

		}

	}

	void display() {
		try {
			int see = 0;
			raf.seek(see);
			int tl = (int) raf.length();
			int num = (int) tl / 8;
			for (int i = 0; i < num; i++) {
				System.out.print(raf.readInt() + " ");
				see += 4;
				raf.seek(see);
				System.out.print(raf.readInt() + "\n");
				see += 4;
				raf.seek(see);
			}

		} catch (Exception e) {

		}
	}
}

public class Q03_EnterChangeMarks {

	public static void main(String[] args) {

		raf obj = new raf();
		obj.display();
		System.out.println();
		obj.searchMarks(2);
		obj.alterMarks(2, 60);
		obj.display();
		System.out.println();
		obj.enterNewMarks(6, 38);
		obj.display();
	}

}
