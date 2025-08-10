package driver;

import java.util.Scanner;

public class PizzaCalories {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		calorieCounter(scnr);
		scnr.close();
	}
	
	public static void calorieCounter(Scanner scnr) {
		double circleDiameter;
		double totalCalories;
		
		circleDiameter = pizzaInput(scnr);
		while (circleDiameter >= 0) {
			totalCalories = calories(circleDiameter);
			pizzaOutput(circleDiameter, totalCalories);
			circleDiameter = pizzaInput(scnr);
		}
		System.out.print("Goodbye.");		
	}
	
	public static double calories(double circleDiameter) {
		double totalCalories;
		double caloriesPerSquareInch = 16.7;
		
		totalCalories = circleArea(circleDiameter) * caloriesPerSquareInch;
		
		return totalCalories;
	}
	
	public static double circleArea(double circleDiameter) {
		double circleArea;
		double circleRadius;
		
		circleRadius = circleDiameter / 2.0;
		circleArea = Math.PI * circleRadius * circleRadius;
		
		return circleArea;
	}
	
	public static double pizzaInput(Scanner scnr) {
		double circleDiameter;
		
		System.out.print("Enter the pizza size (-1 to exit): ");
		circleDiameter = scnr.nextDouble();
		
		return circleDiameter;
	}
	
	public static void pizzaOutput(double circleDiameter, double totalCalories) {
		System.out.printf("%.0f inch pizza has %.2f calories.\n", circleDiameter, totalCalories);
	}

}
