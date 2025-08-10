package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		File infile = new File("files/data1.txt");
		Scanner scnr = new Scanner(infile);
		String name;
		double value;
		double average = 0;
		int count = 0;
		
		while (scnr.hasNext()) {
			name = scnr.next();
			value = scnr.nextDouble();
			System.out.printf("%-10s%6.2f\n", name, value);
			average += value;
			count++;
		}
		average /= count;
		System.out.printf("----------------\n");
		System.out.printf("%-10s%6.2f\n", "AVG", average);
		scnr.close();
		
		System.out.printf("----------------\n");
		System.out.printf("----------------\n");
		*/
		
		File infile = new File("files/data2.txt");
		Scanner scnr = new Scanner(infile);
		String name;
		double value;
		double average = 0;
		int count = 0;
		double classaverage = 0;
		double classcount = 0;

		while (scnr.hasNext()) {
			name = scnr.next();
			System.out.printf("%-10s", name);
			average = 0;
			count = 0;
			
			while (scnr.hasNextDouble()) {
				value = scnr.nextDouble();
				average += value;
				count++;
			}
			average = average / count;
			System.out.printf("%6.2f\n", average);
			classcount++;
			classaverage = classaverage + average;
		}
		classaverage = classaverage/classcount;
		System.out.printf("----------------\n");
		System.out.printf("%-10s%6.2f\n", "AVG", classaverage);	
		
		scnr.close();
	}

}
