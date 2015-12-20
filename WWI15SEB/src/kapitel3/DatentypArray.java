package kapitel3;

public class DatentypArray {

	public static void main(String args[]){
		
		
		byte kleineZahlenliste[];
		
		int[] zahlenListe;
		
		zahlenListe = new int[5];
		
		zahlenListe[0] = 156;
		zahlenListe[1] = 126;
		zahlenListe[2] = 146;
		zahlenListe[3] = 15523;
		zahlenListe[4] = 1;
		
		for(int i = 0; i < zahlenListe.length; i++){
			if(zahlenListe[i] > 10000){
				continue;
			}
			
			if(zahlenListe[i] > 100){
				zahlenListe[i] = 99;
			}
			
			System.out.print(zahlenListe[i] + " ");
			
		}
		System.out.print("\n");
		
		for(int i : zahlenListe){
			if(i > 50){
				i = 49;
			}
			System.out.print(i + " ");
		}
		
System.out.print("\n");
		
		for(int i : zahlenListe){

			System.out.print(i + " ");
		}
		
		
		
		System.out.print("\n");
		System.out.println(zahlenListe[2]);
		
		int[] zahlenListe2 = {189, 897, 15652, 86876, 12312};
		
		System.out.println(zahlenListe2[4]);
		
		
		String[][] woerterFeld = new String[3][3];
		
		woerterFeld[0][0] = "Hallo";
		woerterFeld[0][2] = "Bonjour";
		woerterFeld[1][1] = "Klaus";
		woerterFeld[2][2] = "Wurst";
		woerterFeld[0][1] = "Gabi";
		
		System.out.println(woerterFeld[0][2] 
								+ woerterFeld[0][1] 
								+ woerterFeld[2][2]);
		
		String[][] woerterFeld2 = {{"Hallo", "Bonjour", "Hello"}, 
									{"Klaus", "Gabi", "Martin"}, 
									{"Wurst", "Käse", "Eier"}};
		
		System.out.println(woerterFeld2[0][2] + " " 
				+ woerterFeld2[0][1] + " "
				+ woerterFeld2[2][2]);
		
		
		String[][] woerterPyramide = new String[5][];
		
		woerterPyramide[0] = new String[1];
		woerterPyramide[1] = new String[2];
		woerterPyramide[2] = new String[3];
		woerterPyramide[3] = new String[2];
		woerterPyramide[4] = new String[1];
		
		woerterPyramide[0][0] = "eins";
		woerterPyramide[1][0] = "eins";
		woerterPyramide[2][0] = "eins";
		woerterPyramide[3][0] = "eins";
		woerterPyramide[4][0] = "eins";
		
		woerterPyramide[1][1] = "zwei";
		woerterPyramide[2][1] = "zwei";
		woerterPyramide[3][1] = "zwei";
		
		woerterPyramide[2][2] = "drei";
		
		//woerterPyramide[2] = new String[5];
		
		System.out.println(woerterPyramide.length);
		System.out.println(woerterPyramide[0].length);
		System.out.println(woerterPyramide[2].length);
		
		
	}
}
