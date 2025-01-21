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
	
	protected abstract void calculateScore();
	protected abstract void calculatePrice();
	
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
		if(score == 0)
			calculateScore();
		
		return score;
	}
	public void setScore(int rating) {
		this.score = rating;
	}

	public double getPrice() {
		if(price == 0.0)
			calculatePrice();
		
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getInitialScore() {
        return type.getInitialScore();
    }

    public double getInitialPrice() {
        return type.getInitialPrice();
    }

	public NewsType getType() {
		return type;
	}
	
}
