package backgammon;
import java.util.*;

public class Checker {
	
	boolean color;
	int id;
	int position;
	
	// constructor
	public Checker(boolean c, int i, int p) {
		color = c;
		id = i;
		position = p;
	}
	
	public boolean getColor() {
		return color;
	}
	
	public int getId() {
		return id;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int n) {
		position = n;
	}

}
