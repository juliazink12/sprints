package backgammon;
import java.util.*;

public class Dice {
	
	private final static double SIDES_ON_DICE = 6.0;
	static Random rand;
	private int dice1;
	private int dice2;
	private int useDice1;
	private int useDice2;
	
	public Dice(){
		rand = new Random();
	}
	
	public Dice(Dice d) {
		dice1 = d.dice1;
		dice2 = d.dice2;
		useDice1 = d.useDice1;
		useDice2 = d.useDice2;
		rand = new Random();
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
		if(dice1 == dice2){
			useDice1 = useDice2 = 2;
		}else{
			useDice1 = useDice2 = 1;
		}
	}
	
	public boolean onDice(int number){
		if(useDice1 > 0 && dice1 == number) return true;
		if(useDice2 > 0 && dice2 == number) return true;
		return false;
	}
	
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
	
	public int getDiceOne(){
		return dice1;
	}
	
	public int getDiceTwo(){
		return dice2;
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
	

	
}
