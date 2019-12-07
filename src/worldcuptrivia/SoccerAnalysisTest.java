package worldcuptrivia;

/*
 * This is our test class for SoccerAnalysis
 */

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
				+ "\nand France versus Argentina." + "\nThey all had 7 goals!");
		String correctAnswer = builder.toString();

		// Tests method result versus correct answer
		assertEquals(correctAnswer, result);
	}

	@Test
	void testBestDefense() {
		// Obtains result from bestDefense method
		SoccerAnalysis soccerAnalysis = new SoccerAnalysis();
		String result = soccerAnalysis.bestDefense();

		// Tests method result versus correct answer
		assertEquals("The team with the best defense was Denmark with 0.5 goals conceded per game.", result);
	}

	@Test
	void testMostWoodWork() {
		// Obtains result from mostWoodWork method
		SoccerAnalysis soccerAnalysis = new SoccerAnalysis();
		String result = soccerAnalysis.mostWoodWork();

		// Tests method result versus correct answer
		assertEquals("The team with the most shots hitting woodwork was: Croatia. They had 4 shots that hit woodwork!",
				result);
	}
	
	@Test
	void testMostViolent() {
		// Obtains result from mostViolent method
		SoccerAnalysis soccerAnalysis = new SoccerAnalysis();
		String result = soccerAnalysis.mostViolent();

		// Sets up string with what we know to be the correct answer
		StringBuilder builder = new StringBuilder();
		builder.append("The teams with the most red cards were:" + "\nColombia." + "\nand Switzerland."
				+ "\nThey all had 1 red card.");
		String correctAnswer = builder.toString();

		// Tests method result versus correct answer
		assertEquals(correctAnswer, result);
	}
}