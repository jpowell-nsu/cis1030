package driver;

import java.util.Arrays;

public class MethodsWithArrays {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
        String[] names = {"Alice", "Bob", "Charlie"};
        String target = "Boba";
        int total;
        int index;
        boolean isEven;
        int[] swap;
               
		total = calculateSum(numbers);
		System.out.println("Sum: " + total);
		
		index = findIndex(names, target);
        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found.");
        }
        
        isEven = isEven(numbers[2]);
        System.out.println(numbers[2] + " is even? " + isEven);
        System.out.println(Arrays.toString(numbers));    
        
        swapItems(numbers, 2, 4);
        System.out.println(Arrays.toString(numbers));
        
        int value1 = 73;
        int value2 = 42;
        swap = swap(value1, value2);
        System.out.println(value1 + " " + value2);
        System.out.println(Arrays.toString(swap));
        value1 = swap[0];
        value2 = swap[1];
        System.out.println(value1 + " " + value2);
        
        int[] results = doubleValues(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(results));
	} 
	
	public static int calculateSum(int[] arr) {
		int sum = 0;
		
		for (int num : arr) {
			sum += num;
		}
		
		return sum;
    }
	
	public static int findIndex(String[] arr, String target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(target)) {
				return i;
			}
		}

		return -1; // not found
    }

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	public static void swapItems(int[] arr, int i, int j) {
    	
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;

    }
	
	public static int[] swap(int m, int n) {
		int[] swapped = {n, m};
		
		return swapped;
	}
	
	public static int[] doubleValues(int[] input) {
		int[] result = new int[input.length];
        
		for (int i = 0; i < input.length; i++) {
			result[i] = input[i] * 2;
		}
        
		return result;
    }
    
}
