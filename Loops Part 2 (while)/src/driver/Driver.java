package driver;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// initialization
		// while (condition) {
		//
		//		loop body
		//
		//		update for conditional
		// }
		
		
		int n = 100;
		int sum = 0;
        int i = 1;
		while (i <= n) {
			sum += i;
			// System.out.println(sum);
			i++;
		}
        
		System.out.println("Sum from 1 to " + n + " is " + sum);
		System.out.println("i=" + i);
		
		// -------------------------------------------------
		int x = 0;
		int y = 10;

		while (x < 5 && y > 5) {
			System.out.println("x: " + x + ", y: " + y);
			x++;
			y = y - 2;
		}
		
		// -------------------------------------------------
		int number = 1;

		while (number <= 10) {
			if (number % 2 == 0) {
				System.out.println(number + " is even");
			} else {
				System.out.println(number + " is odd");
			}
			number++;
		}		
		
		// -------------------------------------------------
		String input = "";

		// input was initialized at declaration
		while (!input.equals("exit")) {
			System.out.print("Enter something (type 'exit' to stop): ");
			input = scnr.nextLine();	// this is input, but it is updating the condition too
			System.out.println("You typed: " + input);
		}   
       
		// -------------------------------------------------
		int row = 1;
		int col;
		while (row <= 5) {
			col = 1;
			while (col <= 5) {
				System.out.print((row * col) + "\t");
				col++;
			}
			System.out.println(); // new line after each row
			row++;
		}	

		scnr.close();
	}

}
