package driver;

import java.util.Scanner;

public class ShapeDrawer {

	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean keepGoing = true;
        int choice;
        int width;
        int height;
        
        do {
	        System.out.println("\n===== Shape Drawer =====");
	        System.out.println("1. Rectangle");
	        System.out.println("2. Right Triangle");
	        System.out.println("3. Quit");
	
	        System.out.print("Choose a shape: ");
	        choice = scnr.nextInt();
	        
	        if (choice == 1) {
	            System.out.print("Enter width: ");
	            width = scnr.nextInt();
	           
	            System.out.print("Enter height: ");
	            height = scnr.nextInt();
	            
	            if (!(width == 0 || height == 0)) {
	              	for (int row = 0; row < height; row++) {
	              		for (int col = 0; col < width; col++) {
	              			System.out.print("*"); 
	            		}
	            		System.out.println();   
	            	}
	            }
	        } else if (choice == 2) {
	            System.out.print("Enter height: ");
	            height = scnr.nextInt();  
	        	
	            if (!(height == 0)) {
	              	for (int row = 1; row <= height; row++) {
	              		for (int col = 1; col <= row; col++) {
	              			System.out.print("*"); 
	            		}
	            		System.out.println();   
	            	}
	            }
	        } else if (choice == 3) {
	        	keepGoing = false;
	        	System.out.println("Goodbye!");
	        } else {
	        	System.out.println("Invalid choice. Please try again.");
	        }
        } while (keepGoing == true);
        
        scnr.close();

	}

}
