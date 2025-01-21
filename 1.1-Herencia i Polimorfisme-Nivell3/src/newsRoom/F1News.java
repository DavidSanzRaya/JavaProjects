package newsRoom;

public class F1News extends News {
	
	private String team;

	public F1News(String headline, String team) {
		super(headline, NewsType.F1);
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
