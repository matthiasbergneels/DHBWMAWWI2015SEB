package uebungen.kapitel5.bahnhof;

public class Gueterzug {
	
	private Zugfuehrer fahrer;
	
	private Lokomotive lok;
	private Wagon[] wagons;
	
	
	private int nummer;
	private double laenge;
	private int anzWagons;


	public Gueterzug(Lokomotive lok, Wagon[] wagons, int nummer, int anzWagons){
		
		this.setAnzWagons(anzWagons);
		this.setNummer(nummer);
		
		this.setLok(lok);
		this.setWagons(wagons);
	}
	
	public Gueterzug(int nummer, int anzWagons){
		this(erzeugeLokomotive(), erzeugeWagons(anzWagons), nummer, anzWagons);
	}

	public Zugfuehrer getFahrer() {
		return fahrer;
	}

	public void setFahrer(Zugfuehrer fahrer) {
		this.fahrer = fahrer;
	}
	
	public Lokomotive getLok() {
		return lok;
	}

	public void setLok(Lokomotive lok) {
		if(lok != null){
			this.lok = lok;
		}else{
			this.lok = erzeugeLokomotive();
		}
		
		// bi-direktionale Beziehung setzen
		this.lok.setZug(this);
		
	}

	public Wagon[] getWagons() {
		return wagons;
	}

	public void setWagons(Wagon[] wagons) {
		if(wagons != null){
			this.wagons = wagons;
		}else{
			this.wagons = erzeugeWagons(2);
			
		}
		this.setAnzWagons(this.wagons.length);
		
		// bi-direktionale Beziehung setzen
		for(Wagon wagon : this.wagons){
			wagon.setZug(this);
		}
		
	}
	
	public void setWagons(Wagon wagon){
		if(wagon != null){
			Wagon[] wagons = {wagon};
			this.wagons = wagons;
		}else{
			this.wagons = erzeugeWagons(1);
		}
	}
	
	public void fahren(){
		if(fahrer != null){
			System.out.println("Tschu Tschu Tschu... ");
		}else{
			System.out.println("Lokomitive kann ohne Zugfuherer nicht fahren");
		}
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public int getAnzWagons() {
		return anzWagons;
	}

	public void setAnzWagons(int anzWagons) {
		this.anzWagons = anzWagons;
	}
	
	private static Wagon[] erzeugeWagons(int anzahl){
		Wagon[] wagons = new Wagon[anzahl];
		for(int i = 0; i < wagons.length; i++){
			wagons[i] = new Wagon(1000 + i, "Kastenwagon", (byte)4);
		}
		return wagons;
	}
	
	private static Lokomotive erzeugeLokomotive() {
		return new Lokomotive(1234, "SuperLok", "Elektro", (byte)8);
	}
}
