package newsRoom;

public class BasketNews extends News {
	
	private String competition;
	private String club;
	
	public BasketNews(String headline, String competition, String club) {
		super(headline, NewsType.BASKETBALL);
		this.competition = competition;
		this.club = club;
	}
	
	@Override
	public void calculateScore() {
		int score = getInitialScore();
		if (competition.equalsIgnoreCase("EuroLeague")) score += 3;
		if (competition.equalsIgnoreCase("ACB")) score += 2;
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) score += 1;
		setScore(score);
	}
	
	@Override
	public void calculatePrice() {
		double price = getInitialPrice();
        if (competition.equalsIgnoreCase("EuroLeague")) price += 75;
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) price += 75;
        setPrice(price);
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
