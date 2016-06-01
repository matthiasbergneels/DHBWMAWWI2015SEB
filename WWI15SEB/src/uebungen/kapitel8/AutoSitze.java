package uebungen.kapitel8;

public class AutoSitze {
	
	private boolean ledersitze;
	private String farbe;
	
	private static final String FARBE_SCHWARZ = "schwarz";
	private static final String FARBE_WEISS = "weiß";
	
	
	public AutoSitze(boolean ledersitze, String farbe) throws FalscheParameter{
		if(ledersitze && (!farbe.toLowerCase().equals(FARBE_SCHWARZ) && !farbe.toLowerCase().equals(FARBE_WEISS))){
			throw new FalscheParameter(farbe);
		}
		
		this.ledersitze = ledersitze;
		this.farbe = farbe;
	}
	
	
	public boolean isLedersitze() {
		return ledersitze;
	}
	public String getFarbe() {
		return farbe;
	}
	
	
	

}
