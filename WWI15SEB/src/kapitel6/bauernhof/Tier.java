package kapitel6.bauernhof;

public abstract class Tier {
	private float gewicht;
	private String bezeichnung;
	private float groesse;
	
	public Tier(float gewicht, String bezeichnung, float groesse){
		this.setGewicht(gewicht);
		this.setBezeichnung(bezeichnung);
		this.setGroesse(groesse);
	}
	
	@Override
	public String toString(){
		return "Das Tier: " + this.getBezeichnung() + 
				", " + this.getGewicht() + ", " + this.getGroesse();
	}
	
	public abstract void atmen();
	
	public void fressen(){
		System.out.println("Das Tier frisst!");
	}
	
	public final void bewegen(){
		System.out.println("Das Tier bewegt sich!");
	}

	public float getGewicht() {
		return gewicht;
	}

	public void setGewicht(float gewicht) {
		if(gewicht <= 0){
			gewicht = 0.1f;
		}
		this.gewicht = gewicht;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public float getGroesse() {
		return groesse;
	}

	public void setGroesse(float groesse) {
		if(groesse <= 0){
			groesse = 0.1f;
		}
		this.groesse = groesse;
	}
	
	
}
