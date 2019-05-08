import java.util.Random;

public class PlayerRandom extends Player {
	
	@Override
	public Roshambo generateRoshambo() {
		Roshambo[] ros = Roshambo.values();
		Random rand = new Random();
		
		return ros[rand.nextInt(ros.length)];
	}

}
