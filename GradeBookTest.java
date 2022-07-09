import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	private static GradeBook book1;
	private GradeBook book2;
	
	
	
	
	@BeforeEach
	public void setUp() throws Exception {
		book1 = new GradeBook(5);
		book1.addScore(80);
		book1.addScore(90);
		book1.addScore(95);
		book1.addScore(92);
		book1.addScore(99);
		
		book2 = new GradeBook(5);
		book2.addScore(50);
		book2.addScore(60);
		book2.addScore(70);
		book2.addScore(75);
		book2.addScore(80);
	}

	@AfterEach
	public void tearDown() throws Exception {
		book1 = null;
		book2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(book1.toString().equals("80.0 90.0 95.0 92.0 99.0 "));
	    assertTrue(book2.toString().equals("50.0 60.0 70.0 75.0 80.0 "));
	    
	    assertEquals(5, book1.getScoresSize());
	    assertEquals(5, book2.getScoresSize());
	    
	}

	@Test
	public void testSum() {
		assertEquals(456, book1.sum());
		assertEquals(335, book2.sum());
	}

	@Test
	public void testMinimum() {
		assertEquals(80, book1.minimum());
		assertEquals(50, book2.minimum());
	}

	@Test
	public void testFinalScore() {
		assertEquals(376, book1.finalScore());
		assertEquals(285, book2.finalScore());
	}

}
