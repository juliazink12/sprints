package backgammon;
import java.util.*;

public class Checker {
	
	boolean color;
	
	// constructor
	public Checker(boolean c) {
		color = c;
	}
	
	public boolean getColor() {
		return color;
	}
	
	public String getDisplayString() {
		if (color) {
			return ("O");
		}
		else {
			return ("\u001B[31m O \u001B[0m");
		}
	}

}
