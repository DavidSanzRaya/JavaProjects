package newsRoom;

public class BasketNews extends News {
	
	private String competition;
	private String club;
	
	public BasketNews(String headline, String competition, String club) {
		super(headline);
		this.competition = competition;
		this.club = club;
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

	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
}
