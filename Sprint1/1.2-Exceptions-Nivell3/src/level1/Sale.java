package level1;

import java.util.*;

public class Sale {
	private List<Product> products =  new ArrayList<Product>();
	private double totalPrice = 0.0;
	
	public void calculateTotal() throws EmptySaleException {
		if(products.isEmpty())
			throw new EmptySaleException("In order to sale, you have to add products");
		
		for(Product product : products) {
			totalPrice += product.getPrice();
		}
	}
	
	public void calculateTotal(boolean createException) throws IndexOutOfBoundsException, EmptySaleException {
		if(!createException)
			calculateTotal();
		
		for(int i = 0; i <= products.size(); i++) {
			totalPrice += products.get(i).getPrice();
		}
	}
	
	public List<Product> getProducts() {
		return products;
	}
	public void addProduct(Product product) {
		products.add(product);
	}
	public void addProducts(List<Product> products) {
		products.addAll(products);
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
}
