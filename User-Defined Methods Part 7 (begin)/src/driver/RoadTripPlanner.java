package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RoadTripPlanner {

	public static void main(String[] args) throws FileNotFoundException {
		File tripFile = new File("files/trips.txt");
		Scanner tripScnr = new Scanner(tripFile);
		
		double[] tripCosts = new double[10];
		double miles;
		double mpg;
		double gasPrice;
		double dailyFood;
		double nightlyLodging;
		double carRental;
		double days;			// we'll use a double for a reason that will become clearer later
		double gallonsNeeded;
		double gasCost;
		double foodCost;
		double lodgingCost;
		double carRentalCost;
		double totalCost;
		int i;
		
		tripScnr.nextLine();
		i = 0;
		while (tripScnr.hasNext()) {
			miles = tripScnr.nextDouble();
			mpg = tripScnr.nextDouble();
			carRental = tripScnr.nextDouble();
			dailyFood = tripScnr.nextDouble();
			nightlyLodging = tripScnr.nextDouble();
			days = tripScnr.nextInt();
			gasPrice = tripScnr.nextDouble();
			
			gallonsNeeded = miles / mpg;
			gasCost = gallonsNeeded * gasPrice;
			foodCost = days * dailyFood;
			lodgingCost = (days - 1) * nightlyLodging;
			carRentalCost = days * carRental;
			totalCost = gasCost + foodCost + lodgingCost + carRentalCost;
			tripCosts[i] = totalCost;
			i++;
		}
		tripScnr.close();
		
		for (i = 0; i <  tripCosts.length; i++) {
			System.out.printf("Estimated total cost of the trip %2d: $%.2f%n", i+1, tripCosts[i]);		
		}
	}

}
