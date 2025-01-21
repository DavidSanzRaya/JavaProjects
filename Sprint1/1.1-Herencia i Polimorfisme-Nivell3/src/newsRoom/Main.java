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
		
	}

	public static void removeEditor() {
		
	}
	
	public static void addNewsToEditor() {
		
	}
	
	public static void removeNewsFromEditor() {
		
	}
	
	public static void showNewsFromEditor() {
		
	}
	
	public static void getNewsScore() {
		
	}
	
	public static void getNewsPrice() {
		
	}
}
