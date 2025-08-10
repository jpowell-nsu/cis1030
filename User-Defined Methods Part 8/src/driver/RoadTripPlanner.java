package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RoadTripPlanner {

	public static void main(String[] args) throws FileNotFoundException {
		File tripFile = new File("files/trips.txt");
		Scanner tripScnr = new Scanner(tripFile);
		processTrips(tripScnr);
		tripScnr.close();
	}
	
	public static void processTrips(Scanner tripScnr) {
		// lets assume it is always 10 trips
		
		double[] tripCosts = new double[10];
		double[][] itemCosts = new double[10][7];
		
		tripInput(tripScnr, itemCosts);
		tripCalculator(itemCosts, tripCosts);
		tripOutput(tripCosts);
	}
	
	public static void tripCalculator(double[][] itemCosts, double[] tripCosts) {
		for (int i = 0; i < itemCosts.length; i++) {
			tripCosts[i] = calculateGasCost(itemCosts[i][0], itemCosts[i][1], itemCosts[i][6])
					+ calculateFoodCost(itemCosts[i][5], itemCosts[i][3])
					+ calculateLodgingCost(itemCosts[i][5], itemCosts[i][4])
					+ calculateCarRental(itemCosts[i][5], itemCosts[i][2]);
		}
	}
	
	public static void tripInput(Scanner tripScnr, double[][] itemCosts) {
		tripScnr.nextLine();
		for (int i = 0; i < itemCosts.length; i++) {
			for (int j = 0; j < itemCosts[i].length; j++) {
				itemCosts[i][j] = tripScnr.nextDouble();
			}
		}
	}
	
	public static void tripOutput(double[] tripCosts) {
		for (int i = 0; i <  tripCosts.length; i++) {
			System.out.printf("Estimated total cost of the trip %2d: $%.2f%n", i+1, tripCosts[i]);		
		}
	}
	
	public static double calculateGasCost(double miles, double mpg, double gasPrice) {
		return (miles / mpg) * gasPrice;		
	}
	
	public static double calculateFoodCost(double days, double dailyFood) {
		return days * dailyFood;
	}
	
	public static double calculateLodgingCost(double days, double nightlyLodging) {
		return (days - 1) * nightlyLodging;
	}
	
	public static double calculateCarRental(double days, double carRental) {
		return days * carRental;
	}

}
