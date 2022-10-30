package backgammon;
import java.util.*;

public class View {

	Scanner in;
	private String name;
	//Random rand;
	
	View(){
	 in = new Scanner(System.in);
	 //rand = new Random();
	}
	
	/* used in Main Class
	System.out.println("Players please enter roll to start:");
	String command = in.nextLine();
	System.out.println("Player 1:"+p1+"\t"+"Player 2:"+p2);*/
	
	public void welcomePlayers() {
		System.out.println("Welcome to Backgammon");
	}	
	
	public String introToGame() {
		System.out.println("What is your name?");
		String name = in.nextLine();	
		return name;
	}
	
	/*used in Dice class?
	public int rollingDice(String input) {
		if (input.equals("roll")) {
			int num =6;
			int d1 = rand.nextInt(num);
			int d2 = rand.nextLine(num);
				
			if (d1==0){ d1= d1+1; } 
			if (d2==0){ d2= d2+1; }
		}
		return d1+d2;
	}
	*/
	
	public void displayDice(int dice, int x) {
		System.out.print("Player "+x+" : "+dice);
	}
	
	public void displayBoard() {
		
	}
	
	public void displayLog() {
		
	}	
	
}
