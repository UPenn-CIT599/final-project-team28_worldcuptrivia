package worldcuptrivia;

public class FoulData {
	// Instance variables
	private int totalYellowCards;
	private int totalRedCards;
	private int totalSecondYellowCards;
	private int totalFouls;

	// Constructor
	public FoulData(int totalYellowCards, int totalRedCards, int totalSecondYellowCards, int totalFouls) {
		this.totalYellowCards = totalYellowCards;
		this.totalRedCards = totalRedCards;
		this.totalSecondYellowCards = totalSecondYellowCards;
		this.totalFouls = totalFouls;
	}

	/**
	 * Method for calculating cumulative foul data
	 * 
	 * @param data
	 * @return
	 */
	public FoulData merge(FoulData data) {
		int yellowCards = totalYellowCards + data.getTotalYellowCards();
		int redCards = totalRedCards + data.getTotalRedCards();
		int secondYellowCards = totalSecondYellowCards + data.getTotalSecondYellowCards();
		int fouls = totalFouls + data.getTotalFouls();
		return new FoulData(yellowCards, redCards, secondYellowCards, fouls);
	}

	public int getTotalYellowCards() {
		return totalYellowCards;
	}

	public void setTotalYellowCards(int totalYellowCards) {
		this.totalYellowCards = totalYellowCards;
	}

	public int getTotalRedCards() {
		return totalRedCards;
	}

	public void setTotalRedCards(int totalRedCards) {
		this.totalRedCards = totalRedCards;
	}

	public int getTotalSecondYellowCards() {
		return totalSecondYellowCards;
	}

	public void setTotalSecondYellowCards(int totalSecondYellowCards) {
		this.totalSecondYellowCards = totalSecondYellowCards;
	}

	public int getTotalFouls() {
		return totalFouls;
	}

	public void setTotalFouls(int totalFouls) {
		this.totalFouls = totalFouls;
	}
}