package newsRoom;

public class FootballNews extends News {

	private String competition;
	private String club;
	private String player;
	
	public FootballNews(String headline, String competition, String club, String player) {
		super(headline, NewsType.FOOTBALL);
		this.competition = competition;
		this.club = club;
		this.player = player;
	}
	
	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double calculateScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getCompetition() {
		return competition;
	}
	public void setCompetition(String competition) {
		this.competition = competition;
	}

	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}

	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
}
