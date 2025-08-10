package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		File infile = new File("files/students.txt");
		Scanner scnr = new Scanner(infile);
		int age;
		double gpa;
		String firstname;
		String lastname;
/*
		age = scnr.nextInt();
		gpa = scnr.nextDouble();
		firstname = scnr.next();
		lastname = scnr.next();
		
		System.out.println(firstname + " " + lastname + " " + age + " " + gpa);
*/	
		double totalAge = 0;
		int count = 0;
		while(scnr.hasNext()) {
			age = scnr.nextInt();
			gpa = scnr.nextDouble();
			firstname = scnr.next();
			lastname = scnr.next();
			
			totalAge = totalAge + age;
			count = count + 1;
			
			System.out.println(firstname + " " + lastname + " " + age + " " + gpa);
		}
		
		System.out.println("avg age: " + totalAge/count);

		scnr.close();
	}

}
