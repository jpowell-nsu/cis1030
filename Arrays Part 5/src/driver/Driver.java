package driver;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		// 9. rotate the array left an amount
		
        int[] values = {1, 3, 5, 7};
        int amount = 10;
        int rotate = 1;
        int first;
        
        while (rotate <= amount) {
        	first = values[0];
        	for (int i = 0; i < values.length-1; i++) {
        		values[i] = values[i + 1];
        	}
        	values[values.length - 1] = first;
        	System.out.println(Arrays.toString(values));
        	rotate++;
        }
        
        //System.out.println(Arrays.toString(values));
	}

}
