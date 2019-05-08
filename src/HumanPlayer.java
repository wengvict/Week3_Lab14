import java.util.Scanner;

public class HumanPlayer extends Player {

	@Override
	public Roshambo generateRoshambo() {
		Roshambo r = null;
		return r;
		
	}

	@Override
	public Roshambo generateRoshambo(Scanner sc) {
		String userInput;
		System.out.print("Rock, paper, or scissors? (R/P/S): ");
		sc.nextLine();
		userInput = Validator.getRPS(sc);
		userInput = userInput.toLowerCase();
		Roshambo r = null;
		switch(userInput) {
		case "r":
			r = Roshambo.ROCK;
			break;
		case "p":
			r = Roshambo.PAPER;
			break;
		case "s":
			r = Roshambo.SCISSORS;
			break;
		default:
			r = null;
		}
		return r;
	}

}
