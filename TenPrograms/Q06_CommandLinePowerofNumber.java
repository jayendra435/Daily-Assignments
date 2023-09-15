package TenPrograms;

public class Q06_CommandLinePowerofNumber {

	public static void main(String[] args) {
		int base = Integer.parseInt(args[0]);
		int power = Integer.parseInt(args[1]);
		
		int prod=1;
		for(int i=0;i<power;i++) {
			prod*=base;
		}
		System.out.print(prod);
	}

}
