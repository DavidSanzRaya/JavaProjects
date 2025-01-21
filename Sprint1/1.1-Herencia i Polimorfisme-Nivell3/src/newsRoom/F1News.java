package newsRoom;

public class F1News extends News {
	
	private String team;

	public F1News(String headline, String team) {
		super(headline, NewsType.F1);
		this.team = team;
	}
	
	@Override
	public void calculateScore() {
		int score = getInitialScore();
		if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")) score += 2;
        setScore(score);
	}
	
	@Override
	public void calculatePrice() {
		double price = getInitialPrice();
		if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")) price += 50;
        setPrice(price);
	}

	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

}
