package newsRoom;

public class MotorcyclingNews extends News {
	
	private String team;
	
	public MotorcyclingNews(String headline, String team) {
		super(headline, NewsType.MOTORCYCLING);
		this.team = team;
	}
	
	@Override
	public void calculatePrice() {
		int score = getInitialScore();
		if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) score += 3;
        setScore(score);
	}
	
	public void calculateScore() {
		double price = getInitialPrice();
		if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) price += 50;
        setPrice(price);
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}
