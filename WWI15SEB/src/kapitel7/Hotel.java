package kapitel7;

public class Hotel implements Buchbar {
	
	private boolean[] zimmerFrei;
	
	public Hotel(int anzahlZimmer){
		zimmerFrei = new boolean[anzahlZimmer];
		for(int i = 0; i < anzahlZimmer; i++){
			zimmerFrei[i] = true;
		}
	}
	
	@Override
	public void buchen(int anzahl) {
		if(anzahl <= freiePlaetze()){
			for(int i = 0; i < zimmerFrei.length; i++){
				if(zimmerFrei[i]){
					zimmerFrei[i] = false;
					anzahl--;
					if(anzahl <= 0){
						break;
					}
				}
			}
		}

	}

	@Override
	public int freiePlaetze() {
		int freieZimmer = 0;
		for(boolean zimmer : zimmerFrei){
			if(zimmer){
				freieZimmer++;
			}
		}
		return freieZimmer;
	}

}
