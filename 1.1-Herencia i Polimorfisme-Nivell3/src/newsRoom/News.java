package newsRoom;

public abstract class News {
	
	private String headline;
	private String text;
	private int rating;
	private int price;
	
	public News(String headline) {
		this.headline = headline;
		text = "";
	}
	
	public abstract double calculateNewPrice();
	
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
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
