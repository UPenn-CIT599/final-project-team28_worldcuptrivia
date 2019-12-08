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
		// Which we know to be the true result
	}

}
