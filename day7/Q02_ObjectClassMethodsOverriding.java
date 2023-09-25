package day7;

public class Q02_ObjectClassMethodsOverriding {

	public static void main(String[] args) {
		ObjectClassTesting oct1 = new ObjectClassTesting("jayendra",435);
		ObjectClassTesting oct2 = new ObjectClassTesting("Satish",224);
		ObjectClassTesting oct3 = new ObjectClassTesting("Satish",224);
		
		System.out.println("\n"+oct1.toString()+"\n");// toString
		
		System.out.println(oct1.equals(oct2));//equals
		System.out.println(oct2.equals(oct3)+"\n");
		
		System.out.println(oct1.hashCode());//hash
		System.out.println(oct2.hashCode());
		System.out.println(oct3.hashCode());
		
	}

}
