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
		data = new FileParser("https://gitlab.com/djh_or/2018-world-cup-stats/raw/master/world_cup_2018_stats.csv");
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
	 * @return string listing the game(s) with the most goals
	 */
	public String gameWithMostGoals() {
		// initialize the method
		ArrayList<Game> gameWithMostGoals = new ArrayList<Game>();
		int theMostGoals = 0;
		String answer = "";

		// loop through games and fill ArrayList with those that had the most goals
		for (Game current : games.values()) {
			if (current.getTeam1Score() + current.getTeam2Score() > theMostGoals) {
				gameWithMostGoals.clear();
				gameWithMostGoals.add(current);
				theMostGoals = current.getTeam1Score() + current.getTeam2Score();
			} else if (current.getTeam1Score() + current.getTeam2Score() == theMostGoals) {
				gameWithMostGoals.add(current);
			}
		}

		// returns string with answer depending on if one or multiple games
		if (gameWithMostGoals.size() > 1) {
			StringBuilder builder = new StringBuilder();
			builder.append("The games with the most goals were:");
			for (int i = 0; i < gameWithMostGoals.size(); i++) {
				if (gameWithMostGoals.size() > 1 && i == gameWithMostGoals.size() - 1) {
					builder.append("\n" + "and " + gameWithMostGoals.get(i).getTeam1().getName() + " versus "
							+ gameWithMostGoals.get(i).getTeam2().getName() + ".");
				} else {
					builder.append("\n" + gameWithMostGoals.get(i).getTeam1().getName() + " versus "
							+ gameWithMostGoals.get(i).getTeam2().getName() + ".");
				}
			}
			builder.append("\nThey all had " + theMostGoals + " goals!");
			String multiAnswer = builder.toString();
			return multiAnswer;
		} else {
			answer = "The game with the most goals was: " + gameWithMostGoals.get(0).getTeam1().getName() + " versus "
					+ gameWithMostGoals.get(0).getTeam2().getName() + ". It had " + theMostGoals + " goals!";
			return answer;
		}
	}

	/**
	 * This method computes the team with least goals against on
	 * 
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
			currentGoalsAgainstPerGame = (float) current.getTotalGoalsAgainst()
					/ (float) (current.getTotalLosses() + current.getTotalDraws() + current.getTotalWins());
			if (currentGoalsAgainstPerGame < goalsAgainstPerGame) {
				teamWithBestDefense = current;
				goalsAgainstPerGame = currentGoalsAgainstPerGame;
			}
		}
		// update and return the answer
		answer = "The team with the best defense was " + teamWithBestDefense.getName() + " with " + goalsAgainstPerGame
				+ " goals conceded per game.";
		return answer;
	}

	/**
	 * This method computes team you should see if you want to see woodwork
	 * 
	 * @param someGames an ArrayList of Games objects
	 * @return the team name
	 */
	public String mostWoodWork() {
		// Initialize the method
		ArrayList<Team> teamsWithMostWoodwork = new ArrayList<Team>();
		int theMostWoodwork = 0;
		String answer = "";

		// Loop through teams and fill ArrayList with those that had the most shots
		// hitting woodwork
		for (Team current : teams.values()) {
			if (current.getOffensiveData().getTotalWoodwork() > theMostWoodwork) {
				teamsWithMostWoodwork.clear();
				teamsWithMostWoodwork.add(current);
				theMostWoodwork = current.getOffensiveData().getTotalWoodwork();
			} else if (current.getOffensiveData().getTotalWoodwork() == theMostWoodwork) {
				teamsWithMostWoodwork.add(current);
			}
		}

		// Returns string with answer depending on if one or multiple teams
		if (teamsWithMostWoodwork.size() > 1) {
			StringBuilder builder = new StringBuilder();
			builder.append("The teams with the most shots hitting woodwork were:");
			for (int i = 0; i < teamsWithMostWoodwork.size(); i++) {
				if (teamsWithMostWoodwork.size() > 1 && i == teamsWithMostWoodwork.size() - 1) {
					builder.append("\n" + "and " + teamsWithMostWoodwork.get(i).getName() + ".");
				} else {
					builder.append("\n" + teamsWithMostWoodwork.get(i).getName() + ".");
				}
			}
			builder.append("\nThey all had " + theMostWoodwork + " shots that hit woodwork!");
			String multiAnswer = builder.toString();
			return multiAnswer;
		} else {
			answer = "The team with the most shots hitting woodwork was: " + teamsWithMostWoodwork.get(0).getName()
					+ ". They had " + theMostWoodwork + " shots that hit woodwork!";
			return answer;
		}
	}

	/**
	 * This method computes team you should see if you want to see red cards
	 * 
	 * @return the team name
	 */
	public String mostViolent() {
		// Initialize the method
		ArrayList<Team> teamsWithMostRedCards = new ArrayList<Team>();
		int theMostRedCards = 0;
		String answer = "";

		// Loop through teams and fill ArrayList with those that had the most red cards
		for (Team current : teams.values()) {
			if (current.getFoulData().getTotalRedCards() > theMostRedCards) {
				teamsWithMostRedCards.clear();
				teamsWithMostRedCards.add(current);
				theMostRedCards = current.getFoulData().getTotalRedCards();
			} else if (current.getFoulData().getTotalRedCards() == theMostRedCards) {
				teamsWithMostRedCards.add(current);
			}
		}

		// Returns string with answer depending on if one or multiple teams
		if (teamsWithMostRedCards.size() > 1) {
			StringBuilder builder = new StringBuilder();
			builder.append("The teams with the most red cards were:");
			for (int i = 0; i < teamsWithMostRedCards.size(); i++) {
				if (teamsWithMostRedCards.size() > 1 && i == teamsWithMostRedCards.size() - 1) {
					builder.append("\n" + "and " + teamsWithMostRedCards.get(i).getName() + ".");
				} else {
					builder.append("\n" + teamsWithMostRedCards.get(i).getName() + ".");
				}
			}
			if (theMostRedCards == 1) {
				builder.append("\nThey all had " + theMostRedCards + " red card.");
			} else if (theMostRedCards > 1) {
				builder.append("\nThey all had " + theMostRedCards + " red cards.");
			}
			String multiAnswer = builder.toString();
			return multiAnswer;
		} else {
			if (theMostRedCards == 1) {
				answer = "The team with the most red cards was: " + teamsWithMostRedCards.get(0).getName()
						+ ". They had " + theMostRedCards + " red card.";
			} else if (theMostRedCards > 1) {
				answer = "The team with the most red cards was: " + teamsWithMostRedCards.get(0).getName()
						+ ". They had " + theMostRedCards + " red cards.";
			}
			return answer;
		}
	}
}