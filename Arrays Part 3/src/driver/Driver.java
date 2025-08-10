package driver;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		// Write a program that stores temperatures {68, 72, 65, 70, 75, 69, 72, 75, 70, 78, 80, 75, 72, 70, 75} and
		// 4. searches for a temperature
		// 5. count occurrences of a temperature
		// 6. identify which temperatures are above a threshold
		
		int[] temperatures = {68, 72, 65, 70, 75, 69, 72, 75, 70, 78, 80, 75, 72, 70, 75};
		boolean[] aboveThreshold = new boolean[temperatures.length];
		int toFind = 65;
		int count = 0;
		boolean found = false;
		
		int i = 0;
		for (int temperature : temperatures) {
			if (temperature == toFind) {
				found = true;
				count++;
			}
			if (temperature > toFind) {
				aboveThreshold[i] = true;
			}
			i++;
		}
		
		//for (int i = 0; i < temperatures.length; i++) {
		//	
		//}
				
		System.out.println(Arrays.toString(temperatures));
		System.out.println(Arrays.toString(aboveThreshold));
		System.out.println(toFind + " found? " + found);
		System.out.println(toFind + " count? " + count);
	}

}
