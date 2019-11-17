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
		// initialize the method
		int goalsFor = 0;
		Team teamWithMostGoals = null;
		String answer;
		// looping over goals and comparing to current max
		for (Team current : teams.values()) {
			if (current.getTotalGoalsFor() > goalsFor) {
				teamWithMostGoals = current;
				goalsFor = current.getTotalGoalsFor();
			}
		}
		// update and return the answer
		answer = "The team with the most goals was " + teamWithMostGoals.getName() + " with "
				+ teamWithMostGoals.getTotalGoalsFor() + ".";
		return answer;
	}

	/**
	 * This method computes the game with the most goals
	 * 
	 * @return the id of the game with the most goals
	 */
	public String gameWithMostGoals() {
		// initialize the method
		int goalsInGame = 0;
		Game gameWithMostGoals = null;
		String answer;
		// looping over games and comparing to current max
		for (Game current : games.values()) {
			if ((current.getTeam1Score() + current.getTeam2Score()) > goalsInGame) {
				gameWithMostGoals = current;
				goalsInGame = (current.getTeam1Score() + current.getTeam2Score());
			}
		}
		// update and return the answer
		answer = "The game with the most goals was " + gameWithMostGoals.getTeam1().getName() +
				" versus " + gameWithMostGoals.getTeam2().getName() + " with "	+ goalsInGame + " goals.";
		return answer;
		// TODO write a unit test
		// TODO handle multiple answers
	}


	/**
	 * This method computes the team with least goals against on
	 * @return the name of the team with the least goals against
	 */
	public String bestDefense() {
		// initialize variables
		double goalsAgainstPerGame = 100.0;
		Team teamWithBestDefense = null;
		String answer;
		double currentGoalsAgainstPerGame = 100.0;
		// loop over teams
		// looping over goals per game and comparing to current min
		for (Team current : teams.values()) {
			currentGoalsAgainstPerGame = (float)current.getTotalGoalsAgainst() 
					/ (float)(current.getTotalLosses() + current.getTotalDraws() + current.getTotalWins());
			if (currentGoalsAgainstPerGame < goalsAgainstPerGame) {
				teamWithBestDefense = current;
				goalsAgainstPerGame = currentGoalsAgainstPerGame;
			}
		}
		// update and return the answer
		answer = "The team with the best defense was " + teamWithBestDefense.getName() + " with "
				+ goalsAgainstPerGame + ".";
		return answer;
		// TODO write unit test
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
