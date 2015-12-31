package uebungen.kapitel5.bahnhof;

public class Fracht {

	private Wagon wagon;
	
	private String bezeichnung;
	private double menge;
	private String verpackung;
	
	public Fracht(String bezeichnung, double menge, String verpackung){
		this.setBezeichnung(bezeichnung);
		this.setMenge(menge);
		this.setVerpackung(verpackung);
	}

	public Wagon getWagon() {
		return wagon;
	}

	public void setWagon(Wagon wagon) {
		this.wagon = wagon;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public double getMenge() {
		return menge;
	}

	public void setMenge(double menge) {
		this.menge = menge;
	}

	public String getVerpackung() {
		return verpackung;
	}

	public void setVerpackung(String verpackung) {
		this.verpackung = verpackung;
	}
	
	
	
	
}
