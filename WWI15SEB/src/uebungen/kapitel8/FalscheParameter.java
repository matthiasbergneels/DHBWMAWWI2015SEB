package uebungen.kapitel8;

public class FalscheParameter extends Exception {

	public FalscheParameter(String farbe){
		super("Falsche Kombination: Ledersitze können nicht " + farbe + " sein");
	}
}
