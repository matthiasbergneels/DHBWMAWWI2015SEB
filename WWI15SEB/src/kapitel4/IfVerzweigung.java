package kapitel4;

public class IfVerzweigung {

	public static void main(String[] args) {
		
		int zahl = 50;
		
		if(zahl > 50){
			System.out.println("JA");
			System.out.println("Nein");
		}else if(zahl < 100){
			System.out.println("Tante Else");
		}
		
		
		
		
		if(zahl > 50){
			if(zahl < 100){
				System.out.println("Eins");
			}
		}else{
			System.out.println("Zwei");
		}
		
			
		
	}

}
