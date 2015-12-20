package kapitel4.weitereBeispiele;

public class SwitchCase {

	
	public static void main(String[] args) {
		
		int note;
		
		note = 1;
		
		switch(note){
		
		case 1:
			System.out.println("sehr gut");
			note = note + note;
			break;
		case 2:
			System.out.println("gut");
			break;
		case 3:
			System.out.println("befriedigend");
			break;
			
		default:
			System.out.println("Babo ist der Beste!");
			break;
			
		}
		
		System.out.println("Ende "  + note);
		

	}

}
