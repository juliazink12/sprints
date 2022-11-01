//package backgammon;
import java.util.*;

public class Point {
	
	// this class is for the "points" (triangles/spikes of the board)
	//test
	
	int number;
	ArrayList<Checker> checkerList;
	int quarter; //indicates what quarter of the board the point is in (top/bottom, right/left) 
	
	public int getNumber() {
		return number;
	}
	
	public int getQuarter() {
		return quarter;
	}
	
	public void addChecker(Checker c) {
		checkerList.add(c);
	}
	
	public Checker getLastChecker() {
		if (checkerList.size()>=1) {
			return checkerList.get(checkerList.size()-1);
		}
		else {
			return new Checker(false, 100, 100);
		}
	}
	
	public void removeLastChecker() {
		if (checkerList.size()>=1) {
			checkerList.remove(checkerList.size()-1);
		}
	}
	

}
