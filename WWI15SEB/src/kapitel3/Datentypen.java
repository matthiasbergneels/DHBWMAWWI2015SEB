package kapitel3;

public class Datentypen {

	public static void main(String[] args) {
		
		// Variablen
		
		//Deklaration
		double reeleZahl;
		
		//Initialisierung
		reeleZahl = 28.2;
		
		// Deklaration und Initialisierung
		boolean muede = true;
		char meinZeichen = 'A';
		int meineZahl = 1672;
		float meineNeueReeleZahl = 7.25e-2f;
		long meineLangeZahl = 2890000000l;
	
		
		meineZahl = 0x12F; // hexadezimal
		
		meineZahl = 016; // octal
		
		reeleZahl = .5;
		
		
		System.out.println(meineNeueReeleZahl);
		System.out.println(reeleZahl);
		System.out.println(muede);
		
		
		
		// Konstanten
		
		final double pi = 3.141;
		
		// pi = 78.9; geht nicht :-(
		
		System.out.println(pi);
		
		int binZahl = 0b0110001;
		
		System.out.println(binZahl);

	}

}
