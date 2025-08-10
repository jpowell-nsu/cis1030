package driver;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		
	//	int[][] matrix = new int[3][3];
		
		int[][] matrix = {
		    {1, 2, 3},
		    {4, 5, 6},
		    {7, 8, 9}
		};

		System.out.println("rows: " + matrix.length);
		System.out.println("columns: " + matrix[0].length);
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}		
		
		// this creates an entirely new array and replaces the other
		matrix = new int[3][4];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		matrix[0][0] = 42;
		//matrix[3][4] = 73;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = (row + 1) * (col + 1);
			}
			System.out.println();
		}
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		for (int row = 0; row < matrix.length; row++) {
			System.out.println(Arrays.toString(matrix[row]));
		}
		
		// sum of rows
		int sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			sum = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				sum += matrix[row][col];
			}
			System.out.println(sum);
		}
		
		// sum of cols
		sum = 0;
		for (int col = 0; col < matrix[0].length; col++) {
			sum = 0;
			for (int row = 0; row < matrix.length; row++) {
				sum += matrix[row][col];
			}
			System.out.print(sum + " ");
		}
		System.out.println();
	}

}
