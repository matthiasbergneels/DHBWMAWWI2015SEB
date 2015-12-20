package kapitel3;

public class Konvertierung {

	public static void main(String[] args) {
		
		
		int grosseZahl = 19;
		
		byte kleineZahl;
		
		
		grosseZahl = 130;
		
		kleineZahl = (byte)grosseZahl;
		
		System.out.println(grosseZahl);
		System.out.println(kleineZahl);
		
		
		double reeleZahl = 23.798;
		float kleineReeleZahl;
		int keineReeleZahl;
		
		kleineReeleZahl = (float)reeleZahl;
		keineReeleZahl = (int)reeleZahl;

		System.out.println(reeleZahl);
		System.out.println(kleineReeleZahl);
		System.out.println(keineReeleZahl);
	}

}
