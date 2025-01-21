package newsRoom;

import java.util.*;

public class Newsroom {
	private List<Editor> editors;
	
	public void addEditor(Editor editor) {
		editors.add(editor);
	}
	
	public void removeEditor(Editor editor) {
		
	}
	
	public void addNewsToEditor(News news, Editor editor) {
		
	}
	
	public void removeNewsFromEditor(News news, Editor editor) {
		
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
