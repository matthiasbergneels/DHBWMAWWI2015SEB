package datenstrukturen;

public class Studierenden {

	private int matrikelNr;
	private String nachname;
	private String vorname;
	
	public Studierenden(int matrikelNr, String nachname, String vorname){
		this.setMatrikelNr(matrikelNr);
		this.setNachname(nachname);
		this.setVorname(vorname);
	}

	public int getMatrikelNr() {
		return matrikelNr;
	}

	public void setMatrikelNr(int matrikelNr) {
		this.matrikelNr = matrikelNr;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	@Override
	public String toString() {
		return "#" + this.getMatrikelNr() + ": " + this.getNachname() + ", " + this.getVorname();
	}
}
