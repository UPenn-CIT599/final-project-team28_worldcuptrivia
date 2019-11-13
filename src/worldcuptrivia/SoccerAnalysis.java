/**
 * This will be the main analysis class
**/

package worldcuptrivia;

import java.util.ArrayList;
import java.util.Collections;

public class SoccerAnalysis {

	// instance variables
	ArrayList<Game> games;
	FileParser data;

	// constructor
	public SoccerAnalysis(ArrayList<Game> someGames) {
		this.games = someGames;
		data = new FileParser("MatchStats.csv");
	}

	/**
	 * This method computes the team that scored the most goals.
	 * 
	 * @return A string declaring the team and number of goals.
	 */
	public String teamWithMostGoals() {
		ArrayList<String> teams = new ArrayList<>();
		ArrayList<Integer> goalsScored = new ArrayList<>();

		for (String team : data.teams.keySet()) {
			teams.add(data.teams.get(team).getName());
			goalsScored.add(data.teams.get(team).getTotalGoalsFor());
		}

		String teamWithMostGoals = "The team with the most goals was "
				+ teams.get(goalsScored.indexOf(Collections.max(goalsScored))) + " with "
				+ goalsScored.get(Collections.max(goalsScored)) + ".";

		return teamWithMostGoals;
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
