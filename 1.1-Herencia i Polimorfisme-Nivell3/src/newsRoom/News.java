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
        calculateScore();
        calculatePrice();
	}
	
	protected abstract void calculateScore();
	protected abstract void calculatePrice();
//	protected abstract boolean checkSpecialConditions();
	
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

	public int getInitialScore() {
        return type.getInitialScore();
    }

    public double getInitialPrice() {
        return type.getInitialPrice();
    }

}
