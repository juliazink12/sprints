package backgammon;
import java.util.*;

//update okay

public class Play {
	
	/*public static int[] rollDice() {
		Random rand = new Random();;
		int dice1 = rand.nextInt(6) + 1;
		int dice2 = rand.nextInt(6) + 1;
		int[] result = {dice1, dice2};
		return result;
	}*/		
		
	public static void main(String[] args) {
		
		Dice dice = new Dice();
		View view = new View();
		Board board = new Board();
		
		ArrayList<Point> point = new ArrayList<Point>();
		
		point = board.points;
		board.setUp();
		
		view.welcomePlayers();
		
		boolean quit = false;
		
		Scanner in = new Scanner(System.in);
		String newInput;
		
		System.out.println("Name of player 1?");
		String name1 = in.nextLine();
		System.out.println("Name of player 2?");
		String name2 = in.nextLine();
		
		int currentPlayer = 1;
		String currentPlayerName;
		
		
		while(!quit) {
			if (currentPlayer == 1) {
				currentPlayerName = name1;
			}
			else {
				currentPlayerName = name2;
			}
			System.out.println(currentPlayerName + ": Type 'roll' or 'quit'");
			newInput = in.nextLine();
			if (newInput.equals("quit")) {
				quit = true;
			}
			
			if (newInput.equals("roll")) {
				int[] result = dice.rollDices();
				//int[] result = rollDice();
				System.out.println(result[0] + ", " + result[1]);
			}
			
			board.printBoard();
		
			currentPlayer = (currentPlayer == 1 ? 2 : 1);
		}
		
		if (quit) {
			System.out.println("Game ended");
		}
		
		
	}

}
