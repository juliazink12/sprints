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
	 player1Score = 0;
	 player2Score = 0;
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
		boolean valid = false;
		if(input.equals("PIP")|| input.equals("HINT")|| input.equals("ROLL")) {
			valid = true;
		}
		if(input.equals("QUIT")||input.equals("STOP")||input.equals("CUBE")||input.equals("NEW")) {
			valid = true;
		}
		if(input.equals("INFO")||input.equals("DOUBLE")||input.equals("ACCEPT")||input.equals("REFUSE")) {
			valid = true;
		}
		if(input.startsWith("DICE")) {
			valid = true;
		}
		return valid;
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
	
	public void displayStats(int doublingCube, int matchLength) {
		System.out.println("\nMatch score:\n" + doublingCube + "\nMatch length: " + (matchLength/2) + "\n");
	}

	
}
