package day02;
import java.util.Scanner;
public class Q05_ArrayInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			System.out.print("Enter the number at index "+i+" ::");
			arr[i]=scan.nextInt();
		}
		scan.close();
		System.out.println("The reverse array is ");
		for(int i=4;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
