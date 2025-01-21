package newsRoom;

public class TennisNews extends News {
	
	private String competition;
	private String tennisPlayer1;
	private String tennisPlayer2;
	
	public TennisNews(String headline, String competition, String tennisPlayer1, String tennisPlayer2) {
		super(headline, NewsType.TENNIS);
		this.competition = competition;
		this.tennisPlayer1 = tennisPlayer1;
		this.tennisPlayer2 = tennisPlayer2;
	}
	
	@Override
	public void calculateScore() {
		int score = getInitialScore();
		if (tennisPlayer1.equalsIgnoreCase("Federer") || tennisPlayer1.equalsIgnoreCase("Nadal") || tennisPlayer1.equalsIgnoreCase("Djokovic")
				|| tennisPlayer2.equalsIgnoreCase("Federer") || tennisPlayer2.equalsIgnoreCase("Nadal") || tennisPlayer2.equalsIgnoreCase("Djokovic")) score += 3;
        setScore(score);
	}
	
	@Override
	public void calculatePrice() {
		double price = getInitialPrice();
		if (tennisPlayer1.equalsIgnoreCase("Federer") || tennisPlayer1.equalsIgnoreCase("Nadal") || tennisPlayer1.equalsIgnoreCase("Djokovic")
				|| tennisPlayer2.equalsIgnoreCase("Federer") || tennisPlayer2.equalsIgnoreCase("Nadal") || tennisPlayer2.equalsIgnoreCase("Djokovic")) price += 100;
        setPrice(price);
	}
	
	public String getCompetition() {
		return competition;
	}
	public void setCompetition(String competition) {
		this.competition = competition;
	}
	
}
