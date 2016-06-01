package kapitel7;

public class ZuWenigPlaetze extends Exception{
	
	private int restlicheFreiePlaetze;

	public ZuWenigPlaetze(int fehlendePlaetze, int restlicheFreiePlaetze) {
		super("Es fehlen " + fehlendePlaetze + "Plaetze für die Buchung!");
		this.restlicheFreiePlaetze = restlicheFreiePlaetze;
	}

	public int getRestlicheFreiePlaetze() {
		return restlicheFreiePlaetze;
	}
}
