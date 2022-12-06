package backgammon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckerTest {
	
	private Checker checker0;
	private Checker checker1;
	
	@BeforeEach
	void setUp() {
		checker0 = new Checker(false);
		checker1 = new Checker(true);
	}

	@Test
	void testGetColor() {
		assertTrue((!checker0.getColor()) && (checker1.getColor()));
	}
	
	@Test
	void testIsWhite() {
		assertTrue((!checker0.isWhite()) && (checker1.isWhite()));
	}
	
	@Test
	void testIsRed() {
		assertTrue((checker0.isRed()) && (!checker1.isRed()));
	}

	
	
}
