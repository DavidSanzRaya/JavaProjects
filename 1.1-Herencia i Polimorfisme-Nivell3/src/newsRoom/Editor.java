package newsRoom;

import java.util.List;

public class Editor {
	private String name;
	private final String DNI;
	private static double salary = 1500.0;
	private List<News> news;
	
	public Editor(String name, String DNI) {
		this.name = name;
		this.DNI = DNI;
	}

	public Editor(String name, String DNI, List<News> news) {
		this.name = name;
		this.DNI = DNI;
		this.news = news;
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
	
	public List<News> getNews() {
		return news;
	}
	public void setNews(List<News> news) {
		this.news = news;
	}
}
