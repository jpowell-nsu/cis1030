package driver;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Random random = new Random();
		
		Scanner scnr = new Scanner(System.in);
		//final int SECRET = 42;			// final creates a constant
		
		final int SECRET = random.nextInt(100) + 1;
		final int MAX_ATTEMPTS = 5;		
		int attempts = 0;
        boolean guessedCorrectly = false;
        int guess;
        
        while (!guessedCorrectly && attempts < MAX_ATTEMPTS) {
        	System.out.print("Guess the number [1, 100]: ");
        	guess = scnr.nextInt();
            attempts++;

            if (guess == SECRET) {
            	guessedCorrectly = true;
            	System.out.println("You guessed it!");
            //} else {
            //	System.out.println("Wrong guess.");
            } else if (guess < SECRET) {
            	System.out.println("Wrong guess. The secret number is >.");
            } else {
            	System.out.println("Wrong guess. The secret number is <.");
            }
            
            if (guessedCorrectly == false && attempts < MAX_ATTEMPTS) {
            	System.out.println("Try again.");
            } 

        }
        
        System.out.println("Goodbye.");
		scnr.close();
	}

}
