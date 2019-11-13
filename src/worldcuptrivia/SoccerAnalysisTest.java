package worldcuptrivia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SoccerAnalysisTest {

	@Test
	void testBestOffense() {
		SoccerAnalysis sa = new SoccerAnalysis(ArrayList<Game> someGames);
		String result = sa.teamWithMostGoals();
		assertEquals("The team with the most goals was Belgium with 13.", result); 
		// which we know to be the true result
	}

}
