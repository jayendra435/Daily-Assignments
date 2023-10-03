package day04;

public class Q02_CounterClass {

	public static void main(String[] args) {
		IncrementDecrement obj1= new IncrementDecrement();
		IncrementDecrement obj2= new IncrementDecrement(3);
		
		obj1.Decrement();
		obj2.Increment();
		obj1.Increment();
		obj1.display();
		obj1.Increment();
		obj1.display();
		obj2.display();
		
	}

}
