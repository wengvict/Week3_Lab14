import java.util.Random;
import java.util.Scanner;

public class PlayerRandom extends Player {
	
	@Override
	public Roshambo generateRoshambo() {
		Roshambo[] ros = Roshambo.values();
		Random rand = new Random();
		
		return ros[rand.nextInt(ros.length)];
	}

	@Override
	public Roshambo generateRoshambo(Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

}
