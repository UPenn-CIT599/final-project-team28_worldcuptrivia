package worldcuptrivia;

public class TestRunner {

	/**
	 * This is simply a debug/test class
	 * @param args
	 */
	public static void main(String[] args) {
		FileParser fp = new FileParser(
				"https://cit591-public.s3.amazonaws.com/MatchStats.csv");
		System.out.println(fp.getGames().get(1).getTeam1().getName());
		System.out.println(fp.getGames().get(1).getTeam1().getTotalGoalsFor());
		System.out.println(fp.getGames().get(1).getTeam1Score());
		System.out.println(fp.getGames().get(1).getTeam2().getName());
		System.out.println(fp.getGames().get(1).getTeam2Score());
		System.out.println(fp.getGames().get(14).getTeam1().getName());
		System.out.println(fp.getGames().get(14).getTeam1Score());
		System.out.println(fp.getGames().get(14).getTeam2().getName());
		System.out.println(fp.getGames().get(14).getTeam2().getTotalGoalsFor());
		System.out.println(fp.getGames().get(14).getTeam2Score());
		SoccerAnalysis sa = new SoccerAnalysis();
		System.out.println(sa.games.get(2).getTeam1().getName());
		System.out.println(sa.games.get(2).getTeam1().getTotalGoalsFor());
		System.out.println(sa.games.get(2).getTeam1Score());
		System.out.println(sa.games.get(2).getTeam2().getName());
		System.out.println(sa.games.get(2).getTeam2Score());
		System.out.println(sa.games.get(15).getTeam1().getName());
		System.out.println(sa.games.get(15).getTeam1Score());
		System.out.println(sa.games.get(15).getTeam2().getName());
		System.out.println(sa.games.get(15).getTeam2().getTotalGoalsFor());
		System.out.println(sa.games.get(15).getTeam2Score());
		System.out.println(sa.teamWithMostGoals());
		System.out.println(sa.gameWithMostGoals());
		System.out.println(sa.bestDefense());
		System.out.println(sa.mostViolent());
		System.out.println(sa.mostWoodWork());
//		for (Team current : sa.teams.values()){
//			System.out.println(current.getName() + " goals against: " + current.getTotalGoalsAgainst());
//			System.out.println(current.getName() + " wins: " + current.getTotalWins());
//			System.out.println(current.getName() + " draws: " + current.getTotalDraws());
//			System.out.println(current.getName() + " losses: " + current.getTotalLosses());
//		}

	}

}
