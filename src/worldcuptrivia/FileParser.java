package worldcuptrivia;

import java.io.File;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class FileParser {
	// Instance variables
	private String fileName;
	public HashMap<String, Team> teams;
	public HashMap<Integer, Game> games;

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
			Scanner inputScanner = new Scanner(new File(fileName));
			inputScanner.nextLine(); // Skip first row of column names
			while (inputScanner.hasNextLine()) {
				String[] elements1 = inputScanner.nextLine().split(",");
				String[] elements2 = inputScanner.nextLine().split(",");
				int gameNum = Integer.parseInt(elements1[0]);

				String team1Name = elements1[2];
				int team1GoalsFor = Integer.parseInt(elements1[8]);
				int team1GoalsAgainst = Integer.parseInt(elements1[9]);

				int team1Attempts = Integer.parseInt(elements1[12]);
				int team1OnTarget = Integer.parseInt(elements1[13]);
				int team1OffTarget = Integer.parseInt(elements1[14]);
				int team1Blocked = Integer.parseInt(elements1[15]);
				int team1Woodwork = Integer.parseInt(elements1[16]);
				int team1Corners = Integer.parseInt(elements1[17]);
				int team1Offsides = Integer.parseInt(elements1[18]);

				int team1BallPossession = Integer.parseInt(elements1[19]);

				String team2Name = elements2[2];
			}
		} catch (IOException ex) {
			System.out.println("Error while parsing file!");
			ex.printStackTrace();
		}
	}
}