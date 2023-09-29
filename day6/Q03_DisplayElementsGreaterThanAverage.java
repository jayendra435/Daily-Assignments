package day6;
import java.util.Random;
public class Q03_DisplayElementsGreaterThanAverage {

	public static void main(String[] args) {
		
		System.out.println("The array is :: ");
		int [] arr = new int[10];
		Random rand = new Random();
		for(int i=0;i<10;i++) {
			int ele = rand.nextInt(100); // Random numbers below 100
			arr[i]=ele;
		}
		int total=0;
		for(int i: arr) {
			System.out.print(i+" ");
			total+=i;
		}
		System.out.println();
		System.out.println("The elements greater than average of array are");
		for(int i : arr) {
			if(i>(total/10)) {
				System.out.print(i+" ");
			}
		}
	}

}
