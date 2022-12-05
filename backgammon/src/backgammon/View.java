package backgammon;
import java.util.*;

public class View {

	Scanner in;
	private String name;
	public String playerOne;
	public String playerTwo;
	//Player players;
	
	View(){
	 in = new Scanner(System.in);
	 playerOne = "";
	 playerTwo = "";
	}
	
	
	public void welcomePlayers() {
		System.out.println("Welcome to Backgammon");
	}	

	public void askNames() {
		System.out.println("Name of player 1?");
		playerOne = in.nextLine();
		System.out.println("Name of player 2?");
		playerTwo = in.nextLine();
	}
	
	public boolean isValid (String in) {
		String input = in.trim().toUpperCase();
		return input.equals("PIP")|| input.equals("HINT")|| input.equals("ROLL")|| input.equals("QUIT");
	}

	
}
