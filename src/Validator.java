

import java.util.Scanner;

public class Validator {
	
	public static String getString(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		while(isValid == false) {
		System.out.print(prompt);
		s = sc.next(); 
		if(s.equalsIgnoreCase("j") || s.equalsIgnoreCase("s")) {// read user entry
			isValid = true;
			return s;
		} else {
			System.out.println("Please choose a valid team!");
		}
		sc.nextLine(); // discard any other data entered on the line
		}
		return s;
	}

	// behaves like do-while loop
	// makes sure you will never get input mismatch exception
	// don't use in web app, unless you change the scanner
	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}
	
	// overloaded method but with more parameters
	// checks within range for min and max num
	// lacks curly braces, still works fine but add if you're adding more things in body
	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);	// this is not recursion, it's only calling the method above
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}
	
	// prevents mismatch input exception
	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}
	
	// overloaded method from above 
	// takes min and max value
	public static double getDouble(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return d;
	}
	
	// if you want to return true/false, modify String to boolean and change return to true/false
	// keep in mind that regex must be made/figured out by dev
	public static String getStringMatchingRegex(Scanner sc, String prompt, String regex) {
		boolean isValid = false;
		
		String input; 
		
		do {
			// the below works because a string is returned 
			input = getString(sc, prompt);
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the right format: ");
				// no need to set isValid to false because it is already false outside loop
			}
			
		} while(!isValid);
		
		// if looking for boolean return, change return to true/false
		return input;
	}

}