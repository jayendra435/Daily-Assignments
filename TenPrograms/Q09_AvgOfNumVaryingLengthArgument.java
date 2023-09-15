package TenPrograms;

public class Q09_AvgOfNumVaryingLengthArgument {

	public static void main(String[] args) {
			avg(1,2,4,4,5,6,22);
			avg(2,3,4,5);
			avg(1,1,1);
	}
	public static void avg(int ... arr) {
		int sum=0;
		for(int n: arr) {
			sum+=n;
		}
		double d = sum/arr.length;
		System.out.println("The average is :: "+d);
		
	}

}
