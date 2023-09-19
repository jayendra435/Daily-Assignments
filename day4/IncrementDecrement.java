package day4;

public class IncrementDecrement {
	private int number;
	
	public IncrementDecrement(){
		number = 0;
	}
	
	public IncrementDecrement(int start){
		number = start;
	}
	void Increment() {
		number++;
	}
	void Decrement(){
		number --;
	}
	void display() {
		System.out.println("The present counter value :: "+number);
	}
}
