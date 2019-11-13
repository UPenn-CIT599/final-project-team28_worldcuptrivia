package worldcuptrivia;

public class DefensiveData {
	// instance variables
	private int totalBallsRecovered;
	private int totalTackles;
	private int totalBlocks;
	private int totalClearances;

	// constructor
	public DefensiveData(int totalBallsRecovered, int totalTackles, int totalBlocks, int totalClearances) {
		this.totalBallsRecovered = totalBallsRecovered;
		this.totalTackles = totalTackles;
		this.totalBlocks = totalBlocks;
		this.totalClearances = totalClearances;
	}

	public int getTotalBallsRecovered() {
		return totalBallsRecovered;
	}

	public void setTotalBallsRecovered(int totalBallsRecovered) {
		this.totalBallsRecovered = totalBallsRecovered;
	}

	public int getTotalTackles() {
		return totalTackles;
	}

	public void setTotalTackles(int totalTackles) {
		this.totalTackles = totalTackles;
	}

	public int getTotalBlocks() {
		return totalBlocks;
	}

	public void setTotalBlocks(int totalBlocks) {
		this.totalBlocks = totalBlocks;
	}

	public int getTotalClearances() {
		return totalClearances;
	}

	public void setTotalClearances(int totalClearances) {
		this.totalClearances = totalClearances;
	}
}
