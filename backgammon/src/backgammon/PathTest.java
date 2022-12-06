package backgammon;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.*;

class PathTest {

	private Path path;
	Point start; 
	Point end;
	
	@BeforeEach
	void setUp() {
		start = new Point(1,1);
		end = new Point(3,1);
		path = new Path(start, end, true);
	}
	
	@Test
	void testPath() {
		assertNotNull(path);
	}

}
