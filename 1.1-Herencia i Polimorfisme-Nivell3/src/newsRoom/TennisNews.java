package newsRoom;

public class TennisNews extends News {
	
	private String competition;
	private String[] tennisPlayers = new String[2];
	
	public TennisNews(String headline, String competition) {
		super(headline, NewsType.TENNIS);
		this.competition = competition;
	}
	
	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
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

	public String[] getTennisPlayers() {
		return tennisPlayers;
	}
	public void setTennisPlayers(String[] tennisPlayers) {
		this.tennisPlayers = tennisPlayers;
	}
	
	
}
