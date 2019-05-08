import java.util.NoSuchElementException;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Scanner scanEnum = new Scanner(System.in);
		String userChoice;
		String userCont = "y";
		Roshambo userRoll, computerRoll = null;
		Player p = null;

		System.out.println("Welcome to Rock Paper Scissors! \n");
		System.out.print("Enter your name: ");

		Player user = new HumanPlayer();
		user.setName(scan.next());

		userChoice = Validator.getString(scan, "\nWould you like to play against TheJets or TheSharks? (j/s): ");

		System.out.print("\n");

		while(userCont.equalsIgnoreCase("y")) {
		userRoll = user.generateRoshambo();
		System.out.println("\n" + user.getName() + ": " + userRoll);

		if (userChoice.equals("j")) {
			p = new PlayerAlwaysRock();
			p.setName("TheJets");
		} else if (userChoice.equals("s")) {
			p = new PlayerRandom();
			p.setName("TheSharks");
		}
		
		computerRoll = p.generateRoshambo();
		System.out.println(p.getName() + ": " + computerRoll);

		getWinner(user.getName(), p.getName(), userRoll, computerRoll);
		
		// keep playing loop that generates NoSuchElementException
		// this means scanner is picking up something it shouldn't be
		// method that takes user input for userCont is at bottom (in case you want to use boolean instead of string)
		
		//scan.nextLine();
		System.out.println("Would you like to continue? (y/n): ");
		System.out.println(scan.hasNext());
		scan.nextLine();

		userCont = scan.nextLine();	// attempted to debug and found this line is causing error

		} 

		scan.close();
	}

	public static void getWinner(String userName, String compName, Roshambo user, Roshambo computer) {
		if (user == computer) {
			System.out.println("Draw!");
		} else if (user == user.PAPER && computer == computer.ROCK) {
			System.out.println(userName + " wins!");
		} else if (user == user.ROCK && computer == computer.SCISSORS) {
			System.out.println(userName + " wins!");
		} else if (user == user.SCISSORS && computer == computer.PAPER) {
			System.out.println(userName + " wins!");
		} else {
			System.out.println(compName + " wins!");
		}
		System.out.print("\n");
	}

	// returns userCont for the do/while or while loop
//	public static boolean keepPlaying(Scanner sc, String prompt) {
//		boolean b = false;
//		System.out.print(prompt);
//		String s = "";
//		sc.nextLine();
//		try {
//		s = sc.next();
//
//		} catch(NoSuchElementException e) {
//			System.out.println("Would you like to continue? (y/n): ");
//		}
//		
//		if (s.equalsIgnoreCase("y")) {
//			return true;
//		} else {
//			return false;
//		}
//		//return b;
//		
//	}
}
