package uebungen.kapitel5.bahnhof;

public class Gueterzug {
	
	private Zugfuehrer fahrer;
	
	private Lokomotive lok;
	private Wagon[] wagons;
	


	public Gueterzug(Lokomotive lok, Wagon[] wagons){
		this.setLok(lok);
		this.setWagons(wagons);
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
			this.lok = new Lokomotive();
		}
		
	}

	public Wagon[] getWagons() {
		return wagons;
	}

	public void setWagons(Wagon[] wagons) {
		if(wagons != null){
			this.wagons = wagons;
		}else{
			this.wagons = new Wagon[2];
			this.wagons[0] = new Wagon();
			this.wagons[1] = new Wagon();
		}
		
	}
	
	public void fahren(){
		if(fahrer != null){
			System.out.println("Tschu Tschu Tschu... ");
		}else{
			System.out.println("Lokomitive kann ohne Zugfuherer nicht fahren");
		}
	}
}
