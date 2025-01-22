package level1;

import java.util.*;

public class Sale {
	private List<Product> products;
	private double totalPrice;
	
	public void calculateTotal() throws EmptySaleException {
		if(products.isEmpty())
			throw new EmptySaleException("In order to sale, you have to add products");
		
		for(Product product : products) {
			totalPrice += product.getPrice();
		}
	}
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
