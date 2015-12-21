package kapitel6.bauernhof;

public class Hund extends Tier{

	private String rasse;
	
	public Hund(float gewicht, String bezeichnung, float groesse, String rasse){
		super(gewicht, bezeichnung, groesse);
		this.setRasse(rasse);
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
	
	
	
}
