package driver;

public class Driver {
	
	public static void main(String[] args) {

		double a = 45.1;
		double b = 34.2;
		double t = a + b;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("t=" + t);
		
		if (t == 79.3) {
			System.out.println("xtrue");
		}
		
		double epsilon = 0.000001;	// amount of tolerance
		boolean isEqual = Math.abs(a - b) > epsilon;
		
		System.out.println(Math.abs(a - b));
		
		if (isEqual) {
			System.out.println("true");
		}

	}

}
