package car;

public class Main {

	public static void main(String[] args) {
		Car newCar = new Car("C5");
		
		System.out.println("Brand: " + Car.brand);
		System.out.println("Horse Power: " + newCar.horsePower);
		newCar.speedUp();
		Car.slowDown();
	}

}
