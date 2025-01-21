package phone;

public class Phone {
	String brand;
	String model;
	
	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	void call(String phoneNumber) {
		System.out.println("Calling " + phoneNumber);
	}
}
