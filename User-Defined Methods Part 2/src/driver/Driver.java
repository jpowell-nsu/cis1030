package driver;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int x = 21;
		int y = 21;
		int sum;
		String message = "Hello World3";
		String name = "Jason";
		double[] values = {1.0, 2.0, 3.0};
		double[] largerValues;
	
		printHello();
		
		//print("Hello World2");
		print(message);
		
		sum = add(x, y);
		
		System.out.println(sum);
		
		message = manipulation(message, name);
		System.out.println(message);
		
		System.out.println("Before method: " + Arrays.toString(values));
		doubler(values);
		System.out.println("After method: " + Arrays.toString(values));

		largerValues = doubleSize(values);
		System.out.println(Arrays.toString(largerValues));
	}
	
	public static void printHello() {
		System.out.println("Hello World1");
	}	
	
	public static void print(String message) {
		System.out.println(message);
	}	
	
	public static int add(int a, int b) {
		int sum;
		
		sum = a + b;
		
		return sum;
	}
	
	public static String manipulation(String message, String name) {
		
		message = message.substring(0, 6);
		message += name;
		
		return message;
	}
	
	public static void doubler(double[] numbers) {
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * 2.0;
		}

	}
	
	public static double[] doubleSize(double[] numbers) {
		double[] newarray = new double[numbers.length*2];
		
		for(int i = 0; i < numbers.length; i++) {
			newarray[i] = numbers[i];
		}
		
		return newarray;
	}

}
