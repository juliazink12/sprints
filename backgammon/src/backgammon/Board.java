package backgammon;
import java.util.*;

public class Board {
	
	public ArrayList<Point> points;
	private ArrayList<Checker> checkers;
	
	
	public Board(){
		
		points = new ArrayList<>(24);
		for (int i=1; i<=24; i++) {
			if (i<=6) {
				points.add(new Point(i,1));
			}else if (i>6 && i<=12) {
				points.add(new Point(i,2));
			}else if (i>12 && i<=18) {
				points.add(new Point(i,3));
			}else {
				points.add(new Point(i,4));
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
			if (k<=4) {
				points.get(0).addChecker(checkers.get(k));
			}else if (k>4 &&k<=6) {
				points.get(11).addChecker(checkers.get(k));
			}else if (k>6 &&k<=11) {
				points.get(18).addChecker(checkers.get(k));
			}else if (k>11 &&k<=14) {
				points.get(16).addChecker(checkers.get(k));
			}else if (k>14 &&k<=19) {
				points.get(6).addChecker(checkers.get(k));
			}else if (k>19 &&k<=22) {
				points.get(4).addChecker(checkers.get(k));
			}else if (k>22 &&k<=27) {
				points.get(12).addChecker(checkers.get(k));
			}else {
				points.get(23).addChecker(checkers.get(k));
			}
		}
	}
	
	public void printBoard() {
		StringBuilder s = new StringBuilder();
		//print first section
		s.append("\n1\t2\t3\t4\t5\t6\tBAR\t7\t8\t9\t10\t11\t12\tOFF\n");
		s.append("|\t|\t|\t|\t|\t|\t||\t|\t|\t|\t|\t|\t|\t| |\n");
		int x = getMaxSize()+1;
		s.append(printSectionOne(x));

		s.append("===========================================================================================================\n");
		
		//print second section
		s.append(printSectionTwo(x));
		s.append("|\t|\t|\t|\t|\t|\t||\t|\t|\t|\t|\t|\t|\t| |\n");
		s.append("13\t14\t15\t16\t17\t18\tBAR\t19\t20\t21\t22\t23\t24\tOFF\n");
		System.out.print(s);
	}
	
	public StringBuilder printSectionOne(int n) {
		StringBuilder s1 = new StringBuilder();
		for (int m=0; m<n; m++) {
			for(int l=0; l<6; l++) {
				if(points.get(l).isEmpty()) {
					s1.append(" ");
				}else if(points.get(l).getSize()>m) {
					s1.append(" "+points.get(l).pointToString(m));
				}else{
					s1.append(" ");
				}
				s1.append("\t");
			}
			s1.append("| |\t");

			for(int l=6; l<12; l++) {
				if(points.get(l).isEmpty()) {
					s1.append(" ");
				}else if(points.get(l).getSize()>m) {
					s1.append(points.get(l).pointToString(m));
				}else{
					s1.append(" ");
				}
				s1.append("\t");
			}
			s1.append("| |\n");
		}
		return s1;
	}
	
	public StringBuilder printSectionTwo(int n) {
		StringBuilder s2 = new StringBuilder();
		for (int m=n-1; m>=0; m--) {
			for(int l=12; l<18; l++) {
				if(points.get(l).isEmpty()) {
					s2.append(" ");
				}else if(points.get(l).getSize()>m) {
					s2.append(" "+points.get(l).pointToString(m));
				}else{
					s2.append(" ");
				}
				s2.append("\t");
			}
			s2.append("| |\t");

			for(int l=18; l<24; l++) {
				if(points.get(l).isEmpty()) {
					s2.append(" ");
				}else if(points.get(l).getSize()>m) {
					s2.append(points.get(l).pointToString(m));
				}else{
					s2.append(" ");
				}
				s2.append("\t");
			}
			s2.append("| |\n");
		}
		return s2;
	}
	
	public int getMaxSize() {
		int maxSize = -1;
		for(Point point: points) {
			if (point.getSize() > maxSize) {
				maxSize = point.getSize();
			}
		}
		return maxSize;
	}
	
	
	
}
