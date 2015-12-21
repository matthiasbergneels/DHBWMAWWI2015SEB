package kapitel6.bauernhof;

public class Hund extends Tier{

	private String rasse;
	
	public Hund(float gewicht, String bezeichnung, float groesse, String rasse){
		super(gewicht, bezeichnung, groesse);
		this.setRasse(rasse);
	}
	
	@Override
	public String toString(){
		return super.toString() + ", " + this.getRasse();
	}
	
	@Override
	public void atmen(){
		System.out.println("Der Hund atmet!");
	}
	
	
	public void bellen(){
		System.out.println("Der Hund bellt!");
	}

	public String getRasse() {
		return rasse;
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}
	
	@Override
	public void setGewicht(float gewicht) {
		if(gewicht < 1.0f){
			gewicht = 1.0f;
		}
		super.setGewicht(gewicht);
	}
	
	
}
