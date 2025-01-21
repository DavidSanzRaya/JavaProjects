package newsRoom;

public class TennisNews extends News {
	
	private String competition;
	private String[] tennisPlayers = new String[2];
	
	public TennisNews(String headline, String competition) {
		super(headline);
		this.competition = competition;
	}
	
	@Override
	public double calculateNewPrice() {
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
