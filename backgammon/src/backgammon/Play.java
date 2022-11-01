package backgammon;
import java.util.*;


public class Play {
	
	
	
	public static int[] rollDice() {
		Random rand = new Random();;
		int dice1 = rand.nextInt(6) + 1;
		int dice2 = rand.nextInt(6) + 1;
		int[] result = {dice1, dice2};
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Checker checker1 = new Checker(true);
		Checker checker2 = new Checker(true);
		Checker checker3 = new Checker(true);
		Checker checker4 = new Checker(true);
		Checker checker5 = new Checker(true);
		Checker checker6 = new Checker(true);
		Checker checker7 = new Checker(true);
		Checker checker8 = new Checker(true);
		Checker checker9 = new Checker(true);
		Checker checker10 = new Checker(true);
		Checker checker11 = new Checker(true);
		Checker checker12 = new Checker(true);
		Checker checker13 = new Checker(true);
		Checker checker14 = new Checker(true);
		Checker checker15 = new Checker(false);
		Checker checker16 = new Checker(false);
		Checker checker17 = new Checker(false);
		Checker checker18 = new Checker(false);
		Checker checker19 = new Checker(false);
		Checker checker20 = new Checker(false);
		Checker checker21 = new Checker(false);
		Checker checker22 = new Checker(false);
		Checker checker23 = new Checker(false);
		Checker checker24 = new Checker(false);
		Checker checker25 = new Checker(false);
		Checker checker26 = new Checker(false);
		Checker checker27 = new Checker(false);
		Checker checker28 = new Checker(false);
		Checker checker29 = new Checker(false);
		Checker checker30 = new Checker(false);
		
		Point point1 = new Point(1,1);
		Point point2 = new Point(2,1);
		Point point3 = new Point(3,1);
		Point point4 = new Point(4,1);
		Point point5 = new Point(5,1);
		Point point6 = new Point(6,1);
		Point point7 = new Point(7,2);
		Point point8 = new Point(8,2);
		Point point9 = new Point(9,2);
		Point point10 = new Point(10,2);
		Point point11 = new Point(11,2);
		Point point12 = new Point(12,2);
		Point point13 = new Point(13,3);
		Point point14 = new Point(14,3);
		Point point15 = new Point(15,3);
		Point point16 = new Point(16,3);
		Point point17 = new Point(17,3);
		Point point18 = new Point(18,3);
		Point point19 = new Point(19,4);
		Point point20 = new Point(20,4);
		Point point21 = new Point(21,4);
		Point point22 = new Point(22,4);
		Point point23 = new Point(23,4);
		Point point24 = new Point(24,4);
		
		point1.addChecker(checker1);
		point1.addChecker(checker2);
		point12.addChecker(checker3);
		point12.addChecker(checker4);
		point12.addChecker(checker5);
		point12.addChecker(checker6);
		point12.addChecker(checker7);
		point17.addChecker(checker8);
		point17.addChecker(checker9);
		point17.addChecker(checker10);
		point19.addChecker(checker11);
		point19.addChecker(checker12);
		point19.addChecker(checker13);
		point19.addChecker(checker14);
		point19.addChecker(checker15);
		
		point6.addChecker(checker16);
		point6.addChecker(checker17);
		point6.addChecker(checker18);
		point6.addChecker(checker19);
		point6.addChecker(checker20);
		point8.addChecker(checker21);
		point8.addChecker(checker22);
		point8.addChecker(checker23);
		point13.addChecker(checker24);
		point13.addChecker(checker25);
		point13.addChecker(checker26);
		point13.addChecker(checker27);
		point13.addChecker(checker28);
		point24.addChecker(checker29);
		point24.addChecker(checker30);
		
		
		
		
		
		
		System.out.println("Backgammon");
		
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
				int[] result = rollDice();
				System.out.println(result[0] + ", " + result[1]);
			}
			
			
			String temp = "";
			
			System.out.println(" ");
			
			temp = "    1 \t " + point1.pointToString();
			System.out.println(temp);
			temp = "    2 \t " + point2.pointToString();
			System.out.println(temp);
			temp = "    3 \t " + point3.pointToString();
			System.out.println(temp);
			temp = "    4 \t " + point4.pointToString();
			System.out.println(temp);
			temp = "    5 \t " + point5.pointToString();
			System.out.println(temp);
			temp = "    6 \t " + point6.pointToString();
			System.out.println(temp);
			temp = "    7 \t " + point7.pointToString();
			System.out.println(temp);
			temp = "    8 \t " + point8.pointToString();
			System.out.println(temp);
			temp = "    9 \t " + point9.pointToString();
			System.out.println(temp);
			temp = "    10 \t " + point10.pointToString();
			System.out.println(temp);
			temp = "    11 \t " + point11.pointToString();
			System.out.println(temp);
			temp = "    12 \t " + point12.pointToString();
			System.out.println(temp);
			temp = "    13 \t " + point13.pointToString();
			System.out.println(temp);
			temp = "    14 \t " + point14.pointToString();
			System.out.println(temp);
			temp = "    15 \t " + point15.pointToString();
			System.out.println(temp);
			temp = "    16 \t " + point16.pointToString();
			System.out.println(temp);
			temp = "    17 \t " + point17.pointToString();
			System.out.println(temp);
			temp = "    18 \t " + point18.pointToString();
			System.out.println(temp);
			temp = "    19 \t " + point19.pointToString();
			System.out.println(temp);
			temp = "    20 \t " + point20.pointToString();
			System.out.println(temp);
			temp = "    21 \t " + point21.pointToString();
			System.out.println(temp);
			temp = "    22 \t " + point22.pointToString();
			System.out.println(temp);
			temp = "    23 \t " + point23.pointToString();
			System.out.println(temp);
			temp = "    24 \t " + point24.pointToString();
			System.out.println(temp);

			
			
			
			
			
			
			
			currentPlayer = (currentPlayer == 1 ? 2 : 1);
		}
		
		if (quit) {
			System.out.println("Game ended");
		}
		
		
	}

}
