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

	@Test
	void testGameWithMostGoals() {
		// Obtains result from gameWithMostGoals method
		SoccerAnalysis soccerAnalysis = new SoccerAnalysis();
		String result = soccerAnalysis.gameWithMostGoals();

		// Sets up string with what we know to be the correct answer
		StringBuilder builder = new StringBuilder();
		builder.append("The games with the most goals were:" + "\nBelgium versus Tunisia." + "\nEngland versus Panama."
				+ "\nFrance versus Argentina." + "\nThey all had 7 goals!");
		String correctAnswer = builder.toString();

		// Tests method result versus correct answer
		assertEquals(correctAnswer, result);
	}
}