package driver;

public class Driver {
	
	public static void main(String[] args) {
		
		// Check if the temperature is between 65 and 75
		// assumes exclusive end points
		// assumes out statements for true and false
		int temperature = 64;
		
		if (temperature > 65 && temperature < 75) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		// Check if a user is eligible to vote
		int age = 18;
		boolean isCitizen = false;
		
		if (age >= 18 && isCitizen) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (age <= 17) {
			System.out.println("false");
		} else if (isCitizen) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
		// Check if a character is a vowel
		// assume lower case letters
		// assume y is not a vowel
		char letter = 'u';
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.println("--------------");
		switch (letter) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("true");
				break;
			default:
				System.out.println("false");
		}
		
		// Check if a user can access a system (admin OR password correct)
		boolean isAdmin = true;
		boolean passwordCorrect = false;
		
		if (isAdmin == true || passwordCorrect == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (isAdmin || passwordCorrect) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		// Check if a number is NOT in a range of 0 to 100
		// assume inclusive
		int number = 12;
		
		if (number < 0 || number > 100) {
			System.out.println("outside range");
		} else {
			System.out.println("inside range");
		}
		
		if (number >= 0 && number <= 100) {
			System.out.println("inside range");
		} else {
			System.out.println("outside range");
		}
		
		if ( !(number >= 0 && number <= 100) ) {
			System.out.println("outside range");
		} else {
			System.out.println("inside range");
		}
		
		
		// Check if login failed due to either missing input or wrong credentials
		// assume the username is admin
		// assume the password is 1234
		
		String username = "";
		String password = "123";
		
		if (username.equals("") || password.equals("")) {
			System.out.println("login failed");
		} else if (username.equals("admin") && password.equals("1234")) {
			System.out.println("login success");
		} else {
			System.out.println("login failed");
		}
		
		if (username.equals("") || password.equals("") || 
				!(username.equals("admin") && password.equals("1234")) ) {
			System.out.println("login failed");
		} else {
			System.out.println("login success");
		} 
		
		if (username.isEmpty() || password.isEmpty() 
				|| !(username.equals("admin") && password.equals("1234")) ) {
			System.out.println("login failed");
		} else {
			System.out.println("login success");
		} 
		
		
		// Check if a triangle is valid (sum of any two sides must be greater than the other side)
		int a = 15;
		int	b = 4;
		int	c = 5;
			
		if ((a + b > c) && (a + c > b) && (b + c > a) ) {
			System.out.println("Valid triangle");
		} else {
			System.out.println("Invalid triangle");
		}
		
	}

}
