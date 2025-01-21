package newsRoom;

public abstract class News {
	
	private String headline;
	private String text;
	private int score;
	private double price;
	private final NewsType type;
	
	public News(String headline, NewsType type) {
		this.headline = headline;
		this.type = type;
		this.text = "";
		this.score = 0;
        this.price = 0.0;
	}
	
	public abstract double calculateScore();
	public abstract double calculatePrice();
	
	public String getHeadline() {
		return headline;
	}
	
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int rating) {
		this.score = rating;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public NewsType getType() {
		return type;
	}

}
