package instrument;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Creating instances...");
		WindInstrument flute = new WindInstrument("Flute", 137.95);
		StringedInstrument piano = new StringedInstrument("Piano", 2150.0);
		PercussionInstrument drum = new PercussionInstrument("Drum", 327.54);
		
		System.out.println("Playing instruments...");
		flute.play();
		piano.play();
		drum.play();
	}

}
