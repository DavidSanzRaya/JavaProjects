package newsRoom;

import java.util.*;

public class Newsroom {
	private List<Editor> editors;
	
	public void addEditor(Editor editor) {
		editors.add(editor);
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
