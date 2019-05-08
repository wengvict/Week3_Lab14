import java.util.Scanner;

public class HumanPlayer extends Player {

	@Override
	public Roshambo generateRoshambo() {
		System.out.print("Rock, paper, or scissors? (R/P/S): ");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next().toLowerCase();
		Roshambo r = null;
		scan.close();
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
		}
		return r;
		
	}

}
