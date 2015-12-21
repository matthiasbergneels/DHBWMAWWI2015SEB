package kapitel6.bauernhof;

public class TestBauernhof {

	public static void main(String[] args) {
		
		Tier[] stall = new Tier[5];
		
		/*
		Tier irgendEinTier = new Tier(134.0f, "Weiss ich nicht", 15.0f );

		System.out.println(irgendEinTier.getBezeichnung());
		irgendEinTier.atmen();
		irgendEinTier.bewegen();
		irgendEinTier.fressen();
		*/
		
		Hund bello = new Hund(15.6f, "Hund Bello", 50.7f, "Labrador");
		stall[0] = bello;
		
		bello.bellen();
		bello.atmen();
		bello.bewegen();
		bello.fressen();
		System.out.println(bello.toString());
		//System.out.println("Unser Hund: " + bello.getBezeichnung() + ", " + bello.getGewicht() + ", " + bello.getGroesse());
		
		Fisch nemo = new Fisch(0.5f, "Fisch Nemo", 3.2f, false);
		stall[1] = nemo;
		
		nemo.blubbern();
		nemo.atmen();
		nemo.bewegen();
		nemo.fressen();
		System.out.println(nemo);
		
		//System.out.println("Unser Fisch: " + nemo.getBezeichnung() + ", " + nemo.getGewicht() + ", " + nemo.getGroesse());
		
		// Narrowing Cast
		stall[2] = new Hund(35.4f, "Hund Wuff", 75.4f, "Schäferhund");
		stall[3] = new Fisch(2.1f, "Fisch Dori", 6.5f, false);
		stall[4] = new Fisch(1.1f, "Fisch Merlin", 4.5f, false);
		
		for(Tier einTier : stall){
			einTier.fressen();
			einTier.atmen();
			System.out.println(einTier.toString());
			
			
			if(einTier instanceof Hund){
				// widening cast
				Hund einHund = (Hund)einTier;
				einHund.bellen();
			}
				
		}
	}

}
