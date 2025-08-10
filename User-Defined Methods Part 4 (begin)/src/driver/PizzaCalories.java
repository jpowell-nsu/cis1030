package driver;

import java.util.Scanner;

public class PizzaCalories {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double circleDiameter;
		double circleRadius;
		double circleArea;
		double totalCalories;
		double caloriesPerSquareInch = 16.7;
		
		System.out.print("Enter the pizza size: ");
		circleDiameter = scnr.nextDouble();
		while (circleDiameter >= 0) {
			circleRadius = circleDiameter / 2.0;
			circleArea = Math.PI * circleRadius * circleRadius;
			totalCalories = circleArea * caloriesPerSquareInch;
			System.out.printf("%.0f inch pizza has %.2f calories.\n", circleDiameter, totalCalories);
			System.out.print("Enter the pizza size: ");
			circleDiameter = scnr.nextDouble();
		}
		System.out.print("Goodbye.");
		scnr.close();
	} 

}
