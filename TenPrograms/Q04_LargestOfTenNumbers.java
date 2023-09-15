package TenPrograms;
import java.util.Scanner;
public class Q04_LargestOfTenNumbers {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 10 numbers::");
		int [] arr = new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		int greatest = arr[0];
		for(int i=0;i<10;i++) {
			if(arr[i]>greatest) {
				greatest=arr[i];
			}
		}
		System.out.println("The greatest of those 10 numbers is :: "+greatest);
	}

}
