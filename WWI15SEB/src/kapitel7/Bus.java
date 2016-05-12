package kapitel7;

public class Bus implements Buchbar{
	
	private int anzahlPlaetze;
	private int anzahlReserviertePlaetze;
	
	public Bus(int anzahlPlaetze){
		this.anzahlPlaetze = anzahlPlaetze;
		this.anzahlReserviertePlaetze = 0;
	}


	@Override
	public int freiePlaetze() {
		return anzahlPlaetze - anzahlReserviertePlaetze;
	}


	@Override
	public void buchen(int anzahl) {
		if(anzahl <= freiePlaetze()){
			anzahlReserviertePlaetze =+ anzahl;
		}
		
	}
	
	
	
}
