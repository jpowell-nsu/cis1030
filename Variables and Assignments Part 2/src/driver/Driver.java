package driver;

public class Driver {
	
	public static void main(String[] args) {
		
		// character and boolean
        char initial = 'J';
        boolean isStudent = false; 

        System.out.println("Initial: " + initial);
        System.out.println("Are you a student? " + isStudent);
        
        // technically, characters are integers
        System.out.println("Initial: " + (short) initial);
        initial = 65;
        System.out.println("Initial: " + initial);
        
        // strings
        String greeting = "Hello";
        String name = "Alex";

        String message = greeting + ", " + name + "!";
        System.out.println(message);
        
        // strings have a lot useful methods
        //greeting.
        
        char c = greeting.charAt(4);
        System.out.println(c);
        
        boolean has_el = greeting.contains("el");
        System.out.println(has_el);
        
        String partial = greeting.substring(3);
        System.out.println(partial);
        
        partial = greeting.substring(2, 5);
        System.out.println(partial);
        
        int score = 85;
        System.out.println("Initial score: " + score);

        score = 92; // reassign
        System.out.println("Updated score: " + score);
        
        score = score + 5;
        
        int a = 42;
        int b = 73;
        
        //a = b;
        //b = a;
        
        System.out.println(a + " " + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println(a + " " + b);
	}

}
