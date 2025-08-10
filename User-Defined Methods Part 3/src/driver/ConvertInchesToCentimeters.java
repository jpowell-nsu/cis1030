package driver;

import java.util.Scanner;

public class ConvertInchesToCentimeters {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//final double CM_PER_IN = 2.54;
		//final int IN_PER_FT = 12;		
		int userFt;
		int userIn;
		// int inches;
		double centimeters = 0.0;
		
		//System.out.print("Enter feet: ");
		//userFt = scnr.nextInt();

		//System.out.print("Enter inches: ");
		//userIn = scnr.nextInt();
		
		userFt = prompt(scnr, "Enter feet: ");
		userIn = prompt(scnr, "Enter inches: ");

		scnr.close();		

		//inches = (userFt * IN_PER_FT) + userIn;
		//centimeters = inches * CM_PER_IN;
		//centimeters = conversion(userFt, userIn, IN_PER_FT, CM_PER_IN);
		centimeters = conversion(userFt, userIn);
		
		//System.out.printf("%d ft, %d in = %f cm", userFt, userIn, centimeters);
		
		output(userFt, userIn, centimeters);
	}
	
	public static int prompt(Scanner scnr, String prompt) {
		int userInput;
		
		System.out.print(prompt);
		userInput = scnr.nextInt();
		
		return userInput;
	}
	
	public static void output(int feet, int inches, double centimeters) {
		System.out.printf("%d ft, %d in = %f cm", feet, inches, centimeters);
	}

	/*
	public static double conversion(int feet, int inches, final int IN_PER_FT, final double CM_PER_IN) {
		double centimeters; 
		
		inches = (feet * IN_PER_FT) + inches;
		centimeters = inches * CM_PER_IN;	
		
		return centimeters;
	}
	*/
	
	/*
	public static double conversion(int feet, int inches, final int IN_PER_FT, final double CM_PER_IN) {
		
		return ((feet * IN_PER_FT) + inches) * CM_PER_IN;	
		
	}
	*/
	
	public static double conversion(int feet, int inches) {
		final double CM_PER_IN = 2.54;
		final int IN_PER_FT = 12;
		
		return ((feet * IN_PER_FT) + inches) * CM_PER_IN;	
		
	}


}
