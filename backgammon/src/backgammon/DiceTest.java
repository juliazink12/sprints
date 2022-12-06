package backgammon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiceTest {

	private Dice dice;

	@BeforeEach
	void setUp() {
		dice = new Dice();
	}
	
	@Test
	void testBoard() {
		assertNotNull(dice);
	}
	
	/*
	@Test
	void testRollToStart() {
		assertTrue(((dice.rollToStart("name1", "name2")==1) || (dice.rollToStart("name1", "name2")==2)));
	}
	*/
	
	@Test
	void testGetRollDiceOne() {
		assertTrue(((dice.getRollDiceOne()>0) && (dice.rollToStart("name1", "name2")<7)));
	}
	
	@Test
	void testGetRollDiceTwo() {
		assertTrue(((dice.getRollDiceTwo()>0) && (dice.rollToStart("name1", "name2")<7)));
	}
	
	@Test
	void testRollDices() {
		int[] dices = dice.rollDices();
		int d1 = dices[0];
		int d2 = dices[1];
		assertTrue((d1>0) && (d1<7) && (d2>0) && (d2<7));
	}
	
	@Test
	void testCheckDouble() {
		int[] testTrue = {1, 1};
		boolean caseTrue = dice.checkDouble(testTrue);
		int[] testFalse = {2, 3};
		boolean caseFalse = dice.checkDouble(testFalse);
		assertTrue((caseTrue) && (!caseFalse));
	}
	
	

}
