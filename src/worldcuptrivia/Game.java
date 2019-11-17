package worldcuptrivia;

public class Game {
	// Instance variables
	private int gameNum;
	private Team team1;
	private Team team2;
	private int team1Score;
	private int team2Score;

	private int totalPasses;
	private int totalPassesCompleted;
	private int totalDistanceCovered; // In km

	private OffensiveData offensiveData;
	private DefensiveData defensiveData;
	private FoulData foulData;

	// Constructor
	public Game(int gameNum, Team team1, Team team2, int team1Score, int team2Score, int totalPasses,
			int totalPassesCompleted, int totalDistanceCovered, OffensiveData offensiveData,
			DefensiveData defensiveData, FoulData foulData) {
		this.gameNum = gameNum;
		this.team1 = team1;
		this.team2 = team2;
		this.team1Score = team1Score;
		this.team2Score = team2Score;
		this.totalPasses = totalPasses;
		this.totalPassesCompleted = totalPassesCompleted;
		this.totalDistanceCovered = totalDistanceCovered;
		this.offensiveData = offensiveData;
		this.defensiveData = defensiveData;
		this.foulData = foulData;
	}

	public int getGameNum() {
		return gameNum;
	}

	public void setGameNum(int gameNum) {
		this.gameNum = gameNum;
	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public int getTeam1Score() {
		return team1Score;
	}

	public void setTeam1Score(int team1Score) {
		this.team1Score = team1Score;
	}

	public int getTeam2Score() {
		return team2Score;
	}

	public void setTeam2Score(int team2Score) {
		this.team2Score = team2Score;
	}

	public int getTotalPasses() {
		return totalPasses;
	}

	public void setTotalPasses(int totalPasses) {
		this.totalPasses = totalPasses;
	}

	public int getTotalPassesCompleted() {
		return totalPassesCompleted;
	}

	public void setTotalPassesCompleted(int totalPassesCompleted) {
		this.totalPassesCompleted = totalPassesCompleted;
	}

	public int getTotalDistanceCovered() {
		return totalDistanceCovered;
	}

	public void setTotalDistanceCovered(int totalDistanceCovered) {
		this.totalDistanceCovered = totalDistanceCovered;
	}

	public OffensiveData getOffensiveData() {
		return offensiveData;
	}

	public void setOffensiveData(OffensiveData offensiveData) {
		this.offensiveData = offensiveData;
	}

	public DefensiveData getDefensiveData() {
		return defensiveData;
	}

	public void setDefensiveData(DefensiveData defensiveData) {
		this.defensiveData = defensiveData;
	}

	public FoulData getFoulData() {
		return foulData;
	}

	public void setFoulData(FoulData foulData) {
		this.foulData = foulData;
	}
}
