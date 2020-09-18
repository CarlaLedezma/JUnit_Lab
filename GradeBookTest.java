package Lab_JUnit_GradeBook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	GradeBook g1;
	GradeBook g2;


	@BeforeEach
	void setUp() throws Exception {

		g1 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		
		g2 = new GradeBook(5);
		g2.addScore(100);
		g2.addScore(200);
		g2.addScore(100);
		g2.addScore(30);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;

	}

	@Test
	void testAddScore() {
		/*
		 * i.	Use the toString method to compare the contents of
		 *  what is in the scores array vs. what is expected to be
		 *   in the scores array 
		 *   assertTrue( . . .)
		 */
		assertTrue(g1.toString().equals("50.0 75.0 "));
		assertTrue(g2.toString().equals("100.0 200.0 100.0 30.0 "));


		/*
		 * ii.	Compare the scoreSize to the expected number of scores entered.
		 * assertEquals(. . .)		 */
		assertEquals(2, g1.getScoreSize(), .001);
		assertEquals(4, g2.getScoreSize(), .001);


	}

	@Test
	void testSum() {
		assertEquals(125, g1.sum(), .0001);
		assertEquals(430, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(50, g1.minimum(), .001);
		assertEquals(30, g2.minimum(), .001);

	}

	@Test
	void testFinalScore() {

		/*
		 * i.	Compare what is returned by finalScore() to the expected finalscore
		 *  of the scores entered.
		 */
		assertEquals(75, g1.finalScore(), .001);
		assertEquals(400, g2.finalScore(), .001);

		
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize(), .001);
		assertEquals(4, g2.getScoreSize(), .001);

	}

	@Test
	void testToString() {
		
		assertTrue(g1.toString().equals("50.0 75.0 "));
		assertTrue(g2.toString().equals("100.0 200.0 100.0 30.0 "));

	}

}
