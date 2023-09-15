package TenPrograms;

public class Q02_PalindromeBetween1000To2000 {

	public static void main(String[] args) {
		for(int i=1000;i<=2000;i++) {
			isPalindrome(i);
		}
	}
	public static void isPalindrome(int num) {
		int temp=num;
		int rev=0;
		while(num!=0) {
			rev=(rev*10)+num%10;
			num/=10;
		}
		if(rev==temp) {
			System.out.println(temp);
		}
		
	}

}
