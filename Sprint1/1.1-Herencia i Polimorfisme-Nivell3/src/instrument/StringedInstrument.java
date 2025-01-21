package instrument;

public class StringedInstrument extends Instrument {
	
	static {
		System.out.println("StringedInstrument class loaded");
	}
	
	public StringedInstrument(String name, double price) {
		super(name, price);
	}
	
	@Override
	public void play() {
		System.out.println("A stringed instrument is playing");
	}

}
