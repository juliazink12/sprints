package backgammon;
import java.util.*;

public class View {

	Scanner in;
	private String name;
	public String playerOne;
	public String playerTwo;
	public int player1Score;
	public int player2Score;
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
	
	public int getScore(int n) {
		if (n==1) {
			return player1Score;
		}
		else {
			return player2Score;
		}
	}
	
	public void setScore(int playerNumber, int newScore) {
		if (playerNumber==1) {
			player1Score += newScore;
		}
		else {
			player2Score += newScore;
		}
	}
	
	public void displayScores(String name1, String name2) {
		System.out.println("Scores: " + name1 + " - " + player1Score + ", " + name2 + " - " + player2Score + "\n\n\n");
	}

	
}
