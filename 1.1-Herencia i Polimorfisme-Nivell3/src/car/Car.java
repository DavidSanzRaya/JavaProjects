package car;

public class Car {
	static final String brand = "Corvette";
	private static String model;
	final int horsePower = 300;
	
	public Car(String model) {
		Car.setModel(model);
	}
	
	static void slowDown() {
		System.out.println("Car is slowing down");
	}
	
	void speedUp() {
		System.out.println("Car is speeding up");
	}

	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Car.model = model;
	}
}
