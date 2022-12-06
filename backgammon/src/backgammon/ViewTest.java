package backgammon;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Test;

class ViewTest {

	private View view;
	
	@BeforeEach
	void setUp() {
		view = new View();
	}
	
	@Test
	void testView() {
		assertNotNull(view);
	}
	
	@Test
	void testIsValid() {
		assertEquals(true,view.isValid("roll"));
	}
	
	@Test
	void testGetScore() {
		assertEquals(view.player1Score,view.getScore(1));
	}
	
}
