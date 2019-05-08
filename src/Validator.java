

import java.util.Scanner;

public class Validator {
	
	// only accepts j/s
	public static String getTeam(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		while(isValid == false) {
		System.out.print(prompt);
		s = sc.next(); 
		if(s.equalsIgnoreCase("j") || s.equalsIgnoreCase("s")) {
			isValid = true;
			return s;
		} else {
			System.out.println("Please choose a valid team!");
		}
		sc.nextLine(); 
		}
		return s;
	}
	
	// only accepts rps
	public static String getRPS(Scanner sc) {
		String s = "";
		boolean isValid = false;
		while(isValid == false) {
		s = sc.next(); 
			if(s.equalsIgnoreCase("r") || s.equalsIgnoreCase("p") || s.equalsIgnoreCase("s")) {
				isValid = true;
				return s;
			} else {
				System.out.print("\nPlease choose rock, paper, or scissors (R/P/S): ");
			}
	
		}
		return s;
	}
}