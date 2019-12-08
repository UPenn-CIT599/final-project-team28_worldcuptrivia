package worldcuptrivia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test
	void testGetTeam1() {
		FileParser fp = new FileParser("https://cit591-public.s3.amazonaws.com/MatchStats.csv");
		HashMap<Integer, Game> gg = fp.getGames();
		Game g1 = gg.get(1);
		String Team1 = g1.getTeam1().getName();
		assertEquals("Russia", Team1);
		// Russia played the openning game because they are the host country
	}

	@Test
	void testGetTeam2() {
		FileParser fp = new FileParser("https://cit591-public.s3.amazonaws.com/MatchStats.csv");
		HashMap<Integer, Game> gg = fp.getGames();
		Game g2 = gg.get(2);
		String Team2 = g2.getTeam2().getName();
		assertEquals("Uruguay", Team2);
		// Uruguay played game two
	}

}
