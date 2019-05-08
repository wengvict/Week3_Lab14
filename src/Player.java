import java.util.Scanner;

public abstract class Player {
	
	private String name;
	private String selection;
	
	// get/set player name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// get/set roshambo or user input
	public String getSelection() {
		return selection;
	}
	public void setSelection(String selection) {
		this.selection = selection;
	}
	
	//public abstract void generateRoshambo();
	// overloaded to take scanner input
	public abstract Roshambo generateRoshambo();
	public abstract Roshambo generateRoshambo(Scanner sc);

}
