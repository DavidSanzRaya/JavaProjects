package newsRoom;

public class F1News extends News {
	
	private String team;

	public F1News(String headline, String team) {
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
