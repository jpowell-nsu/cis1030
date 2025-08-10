package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		
		File inputfile = new File("files/data2.txt");
		Scanner scnr = new Scanner(inputfile);
		PrintWriter writer = new PrintWriter("files/output.txt");
		
		int rows;
		int cols;
		String[] names;
		double[][] scores;
		double average = 0;
		
		rows = scnr.nextInt();
		names = new String[rows];
		scores = new double[rows][];
		
//		for(int i = 0; i < scores.length; i++) {
//			Arrays.fill(scores[i], -1.0);
//		}
		
		int i = 0;
		int j = 0;
		while (scnr.hasNext()) {
			names[i] = scnr.next();
			cols = scnr.nextInt();
			scores[i] = new double[cols];
			for (j = 0; j < scores[i].length; j++) {
				scores[i][j] = scnr.nextDouble();
			}
			i++;
		}
		scnr.close();		

		for (i = 0; i < scores.length; i++) {
			System.out.printf("%-10s", names[i]);
			for (j = 0; j < scores[i].length; j++) {
				System.out.printf("%7.2f ", scores[i][j]);
			}
			System.out.println();
		}
		
		for (i = 0; i < scores.length; i++) {
			//System.out.printf("%-10s", names[i]);
			average = 0;
			for (j = 0; j < scores[i].length && scores[i][j] != -1.0; j++) {
				//System.out.printf("%7.2f", scores[i][j]);
				average += scores[i][j];
			}
			//System.out.printf("%7.2f\n", average/j);
			writer.printf("%-10s%6.2f\n", names[i], average/j);
		}
		writer.close();

	}

}
