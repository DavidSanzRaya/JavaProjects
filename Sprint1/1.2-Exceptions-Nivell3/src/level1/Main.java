package level1;

public class Main {
	
	public static final String RESET = "\033[0m";  // Normal
	public static final String RED = "\033[0;31m";  // Red

	public static void main(String[] args) {
		Sale sale = new Sale();
		
		try {
			
			System.out.println("Attempting to calculate total price without any product...");
			sale.calculateTotal();
			
		}catch(Exception e){
			System.out.println(RED + e.getClass().getName() + ": " + e.getMessage() + RESET);
		}
		
		try {
			
			System.out.println("\nAdding products...");
			Product product1 = new Product("Chair", 20.35);
			Product product2 = new Product("Lantern", 1.99);
			Product product3 = new Product("Suitcase", 15.50);
			
			sale.addProduct(product1);
			sale.addProduct(product2);
			sale.addProduct(product3);
			
			System.out.println("Attempting to calculate total price with products added...");
			
			sale.calculateTotal();
			System.out.println("Total price: " + sale.getTotalPrice());
			
			System.out.println("\nAttempting to create an IndexOutOfBoundsException...");
			sale.calculateTotal(true);
			
		} catch(Exception e){
			System.out.println(RED + e.getClass().getName() + ": " + e.getMessage() + RESET);
		}
	}

}
