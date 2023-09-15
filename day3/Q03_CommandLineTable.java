package day3;

public class Q03_CommandLineTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,length;
		num=Integer.parseInt(args[0]);
		if(args.length<2) {
			length=10;
		}
		else {
			length=Integer.parseInt(args[1]);
		}
		for(int i=1;i<=length;i++) {
			System.out.printf("%d x %d = %d\n",num,i,num*i);
		}
		
	}
	

}
