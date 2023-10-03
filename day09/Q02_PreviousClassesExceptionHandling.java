package day09;

public class Q02_PreviousClassesExceptionHandling {
// this is the program of taking input from command line arguments to print table
	public static void main(String[] args) {
		int mul=10;
		int num=0;
		try {
			num=Integer.parseInt(args[0]);
			mul=Integer.parseInt(args[1]);
		}
		catch(NumberFormatException e) {
			System.out.println("give only numbers in command line Arguments..");
			System.out.println("Strings not allowed");
			num=0;
			mul=0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			if(args.length==0) {
				System.out.println("Enter one or two command line arguments");
				mul=0;
			}
		}
		finally {
			for(int i=1;i<=mul;i++) {
				System.out.println(num + " x "+ i +" = "+num*i );
			}
		}
		
	}

}

