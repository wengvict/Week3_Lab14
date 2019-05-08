import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userChoice;
		String userCont = "y";
		Roshambo userRoll, computerRoll = null;
		Player p = null;

		System.out.println("Welcome to Rock Paper Scissors! \n");
		System.out.print("Enter your name: ");

		Player user = new HumanPlayer();
		user.setName(scan.next());

		userChoice = Validator.getTeam(scan, "\nWould you like to play against TheJets or TheSharks? (j/s): ");
		System.out.print("\n");

		while(userCont.equalsIgnoreCase("y")) {
		
			if (userChoice.equals("j")) {
				p = new PlayerAlwaysRock();
				p.setName("TheJets");
			} else if (userChoice.equals("s")) {
				p = new PlayerRandom();
				p.setName("TheSharks");
			}
			
		userRoll = user.generateRoshambo(scan);
		System.out.println("\n" + user.getName() + ": " + userRoll);
		
		computerRoll = p.generateRoshambo();
		System.out.println(p.getName() + ": " + computerRoll);

		getWinner(user.getName(), p.getName(), userRoll, computerRoll);
		
		System.out.print("Would you like to continue? (y/n): ");
		userCont = scan.next();
		System.out.print("\n");

		} 
		System.out.println("Thanks for playing!");
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
}
