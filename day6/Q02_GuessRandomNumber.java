package day6;
import java.util.Random;
import java.util.Scanner;
public class Q02_GuessRandomNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("lets play a game");
		System.out.println("One Random number will be generated between 0 to 25");
		System.out.println("You will be given three chances to guess the number");
		int number = rand.nextInt(25)+1;
		System.out.println("Random number is generated \nguess it \nEnter the number");
		int answer = scan.nextInt();
		if(answer==number) {
			System.out.println("Correct guess");
		}
		else {
			System.out.println("Guess again:");
			answer = scan.nextInt();
			if(answer==number) {
				System.out.println("Correct guess");
			}
			else {
				System.out.println("Guess again:");
				answer = scan.nextInt();
				if(answer==number) {
					System.out.println("Correct guess");
				}
				else {
					System.out.println("Trials are over");
					System.out.println("The actual random number generated is "+number);
				}
				
			}
		}
	}

}
