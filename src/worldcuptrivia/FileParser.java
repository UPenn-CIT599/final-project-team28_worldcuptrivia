package worldcuptrivia;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

public class FileParser {
	// Instance variables
	private String fileName;
	private HashMap<String, Team> teams;
	private HashMap<Integer, Game> games;

	// Constructor
	public FileParser(String fileName) {
		this.fileName = fileName;
		teams = new HashMap<String, Team>();
		games = new HashMap<Integer, Game>();
		run();
	}

	/**
	 * Parses data set and creates corresponding objects.
	 */
	private void run() {
		try {
			Scanner inputScanner = new Scanner(new URL(fileName).openStream());
			inputScanner.nextLine(); // Skip first row of column names
			while (inputScanner.hasNextLine()) {
				String[] elements1 = inputScanner.nextLine().split(",");
				String[] elements2 = inputScanner.nextLine().split(",");

				// Team 1 offensive data
				int team1Attempts = Integer.parseInt(elements1[12]);
				int team1OnTarget = Integer.parseInt(elements1[13]);
				int team1OffTarget = Integer.parseInt(elements1[14]);
				int team1Blocked = Integer.parseInt(elements1[15]);
				int team1Woodwork = Integer.parseInt(elements1[16]);
				int team1Corners = Integer.parseInt(elements1[17]);
				int team1Offsides = Integer.parseInt(elements1[18]);
				OffensiveData team1OffensiveData = new OffensiveData(team1Attempts, team1OnTarget, team1OffTarget,
						team1Blocked, team1Woodwork, team1Corners, team1Offsides);

				// Team 1 defensive data
				int team1BallsRecovered = Integer.parseInt(elements1[24]);
				int team1Tackles = Integer.parseInt(elements1[25]);
				int team1Blocks = Integer.parseInt(elements1[26]);
				int team1Clearances = Integer.parseInt(elements1[27]);
				DefensiveData team1DefensiveData = new DefensiveData(team1BallsRecovered, team1Tackles, team1Blocks,
						team1Clearances);

				// Team 1 foul data
				int team1YellowCards = Integer.parseInt(elements1[28]);
				int team1RedCards = Integer.parseInt(elements1[29]);
				int team1SecondYellowCards = Integer.parseInt(elements1[30]);
				int team1Fouls = Integer.parseInt(elements1[31]);
				FoulData team1FoulData = new FoulData(team1YellowCards, team1RedCards, team1SecondYellowCards,
						team1Fouls);

				// Team 1 other data
				String team1Name = elements1[2];
				char team1GameResult = elements1[6].charAt(0);
				int team1GoalsFor = Integer.parseInt(elements1[8]);
				int team1GoalsAgainst = Integer.parseInt(elements1[9]);
				int team1BallPossession = Integer.parseInt(elements1[19]);
				int team1Passes = Integer.parseInt(elements1[21]);
				int team1PassesCompleted = Integer.parseInt(elements1[22]);
				int team1DistanceCovered = Integer.parseInt(elements1[23]);

				Team team1 = addTeam(team1Name, team1GameResult, team1GoalsFor, team1GoalsAgainst, team1BallPossession,
						team1Passes, team1PassesCompleted, team1DistanceCovered, team1OffensiveData, team1DefensiveData,
						team1FoulData);

				// Team 2 offensive data
				int team2Attempts = Integer.parseInt(elements2[12]);
				int team2OnTarget = Integer.parseInt(elements2[13]);
				int team2OffTarget = Integer.parseInt(elements2[14]);
				int team2Blocked = Integer.parseInt(elements2[15]);
				int team2Woodwork = Integer.parseInt(elements2[16]);
				int team2Corners = Integer.parseInt(elements2[17]);
				int team2Offsides = Integer.parseInt(elements2[18]);
				OffensiveData team2OffensiveData = new OffensiveData(team2Attempts, team2OnTarget, team2OffTarget,
						team2Blocked, team2Woodwork, team2Corners, team2Offsides);

				// Team 2 defensive data
				int team2BallsRecovered = Integer.parseInt(elements2[24]);
				int team2Tackles = Integer.parseInt(elements2[25]);
				int team2Blocks = Integer.parseInt(elements2[26]);
				int team2Clearances = Integer.parseInt(elements2[27]);
				DefensiveData team2DefensiveData = new DefensiveData(team2BallsRecovered, team2Tackles, team2Blocks,
						team2Clearances);

				// Team 2 foul data
				int team2YellowCards = Integer.parseInt(elements2[28]);
				int team2RedCards = Integer.parseInt(elements2[29]);
				int team2SecondYellowCards = Integer.parseInt(elements2[30]);
				int team2Fouls = Integer.parseInt(elements2[31]);
				FoulData team2FoulData = new FoulData(team2YellowCards, team2RedCards, team2SecondYellowCards,
						team2Fouls);

				// Team 2 other data
				String team2Name = elements2[2];
				char team2GameResult = elements2[6].charAt(0);
				int team2GoalsFor = Integer.parseInt(elements2[8]);
				int team2GoalsAgainst = Integer.parseInt(elements2[9]);
				int team2BallPossession = Integer.parseInt(elements2[19]);
				int team2Passes = Integer.parseInt(elements2[21]);
				int team2PassesCompleted = Integer.parseInt(elements2[22]);
				int team2DistanceCovered = Integer.parseInt(elements2[23]);

				Team team2 = addTeam(team2Name, team2GameResult, team2GoalsFor, team2GoalsAgainst, team2BallPossession,
						team2Passes, team2PassesCompleted, team2DistanceCovered, team2OffensiveData, team2DefensiveData,
						team2FoulData);

				int gameNum = Integer.parseInt(elements1[0]);
				int team1Score = team1GoalsFor;
				int team2Score = team2GoalsFor;
				int totalPasses = team1Passes + team2Passes;
				int totalPassesCompleted = team1PassesCompleted + team2PassesCompleted;
				int totalDistanceCovered = team1DistanceCovered + team2DistanceCovered;
				OffensiveData gameOffensiveData = team1OffensiveData.merge(team2OffensiveData);
				DefensiveData gameDefensiveData = team1DefensiveData.merge(team2DefensiveData);
				FoulData gameFoulData = team1FoulData.merge(team2FoulData);

				Game game = new Game(gameNum, team1, team2, team1Score, team2Score, totalPasses, totalPassesCompleted,
						totalDistanceCovered, gameOffensiveData, gameDefensiveData, gameFoulData);
				games.put(gameNum, game);
			}
			inputScanner.close();
		} catch (IOException ex) {
			System.out.println("Error while parsing file!");
			ex.printStackTrace();
		}
	}

