package driver;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		// Write a program that stores temperatures {68, 72, 65, 70, 75, 69, 72, 75, 70, 78, 80, 75, 72, 70, 75} and
		// 7. reverses the array
		// 8. sort the array
	
		int[] temperatures = {68, 72, 65, 70, 75, 69, 72, 75, 70, 78, 80, 75, 72, 70, 75};
		System.out.println(Arrays.toString(temperatures));	// before reversing

		for (int i = 0, j = temperatures.length-1; i < j; i++, j--) {
			int temp = temperatures[i];
			temperatures[i] = temperatures[j];
			temperatures[j] = temp;
		}
		
		System.out.println(Arrays.toString(temperatures)); // after reversing
		
		Arrays.sort(temperatures);
		
		System.out.println(Arrays.toString(temperatures)); // after sorting
		
		for (int i = 0, j = temperatures.length-1; i < j; i++, j--) {
			int temp = temperatures[i];
			temperatures[i] = temperatures[j];
			temperatures[j] = temp;
		}
		
		System.out.println(Arrays.toString(temperatures)); // descending
	
	}

}
