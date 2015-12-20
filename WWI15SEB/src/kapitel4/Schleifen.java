package kapitel4;

public class Schleifen {

	public static void main(String[] args) {
		
		
		// kopfgesteuerte Schleife
		System.out.println("while-Schleife");
		int schleifenZaehler = 0;
		
		while(++schleifenZaehler < 10){
			
			System.out.println(schleifenZaehler);
		}
			
		
		// fussgesteuerte Schleife
		
		System.out.println("do-while-Schleife");
		schleifenZaehler = 0;
		
		do{
			schleifenZaehler++;
			System.out.println(schleifenZaehler++);
		}while(schleifenZaehler < 10);
		
		
		for(int i = 0; i < 10; i++){
			System.out.println(schleifenZaehler + " - " + i);
		}

	}

}
