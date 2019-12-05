package worldcuptrivia;

public class OffensiveData {
	// Instance variables
	private int totalAttempts;
	private int totalOnTarget;
	private int totalOffTarget;
	private int totalBlocked;
	private int totalWoodwork;
	private int totalCorners;
	private int totalOffsides;

	// Constructor
	public OffensiveData(int totalAttempts, int totalOnTarget, int totalOffTarget, int totalBlocked, int totalWoodwork,
			int totalCorners, int totalOffsides) {
		this.totalAttempts = totalAttempts;
		this.totalOnTarget = totalOnTarget;
		this.totalOffTarget = totalOffTarget;
		this.totalBlocked = totalBlocked;
		this.totalWoodwork = totalWoodwork;
		this.totalCorners = totalCorners;
		this.totalOffsides = totalOffsides;
	}

	/**
	 * Method for calculating cumulative offensive data
	 * @param data
	 * @return incremented offensive data
	 */
	public OffensiveData merge(OffensiveData data) {
		int attempts = totalAttempts + data.getTotalAttempts();
		int onTarget = totalOnTarget + data.getTotalOnTarget();
		int offTarget = totalOffTarget + data.getTotalOffTarget();
		int blocked = totalBlocked + data.getTotalBlocked();
		int woodwork = totalWoodwork + data.getTotalWoodwork();
		int corners = totalCorners + data.getTotalCorners();
		int offsides = totalOffsides + data.getTotalOffsides();
		return new OffensiveData(attempts, onTarget, offTarget, blocked, woodwork, corners, offsides);
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
