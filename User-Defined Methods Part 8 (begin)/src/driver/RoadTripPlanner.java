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
		//double miles;				// [][0]
		//double mpg;				// [][1]
		//double carRental;			// [][2]
		//double dailyFood;			// [][3]
		//double nightlyLodging;	// [][4]	
		//double days;				// [][5]
		//double gasPrice;			// [][6]
		
		tripScnr.nextLine();
		int i = 0;
		while (tripScnr.hasNext()) {
			//miles = tripScnr.nextDouble();
			//mpg = tripScnr.nextDouble();
			//carRental = tripScnr.nextDouble();
			//dailyFood = tripScnr.nextDouble();
			//nightlyLodging = tripScnr.nextDouble();
			//days = tripScnr.nextInt();
			//gasPrice = tripScnr.nextDouble();
						
			itemCosts[i][0] = tripScnr.nextDouble();
			itemCosts[i][1] = tripScnr.nextDouble();
			itemCosts[i][2] = tripScnr.nextDouble();
			itemCosts[i][3] = tripScnr.nextDouble();
			itemCosts[i][4] = tripScnr.nextDouble();
			itemCosts[i][5] = tripScnr.nextInt();
			itemCosts[i][6] = tripScnr.nextDouble();
			
			//tripCosts[i] = calculateGasCost(miles, mpg, gasPrice)
			//		+ calculateFoodCost(days, dailyFood)
			//		+ calculateLodgingCost(days, nightlyLodging)
			//		+ calculateCarRental(days, carRental);
			
			tripCosts[i] = calculateGasCost(itemCosts[i][0], itemCosts[i][1], itemCosts[i][6])
					+ calculateFoodCost(itemCosts[i][5], itemCosts[i][3])
					+ calculateLodgingCost(itemCosts[i][5], itemCosts[i][4])
					+ calculateCarRental(itemCosts[i][5], itemCosts[i][2]);
			
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
