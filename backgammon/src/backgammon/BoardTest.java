package backgammon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
	
	private Board board;

	@BeforeEach
	void setUp() {
		board = new Board();
		board.setUp();
	}
	
	@Test
	void testBoard() {
		assertNotNull(board);
	}
	
	@Test
	void testGetMaxSize() {
		assertEquals(5, board.getMaxSize());
	}
	
	
	
	

}
