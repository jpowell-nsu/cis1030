package driver;

public class Driver {

	public static void main(String[] args) {
		
		int i;
		
		// Initialization — setup before the loop associated with the condition.
		// Condition — a boolean expression that controls repetition.
		// Update — a way to change the condition inside the loop body.
		// Body — the statements executed on each iteration.
				
		i = 3;
		while (i < 5) {	
			System.out.println("while: Hello World " + i);
			i++;
		}
		
		i = 3;
		do {
			System.out.println("do-while: Hello World " + i);
			i++;
		} while (i < 5);
		
		
		for (i = 3; i < 5; i++) {
			System.out.println("for: Hello World " + i);
		}

	}

}
