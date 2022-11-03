package backgammon;
import java.util.*;

public class View {
/*
	Scanner in;
	private String name;
	Dice dices;
	Player players;
	
	View(){
	 in = new Scanner(System.in);
	}
	*/
	
	//bfdwb
	
	/* used in Main Class
	System.out.println("Players please enter roll to start:");
	String command = in.nextLine();
	System.out.println("Player 1:"+p1+"\t"+"Player 2:"+p2);*/
	
	/*
	public void welcomePlayers() {
		System.out.println("Welcome to Backgammon");
	}	
	
	public String introToGame() {
		System.out.println("What is your name?");
		String name = in.nextLine();	
		return name;
	}

	public int rollingDice(String input) {
		if (input.equals("roll")) {
			displayDice(dices, players);
		}
	}
	
	public void displayDice(Dice dices, int players) {
		System.out.print("Player "+players+" : "+ Dice.getDiceOne+"+"+Dice.getDiceTwo);
	}
	
	public void displayBoard(Board b) {
		StringBuilder sb = new StringBuilder();
		sb.append("--1---2---3---4---5---6----B----7---8---9--10--11--12--\n");
		for(int i=1; i<=5; i++){
			drawTopCheckerLine(i,b,sb);
			sb.append("|\n");
		}
		drawTopNumberLines(b,sb);
		sb.append("|\n");
		sb.append("=======================================================\n");
		drawBottomNumberLines(b,sb);
		sb.append("|\n");
		for(int i=5; i>=1; i--){
			drawBottomCheckerLine(i,b,sb);
			sb.append("|\n");
		}
		sb.append("-24--23--22--21--20--19---BB---18--17--16--15--14--13--\n");
		
		System.out.print(sb);
	}
	
	private static void drawTopNumberLines(Board b, StringBuilder sb) {
		for(int j=0; j<6; j++){
			drawSegmentH(j,b,sb);
		}
		sb.append("|| ");
		if(b.getBarCount() >= 10){
			sb.append(1);
		}else if(b.getBarCount() > 5){
			sb.append(b.getBarCount());
		}else{
			sb.append(' ');
		}
		sb.append(" |");
		for(int j=6; j<12; j++){
			drawSegmentH(j,b,sb);
		}
		sb.append("|\n");

		for(int j=0; j<6; j++){
			drawSegmentL(j,b,sb);
		}
		sb.append("|| ");
		if(b.getBarCount() >= 10){
			sb.append(b.getBarCount()-10);
		}else{
			sb.append(' ');
		}
		sb.append(" |");
		for(int j=6; j<12; j++){
			drawSegmentL(j,b,sb);
		}
	}
	
	private static void drawBottomNumberLines(Board b, StringBuilder sb) {
		for(int j=23; j>17; j--){
			drawSegmentH(j,b,sb);
		}
		sb.append("|| ");
		if(b.getBarCount() >= 10){
			sb.append(1);
		}else if(b.getBarCount() > 5){
			sb.append(b.getBarCount());
		}else{
			sb.append(' ');
		}
		sb.append(" |");
		for(int j=17; j>11; j--){
			drawSegmentH(j,b,sb);
		}

		sb.append("|\n");

		for(int j=23; j>17; j--){
			drawSegmentL(j,b,sb);
		}
		sb.append("|| ");
		if(b.getBarCount() >= 10){
			sb.append(b.getBarCount()-10);
		}else{
			sb.append(' ');
		}
		sb.append(" |");
		for(int j=17; j>11; j--){
			drawSegmentL(j,b,sb);
		}
	}

	private static void drawSegmentH(int j, Board b, StringBuilder sb) {
		sb.append("| ");
		if(b.getCheckerCount(j) >= 10){
			sb.append(1);
		}else if(b.getCheckerCount(j) > 5){
			sb.append(b.getCheckerCount(j));
		}else{
			sb.append(' ');
		}
		sb.append(" ");		
	}

	private static void drawSegmentL(int j, Board b, StringBuilder sb) {
		sb.append("| ");
		if(b.getCheckerCount(j) >= 10){
			sb.append(b.getCheckerCount(j)-10);
		}else{
			sb.append(' ');
		}
		sb.append(" ");		
	}
	
	private static void drawTopCheckerLine(int i, Board b, StringBuilder sb) {
		for(int j=0; j<6; j++){
			drawSegment(i,j,b,sb);
		}
		sb.append("|| ");
		if(b.getBarCount() >= i){
			sb.append(checkers);
		}else{
			sb.append(' ');
		}
			
		sb.append(" |");
		for(int j=6; j<12; j++){
			drawSegment(i,j,b,sb);
		}
	}
	
	private static void drawBottomCheckerLine(int i, Board b, StringBuilder sb) {
		for(int j=23; j>17; j--){
			drawSegment(i,j,b,sb);
		}
		sb.append("|| ");
		if(b.getBarCount() >= i){
			sb.append();
		}else{
			sb.append(' ');
		}
		sb.append(" |");
		for(int j=17; j>11; j--){
			drawSegment(i,j,b,sb);
		}
	}
	
	private static void drawSegment(int i, int j, Board b, StringBuilder sb) {
		sb.append("| ");
		if(b.getCheckerCount(j) >= i){
			sb.append(b.getchecker(j));
		}else{
			sb.append(' ');
		}
		sb.append(" ");
	}
	
	public void displayLog() {
		
	}	
	*/
	
}
