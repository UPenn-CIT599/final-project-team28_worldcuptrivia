package worldcuptrivia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SoccerAnalysisTest {

	@Test
	void testBestOffense() {
		SoccerAnalysis sa = new SoccerAnalysis(ArrayList<Game> someGames);
		String result = sa.bestOffense(someGames);
		assertEquals("Belgium", result); // which we know to be the true result
	}

}
