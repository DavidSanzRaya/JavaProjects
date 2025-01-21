package phone;

public class SmartPhone extends Phone implements ICamera, IClock {

	public SmartPhone(String brand, String model) {
		super(brand, model);
	}

	@Override
	public void alarm() {
		System.out.println("Alarm is ringing");
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking a photo");
	}

}
