package day03;
public class Q01_LargestOfIntegers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maximum = max(6,1,3,2,4,5);
		//int maximum = max(10,20,30);
		System.out.println("Maxium of above elements is :: "+maximum);
	}
	
	public static int max(int... nums) {
		int greatest = nums[0];
		for(int n: nums) {
			if(n>greatest) {
				greatest = n;
			}
		}
		return greatest;
	}

}
