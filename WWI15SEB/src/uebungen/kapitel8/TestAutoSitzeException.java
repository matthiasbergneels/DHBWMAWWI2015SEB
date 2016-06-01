package uebungen.kapitel8;

public class TestAutoSitzeException {

	public static void main(String[] args) {
		
		
		try {
			AutoSitze sitz1 = new AutoSitze(true, "Schwarz");
			ausgabeSitz(sitz1);
			AutoSitze sitz2 = new AutoSitze(true, "weiß");
			ausgabeSitz(sitz2);
			AutoSitze sitz3 = new AutoSitze(false, "lila");
			ausgabeSitz(sitz3);
			AutoSitze sitz4 = new AutoSitze(true, "pink");
			ausgabeSitz(sitz4);
			AutoSitze sitz5 = new AutoSitze(false, "Grün");
			ausgabeSitz(sitz5);
			
		} catch (FalscheParameter e) {
			System.out.println("Der Sitz wurde nicht bezogen!");
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("Der Sitz wurde nicht bezogen!");
			System.out.println(e.getMessage());
		} 

	}
	
	private static void ausgabeSitz(AutoSitze sitz){
		System.out.println("Sitz wurde erfolgreich bezogen - Material: " + (sitz.isLedersitze() ? "Leder" : "Stoff") + ", Farbe: " + sitz.getFarbe()  );
	}

}
