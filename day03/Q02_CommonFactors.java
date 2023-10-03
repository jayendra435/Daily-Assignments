package day03;

public class Q02_CommonFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCommonFactors(10,15,20,30);

	}
	public static void printCommonFactors(int ... nums) {
		int greatest = nums[0];
		for(int n: nums) {
			if(n>greatest) {
				greatest = n;
			}
		}
		System.out.print("The common factors are:: ");
		for(int i=1;i<=greatest;i++) {
			int flag=1;
			for(int j=0;j<nums.length;j++) {
				if(nums[j]%i!=0) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				System.out.print(i+" ");
			}
		}
	}

}
