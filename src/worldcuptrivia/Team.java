package worldcuptrivia;

public class Team {
	private String name;

	private int totalWins;
	private int totalDraws;
	private int totalLosses;

	private int totalGoalsFor;
	private int totalGoalsAgainst;

	private int totalBallPossession; // total percentage, should be divided by total num games to get true average
	private int totalPasses;
	private int totalPassesCompleted;
	private int totalDistanceCovered; // in km

	private OffensiveData offensiveData;
	private DefensiveData defensiveData;
	private FoulData foulData;

	public Team(String name, int totalWins, int totalDraws, int totalLosses, int totalGoalsFor, int totalGoalsAgainst,
			int totalBallPossession, int totalPasses, int totalPassesCompleted, int totalDistanceCovered,
			OffensiveData offensiveData, DefensiveData defensiveData, FoulData foulData) {
		this.name = name;
		this.totalWins = totalWins;
		this.totalDraws = totalDraws;
		this.totalLosses = totalLosses;
		this.totalGoalsFor = totalGoalsFor;
		this.totalGoalsAgainst = totalGoalsAgainst;
		this.totalBallPossession = totalBallPossession;
		this.totalPasses = totalPasses;
		this.totalPassesCompleted = totalPassesCompleted;
		this.totalDistanceCovered = totalDistanceCovered;
		this.offensiveData = offensiveData;
		this.defensiveData = defensiveData;
		this.foulData = foulData;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalWins() {
		return totalWins;
	}

	public void setTotalWins(int totalWins) {
		this.totalWins = totalWins;
	}

	public int getTotalDraws() {
		return totalDraws;
	}

	public void setTotalDraws(int totalDraws) {
		this.totalDraws = totalDraws;
	}

	public int getTotalLosses() {
		return totalLosses;
	}

	public void setTotalLosses(int totalLosses) {
		this.totalLosses = totalLosses;
	}

	public int getTotalGoalsFor() {
		return totalGoalsFor;
	}

	public void setTotalGoalsFor(int totalGoalsFor) {
		this.totalGoalsFor = totalGoalsFor;
	}

	public int getTotalGoalsAgainst() {
		return totalGoalsAgainst;
	}

	public void setTotalGoalsAgainst(int totalGoalsAgainst) {
		this.totalGoalsAgainst = totalGoalsAgainst;
	}

	public int getTotalBallPossession() {
		return totalBallPossession;
	}

	public void setTotalBallPossession(int totalBallPossession) {
		this.totalBallPossession = totalBallPossession;
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