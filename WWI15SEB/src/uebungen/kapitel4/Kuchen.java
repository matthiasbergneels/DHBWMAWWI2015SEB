package uebungen.kapitel4;

public class Kuchen {

	public static void main(String[] args) {
		
		int og = 9;
		
	
		if(args.length == 1){
			og = Integer.parseInt(args[0]);
		}
		
		int erg = 1;
		int counter = 0;
		
		System.out.println("Do-While Schleife");
		System.out.println("=================");
		do{
			erg = counter++ + erg;
			System.out.print(erg + " ");
		}while(counter < 9);
		
		
		System.out.println("\n\nFor Schleife");
		System.out.println("=================");
		erg = 1;
		for(int i = 0; i < 9; i++){
			erg = i + erg;
			System.out.print(erg + " ");
		}
	}

}
