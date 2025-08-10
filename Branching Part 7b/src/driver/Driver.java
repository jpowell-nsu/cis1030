package driver;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String option = "X";
		double balance = 0.0;
		double amount = 0.0;
		
		do {
			System.out.println();
			System.out.println("Menu");
			System.out.println("D Deposit");
			System.out.println("W Withdraw");
			System.out.println("B Balance");
			System.out.println("X Exit");
			System.out.print("Option? ");
			option = scnr.next();
			
			switch (option) {
				case "D":
				case "d":
					System.out.print("Amount: ");
					amount = scnr.nextDouble();
					balance += amount;
					break;
				case "W":
				case "w":
					System.out.print("Amount: ");
					amount = scnr.nextDouble();
					balance -= amount;
					break;
				case "B":
				case "b":
					System.out.println("Balance: " + balance);
					break;
				case "X":
				case "x":
					System.out.println("Goodbye");
					break;
				default:
					System.out.println("Invalid Option");	
			}
			
		//} while (!option.equals("X") && !option.equals("x"));
		} while (!option.equalsIgnoreCase("X"));
		
		scnr.close();
	}

}
