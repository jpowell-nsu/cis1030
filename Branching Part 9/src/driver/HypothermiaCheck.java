package driver;

import java.util.Scanner;

public class HypothermiaCheck {
	
	public static void main(String[] args) {
		// Part 1: Write a program that asks the user to enter their body temperature in Fahrenheit
		// or Celsius and then determine if the temperature is classified as follows:
		// 
		//	"You may have hypothermia." (below 95°F)
		// 	"Your temperature is normal." (95°F to 99.5°F inclusive)
		// 	"You may have a fever." (above 99.5°F)
		
		// celsius = (fahrenheit - 32) * 5.0 / 9.0;
		// fahrenheit = celsius * 9.0 / 5.0 + 32;

		Scanner scnr = new Scanner(System.in);
		String tempType;
		double temperature;
		int bpm;

		System.out.print("Enter temperature as (F)ahrenheit or (C)elcius? ");
		tempType = scnr.next();
		
		if (tempType.equalsIgnoreCase("F")) {
			System.out.print("Enter temperature in Fahrenheit: ");
			temperature = scnr.nextDouble();
		} else {
			System.out.print("Enter temperature in Celcius: ");
			temperature = scnr.nextDouble();
			temperature = temperature * 9.0 / 5.0 + 32;
		}		
		
		System.out.print("Enter heart rate in bpm: ");
		bpm = scnr.nextInt();
		
		if (temperature < 95.0) {
			if (bpm < 60) {
				System.out.println("You may have severe hypothermia (low temperature and slow heart rate).");
			} else if (bpm <= 100) {
				System.out.println("You may have hypothermia.");
			} else {
				System.out.println("You may have early hypothermia (low temperature and elevated heart rate).");
			}
		} else if (temperature <= 99.5) {
			System.out.println("Your temperature is normal.");
		} else {		
			System.out.println("You may have a fever.");
		}
		
		scnr.close();
		
		// Part 2: now expand it also ask for heart rate and use that further classify hypothermia
		// 	Bradycardia	Below 60 bpm	Can indicate hypothermia if temp is low
		//		"You may have severe hypothermia (low temperature and slow heart rate)."
		
		// 	Normal		60–100 bpm		Normal range
		//		"You may have hypothermia."
		
		// 	Tachycardia	Above 100 bpm	May occur in mild hypothermia or other stressors
		//		"You may have early hypothermia (low temperature and elevated heart rate).
				
//		System.out.println("You may have severe hypothermia (low temperature and slow heart rate).");
//		System.out.println("You may have early hypothermia (low temperature and elevated heart rate).");
//		System.out.println("You may have hypothermia.");
		
	}

}