	/**
	 * Method for adding teams to HashMap based on parsed data
	 * 
	 * @param name
	 * @param gameResult
	 * @param goalsFor
	 * @param goalsAgainst
	 * @param ballPossession
	 * @param passes
	 * @param passesCompleted
	 * @param distanceCovered
	 * @param offensiveData
	 * @param defensiveData
	 * @param foulData
	 * @return
	 */
	private Team addTeam(String name, char gameResult, int goalsFor, int goalsAgainst, int ballPossession, int passes,
			int passesCompleted, int distanceCovered, OffensiveData offensiveData, DefensiveData defensiveData,
			FoulData foulData) {
		Team team = teams.get(name);
		if (team == null) // If the team is new, create it and put it in the HashMap
		{
			team = new Team(name, gameResult, goalsFor, goalsAgainst, ballPossession, passes, passesCompleted,
					distanceCovered, offensiveData, defensiveData, foulData);
			teams.put(name, team);
		} else // If the team already exists, merge and add all new data into it
		{
			team.addGameResult(gameResult);
			team.addGoalsFor(goalsFor);
			team.addGoalsAgainst(goalsAgainst);
			team.addBallPossession(ballPossession);
			team.addPasses(passes);
			team.addPassesCompleted(passesCompleted);
			team.addDistanceCovered(distanceCovered);
			team.addOffensiveData(offensiveData);
			team.addDefensiveData(defensiveData);
			team.addFoulData(foulData);
		}
		return team;
	}

	public HashMap<String, Team> getTeams() {
		return teams;
	}

	public HashMap<Integer, Game> getGames() {
		return games;
	}
}