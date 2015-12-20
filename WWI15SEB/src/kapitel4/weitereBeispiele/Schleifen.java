package kapitel4.weitereBeispiele;

public class Schleifen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("while:");
		int zahl = 0;
		
		while(zahl < 10){
			zahl++;
			if(zahl % 2 == 1){
				
				continue;
			}
			System.out.println(zahl);
		}
		
		/*
		System.out.println("Do-While:");
		
		int zahl2 = 0;
		
		do{
			zahl2++;
			System.out.println(zahl2);
		}while(zahl2 < 10);

		
		System.out.println("For:");
		
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}
		*/
		
		
		
		
	}

}
