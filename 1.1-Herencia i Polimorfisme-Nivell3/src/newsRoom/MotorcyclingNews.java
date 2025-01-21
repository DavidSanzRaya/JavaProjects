package newsRoom;

public class MotorcyclingNews extends News {
	
	private String team;
	
	public MotorcyclingNews(String headline, String team) {
		super(headline, NewsType.MOTORCYCLING);
		this.team = team;
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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}
