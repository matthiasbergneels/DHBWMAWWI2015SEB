package uebungen.kapitel4;

public class Heron {

	public static void main(String[] args){
		
		final double SCHWELLWERT = 0.001;
		
		double wert = 9.0;
		
		double a = wert;
		double x1 = wert;
		double x0 = wert;
		
		while ((x0 - x1) > SCHWELLWERT || x0 == x1){
			x0 = x1;
			x1 = (x0 + a / x0) / 2.0;
			System.out.println("Zwischenergebnis: " + x1);
	
		}
		
	
		System.out.println("Die Wurzel von " + wert + " ist ca. " + x1);
		
	}
}
