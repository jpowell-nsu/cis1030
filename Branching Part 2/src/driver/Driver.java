package driver;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		int score = 79;
		
		// if statement
	//	if (score >= 90) {
	//		System.out.println("Grade: A");
	//	}
		
		// if statement with logic issue
//		if (score >= 80) { // does not work
//			System.out.println("Grade: B");
//		}
		
		// if statement with compound conditional
//		if (score >= 80 && score < 90) {
//			System.out.println("xGrade: B");
//		}
		
//		if (score < 80 || score >= 90) {
//			System.out.println("xGrade: Not B");
//		}
		
		// if-else statement
//		if (score >= 80 && score < 90) {
//			System.out.println("Grade: B");
//		} else {
//			System.out.println("Grade: Not B");
//		}
		
/*
		// if-else statement
		if (score >= 80 && score < 90) {
			System.out.println("yGrade: B");
		} else {
			if (score >= 90) {
				System.out.println("yGrade: A");
			} else {
				System.out.println("yGrade: C or lower");
			}
		}
		
		// if-else-if statement
		if (score >= 90) {
		    System.out.println("Grade: A");
		} else if (score >= 80) {
		    System.out.println("Grade: B");
		} else {
			System.out.println("Grade: C or lower");
		}
*/	
		// if-else-if statement to handle complete grade decision
		if (score >= 90) {
		    System.out.println("Grade: A");
		} else if (score >= 80) {
		    System.out.println("Grade: B");
		} else if (score >= 70) {
			System.out.println("Grade: C");
		} else if (score >= 60) {
			System.out.println("Grade: D");
		} else {
			System.out.println("Grade: F");
		}

		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a score: ");
		double newscore = scnr.nextDouble();
		scnr.close();
		
		if (newscore > 89.5) {
		    System.out.println("Grade: A");
		} else if (newscore >= 79.5) {
		    System.out.println("Grade: B");
		} else if (newscore >= 69.5) {
			System.out.println("Grade: C");
		} else if (newscore >= 59.5) {
			System.out.println("Grade: D");
		} else {
			System.out.println("Grade: F");
		}
		
	}

}
