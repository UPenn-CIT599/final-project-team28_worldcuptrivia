/**
This will be the main analysis class
**/

package worldcuptrivia;

public class SoccerAnalysis {

	/**
	 * This method computes the game with the most goals
	 * @param wc a WorldCup object, itself an ArrayList of Games objects
	 * @return the id of the game with the most goals
	 */
	public int gameWithMostGoals(WorldCup wc) {
		int id = 0;
		// create a hashmap for games and total goals
		// loop through all games, add-up goals for and against and add to hashmaps
		// return the game id for the game with max goals
		return id;
		}
	
	/**
	 * This method computes the team with the most goals
	 * @param wc a WorldCup object, itself an ArrayList of Games objects
	 * @return the name of the team with the most goals
	 */
	public String bestOffense(WorldCup wc) {
		String team = null;
		// create a hashmap for teams and total goals
		// loop through all games of a given team, add-up goals for add to hashmaps
		// return the team name for the team with most goals
		return team;
		}
	
	/**
	 * This method computes the team with least goals against
	 * @param wc a WorldCup object, itself an ArrayList of Games objects
	 * @return the name of the team with the least goals against
	 */
	public String bestDefense(WorldCup wc) {
		String team = null;
		// create a hashmap for teams and total goals
		// loop through all games of a given team, add-up goals against add to hashmaps
		// return the team name for the team with least goals
		return team;
		}
	
	/**
	 * This method computes team should should see if you want to see woodwork
	 * @param wc a WorldCup object, itself an ArrayList of Games objects
	 * @return the team name
	 */
	public String mostWoodWork(WorldCup wc) {
		String team = null;
		// create a hashmap for teams and total woodwork
		// loop through all games of a given team, add-up woodwork add to hashmaps
		// return the team name for the team with most wwodwork
		return team;
		}

}
