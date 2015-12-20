package kapitel5;

public class Auto {
	
	private static int autoZaehler;
	private static Auto[] autoListe = new Auto[100];
	
	private String farbe;
	private final short baujahr;
	private int kmStand;
	private String marke;
	public static Auto meinAuto;
	
	private int geschwindigkeit;
	
	Auto(){
		this("rot");
	}
	
	Auto(String farbe){
		this(farbe, "Opel");
	}
	
	/*
	Auto(String marke){
		this("rot", marke);
	}
	*/
	
	Auto(String farbe, String marke){
		this(farbe, (short)2015, marke);
	}
	
	
	Auto(String farbe, short baujahr, String marke){
		this.farbe = farbe;
		this.baujahr = baujahr;
		this.setMarke(marke);
		
		this.kmStand = 0;
		this.geschwindigkeit = 0;
		
		autoListe[autoZaehler] = this;
		autoZaehler++;
		
	}
	
	
	void beschleunigen(){
		System.out.println("Wir werden schneller..." + ++geschwindigkeit);
		
		
	}
	
	void beschleunigen(byte geschwindigkeitsAenderung){
		for(int i = 0; i < geschwindigkeitsAenderung; i++){
			this.beschleunigen();
		}
	}
	
	void beschleunigen(int geschwindigkeitsAenderung){
		geschwindigkeit = geschwindigkeit + geschwindigkeitsAenderung;
		System.out.println("Wir werden schneller..." + geschwindigkeit);
	}
	
	void bremsen(){
		System.out.println("Wir werden langsamer!" + --geschwindigkeit );
	}
	
	
	String getFarbe(){
		return farbe;
	}
	
	void setFarbe(String farbe){
		this.farbe = farbe;
	}
	
	short getBaujahr(){
		return baujahr;
	}
	
	int getKmStand(){
		return kmStand;
	}


	public String getMarke() {
		return marke;
	}


	private void setMarke(String marke) {
		if(marke != null && marke.equals("Opel")){
			this.marke = marke;
		}
		
	}


	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}
	
	public static void anzahlAutos(){
		System.out.println("Zur Zeit gibt es " + autoZaehler + " Autos!");
	}
	
	public static void druckeListeAllerMarken(){
		
		for(Auto auto : autoListe){
			if(auto != null){
				System.out.println(auto.getMarke());
			}
		}
		
		for(int i = 0; i < autoListe.length; i++){
			if(autoListe[i] != null){
				System.out.println(autoListe[i].getMarke());
			}
		}
		
		for(int i = 0; i < autoZaehler; i++){
			if(autoListe[i] != null){
				System.out.println(autoListe[i].getMarke());
			}
		}
	}
	

	protected void finalize() {
		System.out.println("Auto wird verschrottet!");
		autoZaehler--;
	}
	
	public static void entferneAutoAusListe(Auto auto){
		for(int i = 0; i < autoListe.length; i++){
			if(autoListe[i] != null && autoListe[i] == auto){
				System.out.println("Auto wurde aus der Liste gelöscht!");
				autoListe[i] = null;
				return;
			}
		}
	}
}
