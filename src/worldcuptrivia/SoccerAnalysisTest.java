package worldcuptrivia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SoccerAnalysisTest {

	@Test
	void testBestOffense() {
		SoccerAnalysis soccerAnalysis = new SoccerAnalysis();
		String result = soccerAnalysis.teamWithMostGoals();
		assertEquals("The team with the most goals was Belgium with 16.", result); 
		// Which we know to be the true result
	}

}