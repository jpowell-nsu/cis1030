package driver;

import java.util.Scanner;

public class StudentMenuExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Greeting message
		System.out.println("Welcome to the Student Menu System!");

		// Declare an array to store student grades
		int[] grades = {85, 78, 92, 67, 88};

		// Main menu loop
		int choice;
		do {
			printMenu();
			System.out.print("Enter your choice: ");
			choice = input.nextInt();

			switch (choice) {
				case 1:
					printAllGrades(grades);
					break;
				case 2:
					findHighestGrade(grades);
					break;
				case 3:
					searchForGrade(grades, input);
					break;
				case 4:
					addBonusPoints(grades);
					break;
				case 0:
					System.out.println("Exiting the program. Goodbye!");
					break;
				default:
					System.out.println("Invalid choice. Try again.");
			}
		} while (choice != 0);
		
		input.close();
	}

	// Prints the menu options
	public static void printMenu() {
		System.out.println("\n--- Menu ---");
		System.out.println("1. Show all grades");
		System.out.println("2. Find highest grade");
		System.out.println("3. Search for a grade");
		System.out.println("4. Add 5 bonus points to all grades");
		System.out.println("0. Exit");
	}

	// Prints all grades in the array using a for loop
	public static void printAllGrades(int[] grades) {
		System.out.println("Grades:");
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Student " + (i + 1) + ": " + grades[i]);
		}
	}

	// Finds and prints the highest grade using Math.max
	public static void findHighestGrade(int[] grades) {
		int max = grades[0];
		for (int i = 1; i < grades.length; i++) {
			max = Math.max(max, grades[i]);
		}
		System.out.println("Highest grade: " + max);
	}

	// Searches for a specific grade using while loop
	public static void searchForGrade(int[] grades, Scanner input) {
		System.out.print("Enter grade to search for: ");
		int target = input.nextInt();
		int index = 0;
		boolean found = false;

		while (index < grades.length) {
			if (grades[index] == target) {
				found = true;
				break;			// this is considered bad coding!
			}
			index++;
		}

		if (found) {
			System.out.println("Grade found at position " + (index + 1));
		} else {
			System.out.println("Grade not found.");
		}
	}

    // Adds 5 bonus points to all grades using do-while loop
	public static void addBonusPoints(int[] grades) {
		int i = 0;
		do {
			grades[i] += 5;
			i++;
		} while (i < grades.length);
		System.out.println("5 bonus points added to all grades!");
	}

}