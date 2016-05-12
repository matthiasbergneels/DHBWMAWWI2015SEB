
public class Clony {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Schaf gabi = new Schaf("Gabi", 8, new Stall("4711"));
		
		Schaf dolly = (Schaf)gabi.clone();
		
		System.out.println(gabi.getName() + " " + gabi.getAlter() + " " + gabi.getStall().getSeriennummer());
		System.out.println(dolly.getName() + " " + dolly.getAlter() + " " + dolly.getStall().getSeriennummer());
		
		dolly.getStall().setSeriennummer("1899");
		dolly.setName("Dolly");

		System.out.println(gabi.getName() + " " + gabi.getAlter() + " " + gabi.getStall().getSeriennummer());
		System.out.println(dolly.getName() + " " + dolly.getAlter() + " " + dolly.getStall().getSeriennummer());
		

	}

}
