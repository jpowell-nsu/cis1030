package driver;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int value;
		String word;
		String sentence;
		
		System.out.print("Enter an integer: ");
		value = scnr.nextInt();
		
		//Scanner has a method each primitive data type and strings
		//scnr.
		
		System.out.print("Enter a word: ");
		word = scnr.next();
		
		//note that next() leaves the new line character (from you hitting enter)
		// that causes nextLine() to pick it up as the sentence
		// to avoid this issue, we can use nextLine() before calling it again
		scnr.nextLine();
		
		System.out.print("Enter a sentence: ");
		sentence = scnr.nextLine();
		
		System.out.println("value: " + value);
		System.out.println("The " + word + " is the word.");
		System.out.printf("%d %s %s\n", value, word, sentence);
		
		// the printf is very good at formatting output
		int age = 20;
		double gpa = 3.75;
		String name = "Alex";
        
		System.out.printf("Name: %s\n", name);
		System.out.printf("Age: %d years old\n", age);
		System.out.printf("GPA: %.2f\n", gpa); // Only 2 digits after the decimal point

		// Column alignment example
		System.out.println("\n--- Table Format ---");
		System.out.printf("%-10s %-5s %-5s\n", "Name", "Age", "GPA"); // Column headers
		System.out.printf("%-10s %-5d %-5.2f\n", name, age, gpa);     // Data		

		// Simple formatted output with newlines and tabs
		System.out.println("Student Information:\n");
		System.out.printf("\tName:\t%s\n", name);
		System.out.printf("\tAge:\t%d years old\n", age);
		System.out.printf("\tGPA:\t%.2f\n", gpa);

		// Column alignment using tabs and printf
		System.out.println("\n--- Table Format ---");
		System.out.printf("%-10s\t%-5s\t%-5s\n", "Name", "Age", "GPA");
		System.out.printf("%-10s\t%-5d\t%-5.2f\n", name, age, gpa);
        
		scnr.close();
	}

}
