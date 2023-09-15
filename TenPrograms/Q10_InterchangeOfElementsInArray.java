package TenPrograms;
import java.util.Scanner;
public class Q10_InterchangeOfElementsInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 10 elements:: ");
		int [] arr = new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		System.out.println("The elements before interchange");
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<5;i++) {
			int temp = arr[i];
			arr[i]=arr[i+5];
			arr[i+5]=temp;
		}
		System.out.println("\nThe elements after interchange");
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
