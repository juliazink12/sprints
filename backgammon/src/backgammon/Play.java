//package backgammon;
import java.util.*;

//update okay

public class Play {

	public static void main(String[] args) {
		
		Dice dice = new Dice();
		View view = new View();
		Board board = new Board();
		
		ArrayList<Point> point = new ArrayList<Point>();
		ArrayList<Checker> barRed = new ArrayList<Checker>();
		ArrayList<Checker> barWhite = new ArrayList<Checker>();
		ArrayList<Checker> offRed = new ArrayList<Checker>();
		ArrayList<Checker> offWhite = new ArrayList<Checker>();

		point = board.points;
		barRed = board.barRed;
		barRed = board.barWhite;
		offRed = board.offRed;
		offWhite = board.offWhite;
		board.setUp();
		
		view.welcomePlayers();
		
		boolean quit = false;
		
		Scanner in = new Scanner(System.in);
		String newInput;
		
		view.askNames();
		String name1 = view.playerOne;
		String name2 = view.playerTwo;
		
		int currentPlayer = dice.rollToStart();
		String currentPlayerName;
		
		while(!quit) {
			if (currentPlayer == 1) {
				currentPlayerName = name1.toUpperCase();
			}
			else {
				currentPlayerName = name2.toUpperCase();
			}
			System.out.println(currentPlayerName + ": Type 'roll' or 'quit' or 'hint' or 'pip'");
			newInput = in.nextLine().trim().toUpperCase();
			if (newInput.equals("QUIT")) {
				quit = true;
			}
			
			if (newInput.equals("PIP")) {
				board.displayPipCount();
			}
			
			if (newInput.equals("HINT")) {
				System.out.println(" Type 'roll' to roll the dice\n Type a letter to pick a move\n Type 'pip' to get the pip counts\n Type 'hint' for help\n Type 'quit' to quit");
			}
			
			if (newInput.equals("ROLL") || newInput.startsWith("DICE")) {
				int[] result = {0,0};
				if (newInput.equals("ROLL")) {
					result = dice.rollDices();
				}
				else {
					// take two integers of input
					int firstDice = newInput.charAt(5);
					int secondDice = newInput.charAt(6);
					result[0] = firstDice;
					result[1] = secondDice;
				}
				//int[] result = rollDice();
				System.out.println(result[0] + ", " + result[1]);
				ArrayList<Path> dice1Paths = board.getPathByColor(currentPlayer == 1, result[0]);
				char choice1 = 'A';
				ArrayList<String> choices1 = new ArrayList<>();
				ArrayList<Point> start1 = new ArrayList<>();
				ArrayList<Point> end1 = new ArrayList<>();
				
				
				boolean usingDice1 = false;
				boolean usingDice2 = false;

				boolean update1 = false;
				boolean update2 = false;
				
				board.printBoard();

				while (!usingDice1 && !usingDice2) {
					// Dice1
					System.out.println(currentPlayerName + "to play " + result[0] + "-" + result[1] + " Select from:");
					choices1.add(choice1 + " ");
					
					for (int i = 0; i < dice1Paths.size(); i++) {
						start1.add(dice1Paths.get(i).start);
						end1.add(dice1Paths.get(i).end);						
						
						System.out.println(choice1 + " " + (start1.get(i) != null ? start1.get(i).number : "BAR")
									+ "->" + (end1.get(i) != null ? end1.get(i).number : "OFF"));
						
						choice1++;
						choices1.add(choice1 + " ");
					}
					System.out.println(currentPlayerName + " Choose path:");
					String move1 = in.nextLine().trim().toUpperCase();
					int index1 = 0;
					for (int x = 0; x < choices1.size(); x++) {
						if (move1.equals(choices1.get(x).trim())) {
							update1 = true;
							index1 = x;
							usingDice1 = true;
							break;
						}
					}
					if (update1) {
                        if (end1.get(index1) == null) {
                            if (currentPlayer == 1) {
                                offRed = board.moveCheckerToOff(start1.get(index1), currentPlayer == 1);
                            } else {
                                offWhite = board.moveCheckerToOff(start1.get(index1), currentPlayer == 1);
                            }
                            point = board.updateMoveToOff(start1.get(index1));
                        } else if (end1.get(index1).getSize() == 1) {
                            board.moveCheckerToBar(start1.get(index1), end1.get(index1), currentPlayer == 1);
                        } else {
                            board.moveChecker(start1.get(index1), end1.get(index1), currentPlayer == 1);
                        }
                    } else {
                        System.out.print("Incorrect input");
					}
					board.printBoard();

					// Dice2
					ArrayList<Path> dice2Paths = board.getPathByColor(currentPlayer == 1, result[1]);
					char choice2 = 'A';
					ArrayList<String> choices2 = new ArrayList<>();
					ArrayList<Point> start2 = new ArrayList<>();
					ArrayList<Point> end2 = new ArrayList<>();
					
					if (usingDice1 && update1) {
						System.out.println(currentPlayerName + "to play " + result[1] + " Select from:");
						choices2.add(choice2 + " ");
						
						for (int j = 0; j < dice2Paths.size(); j++) {
							start2.add(dice2Paths.get(j).start);
							end2.add(dice2Paths.get(j).end);
							
							System.out.println(choice2 + " " + (start2.get(j) != null ? start2.get(j).number : "BAR")
										+ "->" + (end2.get(j) != null ? end2.get(j).number : "OFF"));
							
							choice2++;
							choices2.add(choice2 + " ");
						}
						System.out.println(currentPlayerName + " Choose path:");
						String move2 = in.nextLine().trim().toUpperCase();
						int index2 = 0;
						for (int y = 0; y < choices1.size(); y++) {
							if (move2.equals(choices2.get(y).trim())) {
								update2 = true;
								index2 = y;
								usingDice2 = true;
								break;
							}
						}
						if (update2) {
                            if (end2.get(index2) == null) {
                                if (currentPlayer == 1) {
                                    offRed = board.moveCheckerToOff(start2.get(index2), currentPlayer == 1);
                                } else {
                                    offWhite = board.moveCheckerToOff(start2.get(index2), currentPlayer == 1);
                                }
                                point = board.updateMoveToOff(start2.get(index2));
                            } else if (end2.get(index2).getSize() == 1) {
                                board.moveCheckerToBar(start2.get(index2), end2.get(index2), currentPlayer == 1);
                            } else {
                                board.moveChecker(start2.get(index2), end2.get(index2), currentPlayer == 1);
                            }
                        } else {
							System.out.print("Incorrect input");
						}

						board.printBoard();
					}

				}
		
			currentPlayer = (currentPlayer == 1 ? 2 : 1);
		}
		
		if (quit) {
			System.out.println("Game ended");
		} else if (board.checkWin(currentPlayer == 1)) {
			System.out.println("Game Over!");
		}
		
		}
	}

}

