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
		double[] tripCosts = new double[10];
		double miles;
		double mpg;
		double gasPrice;
		double dailyFood;
		double nightlyLodging;
		double carRental;
		double days;
		
		tripScnr.nextLine();
		int i = 0;
		while (tripScnr.hasNext()) {
			miles = tripScnr.nextDouble();
			mpg = tripScnr.nextDouble();
			carRental = tripScnr.nextDouble();
			dailyFood = tripScnr.nextDouble();
			nightlyLodging = tripScnr.nextDouble();
			days = tripScnr.nextInt();
			gasPrice = tripScnr.nextDouble();
			
			tripCosts[i] = calculateGasCost(miles, mpg, gasPrice)
					+ calculateFoodCost(days, dailyFood)
					+ calculateLodgingCost(days, nightlyLodging)
					+ calculateCarRental(days, carRental);
			i++;
		}
		tripOutput(tripCosts);
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
