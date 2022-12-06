package backgammon;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class PointTest {

	private Point point;
	private Checker checker;
	
	@BeforeEach
	void setUp() {
		point = new Point(1,1);
		checker = new Checker(true);
		point.addChecker(checker);
	}
	
	@Test
	void testPoint() {
		assertNotNull(point);
	}
	
	@Test
	void testGetNumber() {
		assertEquals(1,point.getNumber());
	}
	
	@Test
	void testGetQuarter() {
		assertEquals(1,point.getQuarter());
	}
	
	@Test
	void testGetLastChecker() {
		assertEquals(checker,point.getLastChecker());
	}
	
	@Test
	void testPointToString() {
		assertEquals("W",point.pointToString(0));
	}
	
	@Test
	void testIsEmpty() {
		assertEquals(false,point.isEmpty());
	}
	
	@Test
	void testGetSize() {
		assertEquals(1,point.getSize());
	}

}
