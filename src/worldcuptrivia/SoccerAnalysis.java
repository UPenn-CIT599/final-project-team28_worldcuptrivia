/**
 * This will be the main analysis class
**/

package worldcuptrivia;

import java.util.ArrayList;
import java.util.HashMap;

public class SoccerAnalysis {

	// Instance variables
	FileParser data;
	HashMap<Integer, Game> games;
	HashMap<String, Team> teams;

	// Constructor
	public SoccerAnalysis() {
		data = new FileParser("MatchStats.csv");
		games = data.getGames();
		teams = data.getTeams();
	}

	/**
	 * This method computes the team that scored the most goals.
	 * 
	 * @return A string declaring the team and number of goals.
	 */
	public String teamWithMostGoals() {
		int goalsFor = 0;
		Team teamWithMostGoals = null;
		String answer;

		for (Team current : teams.values()) {
			if (current.getTotalGoalsFor() > goalsFor) {
				teamWithMostGoals = current;
				goalsFor = current.getTotalGoalsFor();
			}
		}

		answer = "The team with the most goals was " + teamWithMostGoals.getName() + " with "
				+ teamWithMostGoals.getTotalGoalsFor() + ".";
		return answer;
	}

	/**
	 * This method computes the game with the most goals
	 * 
	 * @param someGames an ArrayList of Games objects
	 * @return the id of the game with the most goals
	 */
	public String gameWithMostGoals(ArrayList<Game> someGames) {
		String id = "";
		// create a hashmap for games and total goals
		// loop through all games, add-up goals for and against and add to hashmaps
		// return the game id for the game with max goals
		// TODO write a unit test, number of goals should be in reasonable range (0-20)
		return id;
	}

	/**
	 * This method computes the team with least goals against
	 * 
	 * @param someGames an ArrayList of Games objects
	 * @return the name of the team with the least goals against
	 */
	public String bestDefense(ArrayList<Game> someGames) {
		String team = null;
		// create a hashmap for teams and total goals
		// loop through all games of a given team, add-up goals against add to hashmaps
		// return the team name for the team with least goals
		return team;
	}

	/**
	 * This method computes team you should see if you want to see woodwork
	 * 
	 * @param someGames an ArrayList of Games objects
	 * @return the team name
	 */
	public String mostWoodWork(ArrayList<Game> someGames) {
		String team = null;
		// create a hashmap for teams and total woodwork
		// loop through all games of a given team, add-up woodwork add to hashmaps
		// return the team name for the team with most woodwork
		return team;
	}

	/**
	 * This method computes team you should see if you want to see red cards
	 * 
	 * @param someGames an ArrayList of Games objects
	 * @return the team name
	 */
	public String mostViolent(ArrayList<Game> someGames) {
		String team = null;
		// create a hashmap for teams and total red cards
		// loop through all games of a given team, add-up redcards add to hashmaps
		// return the team name for the team with most red cards
		return team;
	}

}
