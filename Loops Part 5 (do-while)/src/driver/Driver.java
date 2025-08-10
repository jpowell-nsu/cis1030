package driver;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// initialization
		// do {
		//
		//		loop body
		//
		//		update condition
		// } while (condition);
		
		int i = 1;
		int n = 100;
		int sum = 0;
        
		do {
			sum += i;
			i++;
		} while (i <= n);
        
		System.out.println("Sum from 1 to " + n + " is " + sum);
		
		// -------------------------------------------------
		int x = 0;
		int y = 10;

		do {
			System.out.println("x: " + x + ", y: " + y);
			x++;
			y--;
		} while (x < 5 && y > 5);
		
		// -------------------------------------------------
		int number = 1;

		do {
			if (number % 2 == 0) {
				System.out.println(number + " is even");
			} else {
				System.out.println(number + " is odd");
			}
			number++;
		} while (number <= 10);		
		
		// -------------------------------------------------
		String input; // = "";

		do {
			System.out.print("Enter something (type 'exit' to stop): ");
			input = scnr.nextLine();	// this is input, but it is updating the condition too
			System.out.println("You typed: " + input);			
		} while (!input.equals("exit"));
        
		// -------------------------------------------------
		int row = 1;
		int col;
		do {
			
			col = 1;
			while (col <= 5) {
				System.out.print((row * col) + "\t");
				col++;
			}
			System.out.println(); // new line after each row
			row++;		
			
		} while (row <= 5);


		scnr.close();
	}

}
