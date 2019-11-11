/**
 * This class will generate a trivia fact based on the input file and the analysis
 * @author Pierre
 *
 */

package worldcuptrivia;

import java.util.ArrayList;
import java.util.HashMap;

public class FactsUtil {
	
	/**
	 * this method generates the trivia HashMap that is quizzed later on
	 * @return
	 */
	public HashMap<String, String> generateTrivia(ArrayList<Game> someGames) {
		HashMap<String, String> map = new HashMap<>();
		SoccerAnalysis sa = new SoccerAnalysis(someGames);
		map.put("Most Goals", sa.gameWithMostGoals(someGames));
		map.put("Best Offense", sa.bestOffense(someGames));
		map.put("Best Defense", sa.bestDefense(someGames));
		map.put("Most Woodwork", sa.mostWoodWork(someGames));
		map.put("Most Violent", sa.mostViolent(someGames));		
		return map;
	}
	
	//TODO replicate and adapt get keys logic from airplane example?

}
