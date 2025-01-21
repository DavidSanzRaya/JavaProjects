package instrument;

public class PercussionInstrument extends Instrument {
	
	static {
		System.out.println("PrecussionInstrument class loaded");
	}
	
	public PercussionInstrument(String name, double price) {
		super(name, price);
	}

	@Override
	public void play() {
		System.out.println("A percussion instrument is playing");
	}
}
