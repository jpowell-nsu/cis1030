package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		String[] cities = new String[6];
		File file = new File("files/cities.txt");
		Scanner scnr = new Scanner(file);

		int token = 0;
		while (scnr.hasNext()) {
			cities[token] = scnr.nextLine();
			token++;
		}

	//	for (int token = 0; token < cities.length; token++) {
	//		cities[token] = scnr.nextLine();
	//	}
	
	//	for (String city : cities) {
	//		city = scnr.nextLine();
	//	}

		scnr.close();
		
		// 1. print the list
        System.out.println("--- Original City List ---");
        for (int i = 0; i < cities.length; i++) {
        	System.out.println(cities[i]);
        }
        
		// print the list using enhanced for loop (for-each loop)
        System.out.println("\t------");
        for (String city : cities) {
            System.out.println(city);
        }

        // 2. Display all city names to uppercase              
        System.out.println("\n--- Cities in Uppercase ---");
        for (int i = 0; i < cities.length; i++) {
        	// .toUpperCase() is a String method that returns a new String
        	//String temp = cities[i].toUpperCase();
        	//System.out.println(temp);
        	System.out.println(cities[i].toUpperCase());
        }
        
        System.out.println("\t------");
        for (String city : cities) {
            System.out.println(city.toUpperCase());
        }

        // 3. Find cities that start with a specific prefix
        String prefix = "Ph";
        System.out.println("\n--- Cities starting with '" + prefix + "' ---");
        for (String city : cities) {
            // .startsWith() checks if a String begins with a specified prefix
            if (city.startsWith(prefix)) {
                System.out.println(city);
            }
        }

        // 4. Find cities that contain a specific substring (case-insensitive search)
        String substring = "PH"; // Looking for 'o'
        System.out.println("\n--- Cities containing '" + substring + "' (case-insensitive) ---");
        for (String city : cities) {
            // Convert both to lowercase for a case-insensitive comparison
            if (city.toLowerCase().contains(substring.toLowerCase())) {
                System.out.println(city);
            }
        }
        
        // 5. Find if a city is in the array
        String findCity = "New York";      
        for(int i = 0; i < cities.length; i++) {
        	if(cities[i].equals(findCity)) {
        		System.out.println("Found");
        	}
        }

        // 6. Find the first index of a character in each string
        char findChar = 'a';
        for (int i = 0; i < cities.length; i++) {
        	int index = cities[i].indexOf(findChar);
        	if(index != -1) {
        		System.out.println("City '" + cities[i] + "': index " + index);
        	}
        }
 
	}

}
