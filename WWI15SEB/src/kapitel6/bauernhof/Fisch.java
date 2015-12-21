package kapitel6.bauernhof;

public class Fisch extends Tier {

	private boolean knorpelfisch;
	
	public Fisch(float gewicht, String bezeichnung, float groesse, boolean knorpelfisch) {
		super(gewicht, bezeichnung, groesse);
		this.setKnorpelfisch(knorpelfisch);
		
		//this.groesse = 100; 
	}
	
	@Override
	public void atmen(){
		System.out.println("Der Fisch atmet auch unter Wasser!");
	}
	
	public void blubbern(){
		System.out.println("Der Fisch blubbert!");
	}

	public boolean isKnorpelfisch() {
		return knorpelfisch;
	}

	public void setKnorpelfisch(boolean knorpelfisch) {
		this.knorpelfisch = knorpelfisch;
	}
	
	

}
