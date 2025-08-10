package driver;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		int number1 = 4;
		int number2 = 2;
		int number3 = 7;
		int number4 = 3;
		
		int[] numbers = new int[5];
		String[] names = new String[3];
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(names));
		
		int[] values = {8, 6, 7, 5, 3, 0, 9};
		String[] firstnames = {"Alice", "Bob", "Charlie"};
		
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(firstnames));
		
		System.out.println(numbers.length);
		System.out.println(names.length);
		System.out.println(values.length);
		System.out.println(firstnames.length);
		
		//---------------------------------------		
		numbers[0] = number4;
		numbers[1] = 20;
		
		System.out.println(numbers[0]);
		
		numbers[2] = 10 + 20;
		numbers[3] = numbers[0] + numbers[1] + numbers[2];
		numbers[4] = (-number2 + ((int) Math.sqrt(number2 * number2 - 4 * number1 * number3))/(2*number1));
		
		System.out.println(Arrays.toString(numbers));
		
		names[0] = firstnames[0];
		names[1] = firstnames[0] + firstnames[1] + 42;
		System.out.println(Arrays.toString(names));
		
		//---------------------------------------		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Index " + i + ": " + numbers[i]);
		}
		
		for (int i = 0; i < firstnames.length; i++) {
			System.out.println("Index " + i + ": " + firstnames[i]);
		}
		
		// enhanced for loop
		for (String name : firstnames) {
			System.out.println(name);
		}
		
		for (int i = 0; i < firstnames.length; i++) {
			System.out.println(firstnames[i]);
		}
		
		//---------------------------------------
		int[] scores = {85, 90, 78, 92, 88};
		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		// enhanced score loop
		sum = 0;
		for (int score : scores) {
			System.out.println(score);
			sum += score;
		}
		System.out.println(sum);

		double average = (double) sum / scores.length;
		System.out.println("Average score: " + average);
		
		// Common pitfalls
		// remembering index is from 0 to length-1
		//numbers[5] = 42;
		
		//for (int i = -1; i <= scores.length; i++) {
		//	sum += scores[i];
		//}
		
		//---------------------------------------
		int[] myvalues;
		
		// myvalues = new int[5];
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = scnr.nextInt();
		
		myvalues = new int[size];		// note that I assigned a new array... the original is lost
		
		for (int i = 0; i < myvalues.length; i++) {
			System.out.print("Enter value: ");
			myvalues[i] = scnr.nextInt();
		}
		System.out.println(myvalues[0]);
		System.out.println(Arrays.toString(myvalues));
		
		scnr.close();
	}

}
