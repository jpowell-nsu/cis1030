package driver;

public class Driver {
	
	public static void main(String[] args) {
		
		// integer data types
		byte small;
		small = 120;
		
		short medium = 30000;
		int standard = 1000000;		// you can use _ instead of commas
		long big = 9_000_000_000L; 	// 'L' suffix is required
									
		System.out.println("Byte: " + small);
		System.out.println("Short: " + medium);
		System.out.println("Int: " + standard);
		System.out.println("Long: " + big);
		
		// floating points
		float piApprox = 3.14f;     // 'f' suffix is required
		double piExact = 3.141592653589;

		System.out.println("Float: " + piApprox);
		System.out.println("Double: " + piExact);
        
	}

}
