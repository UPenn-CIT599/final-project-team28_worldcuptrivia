package worldcuptrivia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class TeamTest {

	@Test
	void testGetTotalNumGames() {
		FileParser fp = new FileParser("https://cit591-public.s3.amazonaws.com/MatchStats.csv");
		HashMap<String, Team> gt = fp.getTeams();
		Team morocco = gt.get("Morocco");
		int moroccoGames = morocco.getTotalNumGames();
		assertEquals(3, moroccoGames);
		// Morocco played only 3 games because it was eliminated at the group stage
	}
	
	@Test
	void testGetTotalWins() {
		FileParser fp = new FileParser("https://cit591-public.s3.amazonaws.com/MatchStats.csv");
		HashMap<String, Team> gt = fp.getTeams();
		Team peru = gt.get("Peru");
		int peruWins = peru.getTotalWins();
		assertEquals(1, peruWins);
		// Peru won only 1 game
	}
	
	@Test
	void testGetTotalLosses() {
		FileParser fp = new FileParser("https://cit591-public.s3.amazonaws.com/MatchStats.csv");
		HashMap<String, Team> gt = fp.getTeams();
		Team australia = gt.get("Australia");
		int australiaLosses = australia.getTotalLosses();
		assertEquals(2, australiaLosses);
		// Australia lost 2 games
	}
	
	@Test
	void testGetTotalGoalsAgainst() {
		FileParser fp = new FileParser("https://cit591-public.s3.amazonaws.com/MatchStats.csv");
		HashMap<String, Team> gt = fp.getTeams();
		Team iceland = gt.get("Iceland");
		int icelandGoalsAgainst = iceland.getTotalGoalsAgainst();
		assertEquals(5, icelandGoalsAgainst);
		// Iceland had 5 goals against
	}

}
