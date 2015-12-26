package uebungen.kapitel5.bahnhof;

public class Zugfuehrer {
	
	private Gueterzug zug;
	

	public Gueterzug getZug() {
		return zug;
	}

	public void setZug(Gueterzug zug) {
		if(zug != null){
			zug.setFahrer(null);
		}
		this.zug = zug;
	}
	
	
	
}
