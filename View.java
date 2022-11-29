package backgammon;
import java.util.*;

public class View {

	Scanner in;
	private String name;
	public String playerOne;
	public String playerTwo;
	Dice dices;
	//Player players;
	
	View(){
	 in = new Scanner(System.in);
	 playerOne = "";
	 playerTwo = "";
	 dices = new Dice();
	}
	
	
	public void welcomePlayers() {
		System.out.println("Welcome to Backgammon");
	}	

/*	
	public String getPlayerName() {
		String name = in.nextLine();	
		return name;
	}
	
	public void startGame() {
		int rolls[] = bothPlayersRoll();
		int rollOne[] = {rolls[0], rolls[1]};
		int rollTwo[] = {rolls[2], rolls[3]};
		if (dices.isEqualRoll(rollOne, rollTwo)) {
			System.out.println("Please roll dice again");
		}else if (dices.isFirstPlayer(rollOne, rollTwo)) {
			System.out.print(playerOne+"Start");
		}else {
			System.out.print(playerTwo+"Start");
		}
		
	}
	
	public int[] bothPlayersRoll() {
		System.out.println("Name of player 1?");
		playerOne = getPlayerName();
		System.out.println("Name of player 2?");
		playerTwo = getPlayerName();
		System.out.println(playerOne+"Please roll dice");
		int rollOne[] = dices.rollDices();
		int rollTwo[] = dices.rollDices();
		int rolls[] = {rollOne[0], rollOne[1], rollTwo[0], rollTwo[1]};
		return rolls;
	}
	
	public void displayLog() {
		
	}	
*/
	
}
