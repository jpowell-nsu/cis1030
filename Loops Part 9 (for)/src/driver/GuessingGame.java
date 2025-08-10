package driver;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		final int SECRET = 42;			// final creates a constant
		final int MAX_ATTEMPTS = 5;		
		
        boolean guessedCorrectly = false;
        int guess;
        
        for (int attempts = 0; attempts < MAX_ATTEMPTS && !guessedCorrectly; attempts++) {
        	System.out.print("Guess the number [1, 100]: ");
        	guess = scnr.nextInt();
            attempts++;

            if (guess == SECRET) {
            	guessedCorrectly = true;
            	System.out.println("You guessed it!");
            } else if (guess < SECRET) {
            	System.out.println("Wrong guess. The secret number is >.");
            } else {
            	System.out.println("Wrong guess. The secret number is <.");
            }
            
            if (guessedCorrectly == false && attempts < MAX_ATTEMPTS) {
            	System.out.println("Try again.");
            } 
        }

        scnr.close();
	}

}
