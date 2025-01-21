package newsRoom;

import java.util.*;

public class Newsroom {
	private List<Editor> editors;
	private List<News> newsList;
	
	public Newsroom() {
		editors = new ArrayList<Editor>();
		newsList = new ArrayList<News>();
	}
	
	public void addEditor(Editor editor) {
		editors.add(editor);
	}
	
	public void addNews(News news) {
		newsList.add(news);
	}
	
	public void removeEditorByDNI(String dni) {
		editors.removeIf(editor -> editor.getDNI().equals(dni));
	}
	
	public Editor findEditorByDNI(String dni) {
		return editors.stream()
				.filter(editor -> editor.getDNI().equalsIgnoreCase(dni))
				.findFirst()
				.orElse(null);
	}
	
	public News findNews(String headline, NewsType type) {
		return newsList.stream()
				.filter(news -> news.getHeadline().equalsIgnoreCase(headline) && news.getType() == type)
				.findFirst()
				.orElse(null);
	}
	
	public List<News> getNewsByEditor() {
		return null;
	}
	
	public int getNewsScore(News news) {
		return news.getScore();
	}
	
	public double getNewsPrice(News news) {
		return news.getPrice();
	}
}
