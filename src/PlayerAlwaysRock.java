import java.util.Scanner;

public class PlayerAlwaysRock extends Player {
	
	@Override
	public Roshambo generateRoshambo() {
		Roshambo r = Roshambo.ROCK;
		return r;
	}

	@Override
	public Roshambo generateRoshambo(Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

}
