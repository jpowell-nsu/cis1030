package driver;

import java.util.Scanner;

/* before watching, see the following in Course Information:
	Installing the Eclipse IDE
	Creating Your First Eclipse Project
*/

public class Driver {
	
	public static void main(String[] args) {	
		
		Scanner scnr = new Scanner(System.in);
		String sentence;
		
		System.out.print("Enter a sentence: ");
		sentence = scnr.nextLine();
		
		System.out.println(sentence);

		scnr.close();
	}


}
