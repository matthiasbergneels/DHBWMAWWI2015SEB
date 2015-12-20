package kapitel4;

public class SwitchCaseBeispiel {

	public static void main(String[] args) {
		
		int note = 1;
		
		switch(note){
		case 5: System.out.println("mangelhaft");
				break;
		case 4: System.out.println("ausreichend");
				break;
		case 3: System.out.println("befriedigend");
				break;
		case 2: System.out.println("gut");
				break;
		case 1: System.out.println("sehr gut");
				break;
		default: System.out.println("keine Note!");

		}

		
	}

}
