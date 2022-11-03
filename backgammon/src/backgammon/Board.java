package backgammon;
import java.util.*;

public class Board {
	
	private int homeWhite;
	private int homeRed;
	private int bar;
	private int[] board;
	
	private int[] checkerCounts;
	//ต้องมี private Checker.Color[] checkerColors; มั้ย??
	
	private Point points;
	private Checker checkers;
	
	public Board(){
		homeWhite = 0;
		homeRed = 0;
		bar = 0;
		setUp();
	}
	
	public void setBoard(int[] board) {
		// for debugging
		this.board = board;
	}
	
	public void setUp() {
		checkerCounts = new int[24];
		//color class?
	}
	
	public int getCheckerCount(int i) {
		if(i < 0 || i > 24) return 0;
		
		return checkerCounts[i];
	}
	
	/*
	 * public Checker getChecker(int i) {
		if(i < 0 || i > 24) return checkers;
	}
*/
	
	//getbarcount??
	
}
