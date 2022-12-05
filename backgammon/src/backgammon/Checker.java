//package backgammon;
import java.util.*;

//update okay

public class Checker {
	
	boolean color;
	
	// constructor
	public Checker(boolean c) {
		color = c;
	}
	
	public boolean getColor() {
		return color;
	}

	public boolean isWhite() {
		return color;
	}
	
	public boolean isRed() {
		return !color;
	}
	
	public String getDisplayString() {
		if (color) {
			return ("W");
		}
		else {
			return ("R");
			//\u001B[31mO\u001B[0m
		}
	}

}
