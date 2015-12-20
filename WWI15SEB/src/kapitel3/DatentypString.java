package kapitel3;

public class DatentypString {

	public static void main(String[] args) {
		
		
		String ersteZeichenkette = "Sehr geehrter \"Kurs\",\n"
				+ "\tes wär schön wenn RUUUUHHHHIIIIEEESCH JETZT! "
				+ "182.5"
				+ "\nMit freundlichen Grüßen, "
				+ "\nDer Dozent";
		
		System.out.println(ersteZeichenkette);

		
		
		String zweiteZeichenkette = "Hello";
		String dritteZeichenkette = "World";
		
		int a = 67;
		byte b = 89;
		
		String neuerString = "" + a + b + zweiteZeichenkette + " " + (a + b) + dritteZeichenkette;
		
		System.out.println(neuerString);
		
	}

}
