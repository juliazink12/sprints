package backgammon;
import java.util.*;

//update okay

public class Point {
	
	// this class is for the "points" (triangles/spikes of the board)
	//test
	
	int number;
	ArrayList<Checker> checkerList;
	int quarter; //indicates what quarter of the board the point is in (top/bottom, right/left) 
	
	
	public Point(int n, int q) {
		checkerList = new ArrayList<Checker>();
		number = n;
		quarter = q; 
	}
	
	
	
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
			return null;
			//CHANGEEEEE
		}
	}
	
	public void removeLastChecker() {
		if (checkerList.size()>=1) {
			checkerList.remove(checkerList.size()-1);
		}
	}
	
	public String pointToString(int n) {
		String res = "";
		res = checkerList.get(n).getDisplayString();
		
		/*if (checkerList.size()>=1) {
			for (int k=0; k<checkerList.size(); k++) {
				res = res + " " + checkerList.get(k).getDisplayString();
			}
		}*/
		return res;
	}
	
	public boolean isEmpty() {
		return checkerList.isEmpty();
	}
	
	public int getSize() {
		return checkerList.size();
	}

}
