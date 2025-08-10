package driver;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int num;
		
		while (true) {
			// Less readable (harder to tell how the loop ends).
			// Logic is embedded inside the body.
			// Breaks single-responsibility principle for control logic.
			// Control logic decides when and how a loop runs. Good control logic should be:
			//	Easy to read
			//	Easy to maintain
			//	Easy to modify or debug
			
			// The loop condition (true) says nothing about when to stop.
			// The exit condition is hidden inside the loop body.
			// The body is now doing two things: processing input and controlling the loop.
			// To change the exit condition, someone must inspect the loop body, not just the loop structure.
			
			System.out.print("Enter a number (0 to quit): ");
			num = scnr.nextInt();

			if (num == 0) {
				break; 		// bad design, poor coding
			}

			System.out.println("You entered: " + num);
		}
		
		System.out.println("Loop ended using break.");

		scnr.close();
	}

}
