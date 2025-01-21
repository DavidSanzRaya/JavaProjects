package newsRoom;

import java.util.Scanner;

public class Main {
	
	private static Newsroom newsroom = new Newsroom();
    private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		displayMenu(scanner);
	}
	
	public static void displayMenu(Scanner scanner) {
		int option;
		
		do {
            System.out.println("\nMenu:");
            System.out.println("1. Add editor");
            System.out.println("2. Remove editor");
            System.out.println("3. Add news to editor");
            System.out.println("4. Remove news from editor");
            System.out.println("5. Show all news from editor");
            System.out.println("6. Get news score");
            System.out.println("7. Get news price");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> addEditor();
                case 2 -> removeEditor();
                case 3 -> addNewsToEditor();
                case 4 -> removeNewsFromEditor();
                case 5 -> showNewsFromEditor();
                case 6 -> getNewsScore();
                case 7 -> getNewsPrice();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option.");
            }
        } while (option != 0);
	}
	
	public static void addEditor() {
		System.out.print("Enter editor name: ");
		String name = scanner.nextLine();
		System.out.print("Enter editor DNI: ");
		String dni = scanner.nextLine();
		newsroom.addEditor(new Editor(name, dni));
		System.out.println("Editor added successfully.");
	}

	public static void removeEditor() {
		System.out.print("Enter editor DNI: ");
		String dni = scanner.nextLine();
		newsroom.removeEditorByDNI(dni);
		System.out.println("Editor removed successfully.");
	}
	
	public static void addNewsToEditor() {
		System.out.print("Enter editor DNI: ");
		String dni = scanner.nextLine();
		Editor editor = newsroom.findEditorByDNI(dni);
		
		if (editor == null) {
            System.out.println("Editor not found.");
            return;
        }
		
		System.out.print("Enter news headline: ");
        String headline = scanner.nextLine();

        int type = displayNewsTypeSelector();
        scanner.nextLine();
        
        News news = null;
        switch (type) {
            case 1 -> {
                System.out.print("Enter competition: ");
                String competition = scanner.nextLine();
                System.out.print("Enter club: ");
                String club = scanner.nextLine();
                System.out.print("Enter player: ");
                String player = scanner.nextLine();
                news = new FootballNews(headline, competition, club, player);
            }
            case 2 -> {
                System.out.print("Enter competition: ");
                String competition = scanner.nextLine();
                System.out.print("Enter club: ");
                String club = scanner.nextLine();
                news = new BasketNews(headline, competition, club);
            }
            case 3 -> {
                System.out.print("Enter competition: ");
                String competition = scanner.nextLine();
                System.out.print("Enter a player name: ");
                String player1 = scanner.nextLine();
                System.out.print("Enter the other player name: ");
                String player2 = scanner.nextLine();
                news = new TennisNews(headline, competition, player1, player2);
            }
            case 4 -> {
                System.out.print("Enter team: ");
                String team = scanner.nextLine();
                news = new F1News(headline, team);
            }
            case 5 -> {
                System.out.print("Enter team: ");
                String team = scanner.nextLine();
                news = new MotorcyclingNews(headline, team);
            }
            default -> System.out.println("Invalid news type.");
        }
        
        if (news != null) {
            editor.addNews(news);
            System.out.println("News added successfully.");
        } else {
        	System.out.println("Not able to add news");
        }
	}
	
	public static void removeNewsFromEditor() {
		Editor editor = askForEditor();

        if (editor == null) {
            System.out.println("Editor not found.");
            return;
        }

        System.out.print("Enter news headline to remove: ");
        String headline = scanner.nextLine();
        editor.removeNews(headline, NewsType.values()[displayNewsTypeSelector() - 1]);
        System.out.println("News removed successfully.");
	}
	
	public static void showNewsFromEditor() {     
        Editor editor = askForEditor();
        
        if (editor == null) {
            System.out.println("Editor not found.");
            return;
        }
        
        System.out.println(editor.getNewsList());
	}
	
	public static void getNewsScore() {
		
	}
	
	public static void getNewsPrice() {
		
	}
	
	private static int displayNewsTypeSelector() {
		System.out.println("Select the type of the news:");
        System.out.println("1. Football");
        System.out.println("2. Basketball");
        System.out.println("3. Tennis");
        System.out.println("4. F1");
        System.out.println("5. Motorcycling");
        
        return scanner.nextInt();
	}
	
	private static Editor askForEditor() {
		System.out.print("Enter editor DNI: ");
        String dni = scanner.nextLine();
        return newsroom.findEditorByDNI(dni);
	}
}
