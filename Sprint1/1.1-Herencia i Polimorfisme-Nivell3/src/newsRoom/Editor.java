package newsRoom;

import java.util.List;

public class Editor {
	private String name;
	private final String DNI;
	private static double salary = 1500.0;
	private List<News> newsList;
	
	public Editor(String name, String DNI) {
		this.name = name;
		this.DNI = DNI;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public static double getSalary() {
		return salary;
	}
	public static void setSalary(double salary) {
		Editor.salary = salary;
	}
	
	public List<News> getNewsList() {
		return newsList;
	}
	public void addNews(News news) {
		newsList.add(news);
	}
	public void removeNews(String headline, NewsType type) {
		newsList.removeIf(news -> news.getHeadline().equalsIgnoreCase(headline) && news.getType() == type);
	}
}
