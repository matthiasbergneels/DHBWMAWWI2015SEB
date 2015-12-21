package kapitel6.bauernhof;

public class TestBauernhof {

	public static void main(String[] args) {
		/*
		Tier irgendEinTier = new Tier(134.0f, "Weiss ich nicht", 15.0f );

		System.out.println(irgendEinTier.getBezeichnung());
		irgendEinTier.atmen();
		irgendEinTier.bewegen();
		irgendEinTier.fressen();
		*/
		
		Hund bello = new Hund(15.6f, "Hund Bello", 50.7f, "Labrador");
		
		bello.bellen();
		bello.atmen();
		bello.bewegen();
		bello.fressen();
		System.out.println(bello.toString());
		//System.out.println("Unser Hund: " + bello.getBezeichnung() + ", " + bello.getGewicht() + ", " + bello.getGroesse());
		
		Fisch nemo = new Fisch(0.5f, "Fisch Nemo", 3.2f, false);
		
		
		nemo.blubbern();
		nemo.atmen();
		nemo.bewegen();
		nemo.fressen();
		System.out.println(nemo);
		
		//System.out.println("Unser Fisch: " + nemo.getBezeichnung() + ", " + nemo.getGewicht() + ", " + nemo.getGroesse());
	}

}
