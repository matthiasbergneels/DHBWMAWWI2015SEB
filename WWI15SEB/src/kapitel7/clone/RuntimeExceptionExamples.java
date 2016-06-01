package kapitel7.clone;

public class RuntimeExceptionExamples {

	public static void main(String[] args) {
		
		
		int a = 5;
		int b = 0;
		
		double erg = 0;
		
		// Option 1: Ausnahme vorher prüfen
		if(b != 0){
			erg = a / b;
		}
		
		// Option 2: Ausnahme auftreten lassen und abfangen/verarbeiten
		try {
			erg = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Das Ergebnis ist: " + erg);
		
		
		
		
		Schaf dolly = null;
		
		if(dolly != null){
			System.out.println(dolly.getName());
		}
		
		
		try {
			System.out.println(dolly.getName());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			dolly = new Schaf("dolly", 8, new Stall("4711"));
			System.out.println(dolly.getName());
		}
		

	}

}
