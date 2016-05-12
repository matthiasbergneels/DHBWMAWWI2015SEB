package kapitel7;

public class Reisenbuero {

	public static void main(String[] args) {
		
		Buchbar buchbar1 = new Bus(100);
		
		System.out.println("Freie Plätze: " + buchbar1.freiePlaetze());
		buchbar1.buchen(30);
		System.out.println("Freie Plätze: " + buchbar1.freiePlaetze());
		
		// narrowing Cast
		buchbar1 = new Hotel(45);
		
		System.out.println("Freie Plätze: " + buchbar1.freiePlaetze());
		buchbar1.buchen(30);
		System.out.println("Freie Plätze: " + buchbar1.freiePlaetze());
		
		// widening Cast --> prüfen!
		if(buchbar1 instanceof Hotel){
			Hotel hotel1 = (Hotel)buchbar1;
		}
		

	}

}
