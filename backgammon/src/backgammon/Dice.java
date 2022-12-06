package backgammon;
import java.util.*;

public class Dice {
	
	private final static double SIDES_ON_DICE = 6.0;
	static Random rand;
	private int dice1;
	private int dice2;
	private int useDice1;
	private int useDice2;
	private int doublingCube;
	private int doublingCubePlayer;
	public boolean doubledAtLeastOnce;
	
	public Dice(){
		rand = new Random();
	}
	
	
	public int rollToStart(String name1, String name2) {
		Scanner in = new Scanner(System.in);
		System.out.println(name1 + ": roll to start");
		String input = in.nextLine().trim().toUpperCase();
		if(!input.equals("ROLL")){
			System.out.println("Incorrect");
			return rollToStart(name1, name2);
		}
		int[] result1 =rollDices();
		int player1Roll =result1[0]+result1[1];
		System.out.println(result1[0]+","+result1[1]);

		System.out.println(name2 + ": roll to start");
		String input2 = in.nextLine().trim().toUpperCase();
		if(!input2.equals("ROLL")){
			System.out.println("Incorrect");
			return rollToStart(name1, name2);
		}
		int[] result2 =rollDices();
		int player2Roll =result2[0]+result2[1];
		System.out.println(result2[0]+","+result2[1]);
		
		if(player1Roll==player2Roll) {
			System.out.println("Tie! Please roll again");
			return rollToStart(name1, name2);
		}else if(player1Roll>player2Roll) {
			return 1;
		}else{
			return 2;
		}
	}
	
	public int getRollDiceOne () {
		double roll = rand.nextDouble(SIDES_ON_DICE)+1.0;
		return (int) roll;
	}
	
	public int getRollDiceTwo () {
		double roll = rand.nextDouble(SIDES_ON_DICE)+1.0;
		return (int) roll;
	}
	
	public void roll(){
		dice1 = getRollDiceOne();
		dice2 = getRollDiceTwo();
		/*if(dice1 == dice2){
			useDice1 = useDice2 = 2;
		}else{
			useDice1 = useDice2 = 1;
		}*/
	}
	
	public int[] rollDices() {
		roll();
		int dices[]= {dice1, dice2};
		return dices;
	}

	
	public boolean checkDouble(int[] num) {
		if(num[0]==num[1])return true;
		return false;
	}
	
	public int getDiceOne(){
		return dice1;
	}
	
	public int getDiceTwo(){
		return dice2;
	}
	
	public void doubleGame() {
		doublingCube = doublingCube*2;
		doublingCubePlayer = (doublingCubePlayer == 1 ? 2 : 1);
		doubledAtLeastOnce = true;
	}
	
	
	public int getDoublingCubePlayer() {
		return doublingCubePlayer;
	}
	
	public void setDoublingCubePlayer(int n) {
		doublingCubePlayer = n;
	}
	
	public int getDoublingCube() {
		return doublingCube;
	}
	
	public void setDoublingCube(int n) {
		doublingCube = n;
	}
	
	
	public void displayCube(String name1, String name2) {
		String doublingCubePlayerName = (doublingCubePlayer == 1 ? name1 : name2); 
		System.out.println("\nValue: " + doublingCube + "\nPlayer: " + doublingCubePlayerName + "\n");
	}
	
	public boolean getDoubledAtLeastOnce() {
		return doubledAtLeastOnce;
	}
	
	public void setDoubledAtLeastOnce() {
		doubledAtLeastOnce = true;
	}
	
	/*
	public void rollDifferent(){
		do{
			dice1 = getRollDiceOne();
			dice2 = getRollDiceTwo();
		}while(dice1 == dice2);
		useDice1 = useDice2 = 1;
	}
	
	public boolean isRolled(){
		return useDice1 > 0 || useDice2 > 0;
	}
	
	public void useDice(int num){
		if(useDice1 > 0 && dice1 == num){
			useDice1--;
		}else if(useDice2 > 0 && dice2 == num){
			useDice2--;
		}else{
			throw new IllegalArgumentException("Trying to take invalid dice " + num);
		}
	}
	
	public int useDiceOne(){
		if(useDice1 == 0) return 0;
		useDice1--;
		return dice1;
	}
	
	public int useDiceTwo(){
		if(useDice2 == 0) return 0;
		useDice2--;
		return dice2;
	}
	*/

	
}
