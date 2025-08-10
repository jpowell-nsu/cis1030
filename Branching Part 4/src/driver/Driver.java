package driver;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		String name1 = "Jason";
		String name2 = "Jason";
		
		// there is one string literal in this case, so
		//	name1 and name2 are have the same identity
		// 	this is why they are "equal"--not because they match characters
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		System.out.println(System.identityHashCode("Jason"));
				
		if (name1 == name2) {
			System.out.println("1st compare");
		}
		
		if (name1 == "Jason") {
			System.out.println("2nd compare");
		}

		String name3 = new String("Jason");
		System.out.println(System.identityHashCode(name3));
		
		if (name1 == name3) {
			System.out.println("3rd compare");
		}
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Name? ");
		String name4 = scnr.next();
		
		System.out.println(System.identityHashCode(name4));
		if(name1 == name4) {
			System.out.println("4th compare");
		}
		
		if(name1.equals(name4)) {
			System.out.println("5th compare");
		}

		scnr.close();
	
	}

}
