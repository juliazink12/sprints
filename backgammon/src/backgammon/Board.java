package backgammon;
import java.util.*;


public class Board {
	
	private int homeWhite;
	private int homeRed;
	private int bar;
	private String[] board;
	public ArrayList<Point> points;
	private ArrayList<Checker> checkers;
	
	
	public Board(){
		homeWhite = 0;
		homeRed = 0;
		bar = 0;
		
		points = new ArrayList<>(24);
		for (int i=1; i<=24; i++) {
			if (i<=6) {
				points.add(new Point(i,1));
			}else if (i>6 && i<=12) {
				points.add(new Point(i,2));
			}else if (i>12 && i<=18) {
				points.add(new Point(i,3));
			}else {
				points.add(new Point(i,2));
			}	
		}
		checkers = new ArrayList<>(30);
		for (int j=1; j<=30; j++) {
			if (j<=15) {
				checkers.add(new Checker(true));
			}else {
				checkers.add(new Checker(false));
			}
		}
	}
	
	
	public void setUp() {
		for (int k=0; k<30; k++) {
			if (k<2) {
				points.get(0).addChecker(checkers.get(k));
			}else if (k>2 &&k<=7) {
				points.get(11).addChecker(checkers.get(k));
			}else if (k>7 &&k<=10) {
				points.get(16).addChecker(checkers.get(k));
			}else if (k>10 &&k<=15) {
				points.get(18).addChecker(checkers.get(k));
			}else if (k>15 &&k<=20) {
				points.get(5).addChecker(checkers.get(k));
			}else if (k>20 &&k<=23) {
				points.get(7).addChecker(checkers.get(k));
			}else if (k>23 &&k<=28) {
				points.get(12).addChecker(checkers.get(k));
			}else {
				points.get(23).addChecker(checkers.get(k));
			}
		}
	}
	
	public void printBoard() {
		String temp = "";
		System.out.println(" ");
		for (int n=0;n<24; n++) {
			temp = "    1 \t " + points.get(n).pointToString();
			System.out.println(temp);
		}
	}
	
	
	
}
