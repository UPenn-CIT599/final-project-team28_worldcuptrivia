package worldcuptrivia;

public class OffensiveData {
	private int totalPenaltyShots;
	private int totalAttempts;
	private int totalOnTarget;
	private int totalOffTarget;
	private int totalBlocked;
	private int totalWoodwork;
	private int totalCorners;
	private int totalOffsides;

	public OffensiveData(int totalPenaltyShots, int totalAttempts, int totalOnTarget, int totalOffTarget,
			int totalBlocked, int totalWoodwork, int totalCorners, int totalOffsides) {
		this.totalPenaltyShots = totalPenaltyShots;
		this.totalAttempts = totalAttempts;
		this.totalOnTarget = totalOnTarget;
		this.totalOffTarget = totalOffTarget;
		this.totalBlocked = totalBlocked;
		this.totalWoodwork = totalWoodwork;
		this.totalCorners = totalCorners;
		this.totalOffsides = totalOffsides;
	}

	public int getTotalPenaltyShots() {
		return totalPenaltyShots;
	}

	public void setTotalPenaltyShots(int totalPenaltyShots) {
		this.totalPenaltyShots = totalPenaltyShots;
	}

	public int getTotalAttempts() {
		return totalAttempts;
	}

	public void setTotalAttempts(int totalAttempts) {
		this.totalAttempts = totalAttempts;
	}

	public int getTotalOnTarget() {
		return totalOnTarget;
	}

	public void setTotalOnTarget(int totalOnTarget) {
		this.totalOnTarget = totalOnTarget;
	}

	public int getTotalOffTarget() {
		return totalOffTarget;
	}

	public void setTotalOffTarget(int totalOffTarget) {
		this.totalOffTarget = totalOffTarget;
	}

	public int getTotalBlocked() {
		return totalBlocked;
	}

	public void setTotalBlocked(int totalBlocked) {
		this.totalBlocked = totalBlocked;
	}

	public int getTotalWoodwork() {
		return totalWoodwork;
	}

	public void setTotalWoodwork(int totalWoodwork) {
		this.totalWoodwork = totalWoodwork;
	}

	public int getTotalCorners() {
		return totalCorners;
	}

	public void setTotalCorners(int totalCorners) {
		this.totalCorners = totalCorners;
	}

	public int getTotalOffsides() {
		return totalOffsides;
	}

	public void setTotalOffsides(int totalOffsides) {
		this.totalOffsides = totalOffsides;
	}
}
