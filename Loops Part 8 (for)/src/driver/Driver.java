package driver;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// for (initialization; condition; update condition) {
		//
		//		loop body
		//
		// }
		
		int n = 100;
		int sum = 0;
		int i;
		for (i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("Sum from 1 to " + n + " is " + sum);
		
		// -------------------------------------------------
		for (int x = 0, y = 10; (x < 5 && y > 5); x++, y --) {
			System.out.println("x: " + x + ", y: " + y);
		}
		
		// -------------------------------------------------		
		for (int number = 1; number <= 10; number++) {
			if (number % 2 == 0) {
				System.out.println(number + " is even");
			} else {
				System.out.println(number + " is odd");
			}		
		}

		// -------------------------------------------------
		String input = "";

		for ( ; !input.equals("exit"); ) {
			System.out.print("A- Enter something (type 'exit' to stop): ");
			input = scnr.nextLine();	// this is input, but it is updating the condition too
			System.out.println("A- You typed: " + input);
		}   

		for (String in = ""; !in.equals("exit"); in = scnr.next(), System.out.println("B- You typed: " + in)) {
			System.out.print("B- Enter something (type 'exit' to stop): ");
		}   
       
		// -------------------------------------------------
		
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print((row * col) + "\t");
			}
			System.out.println(); // new line after each row
		}

		scnr.close();
	}

}
