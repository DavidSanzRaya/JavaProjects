package newsRoom;

public class MotorcyclingNews extends News {
	
	private String team;
	
	public MotorcyclingNews(String headline, String team) {
		super(headline);
		this.team = team;
	}
	
	@Override
	public double calculateNewPrice() {
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
