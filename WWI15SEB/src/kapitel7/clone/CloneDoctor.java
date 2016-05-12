package kapitel7.clone;

public class CloneDoctor {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Schaf gabi = new Schaf("Gabi", 8, new Stall("4711"));
		
		Schaf dolly = (Schaf)gabi.clone();
		
		System.out.println("Schaf: " + gabi.getName() 
				+ ", " + gabi.getAlter() + ", " 
				+ gabi.getStall().getSeriennummer() + ", " + gabi);
		
		System.out.println("Schaf: " + dolly.getName() 
				+ ", " + dolly.getAlter() + ", " 
				+ dolly.getStall().getSeriennummer() + ", " + dolly);
		
		dolly.setName("Dolly");
		dolly.getStall().setSeriennummer("1988");
		
		System.out.println("Schaf: " + gabi.getName() 
				+ ", " + gabi.getAlter() + ", " 
				+ gabi.getStall().getSeriennummer() + ", " + gabi);
		
		System.out.println("Schaf: " + dolly.getName() 
				+ ", " + dolly.getAlter() + ", " 
				+ dolly.getStall().getSeriennummer() + ", " + dolly);
	}
	

}
