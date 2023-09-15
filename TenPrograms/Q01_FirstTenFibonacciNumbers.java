package TenPrograms;

public class Q01_FirstTenFibonacciNumbers {

	public static void main(String[] args) {
		System.out.println("The first 10 fibonacci numbers are;: ");
		System.out.print("0 1 ");
		int a=0,b=1;
		for(int j=2;j<10;j++) {
			int k= a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
		}

	}

}
