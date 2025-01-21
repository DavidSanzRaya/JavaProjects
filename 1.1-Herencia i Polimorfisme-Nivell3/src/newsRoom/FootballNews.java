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
	protected void calculateScore() {
		int score = getInitialScore();
		if (competition.equalsIgnoreCase("Champions League")) score += 3;
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) score += 1;
		if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) score += 1;
		setScore(score);
	}
	
	@Override
	protected void calculatePrice() {
		double price = getInitialPrice();
        if (competition.equalsIgnoreCase("Champions League")) price += 100;
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) price += 100;
        if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) price += 50;
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

	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
}
