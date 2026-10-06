import java.util.Scanner;
import java.util.Random;

public class guess {
	
	public static void main (String[] args) {

		
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		int number = random.nextInt(100) + 1;
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		System.out.println("Type a number: " );
		int pick = in.nextInt();

		
		System.out.println("Your guess is: " + pick);
		for (int count = 0; count <= 3; count++) {
			if (pick > number) {
				System.out.println("Your number was too high");
				System.out.println("Pick a new number: ");
				pick = in.nextInt();
				count++;
			} else if (pick < number) {
				System.out.println("Your number was too low");
				System.out.println("Pick a new number: ");
				pick = in.nextInt();
				count++;
			} else if (pick == number) {
				System.out.println("You got it");
				return;
			}
			}

	}
}
