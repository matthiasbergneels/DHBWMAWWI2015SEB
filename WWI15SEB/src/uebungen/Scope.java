package uebungen;

public class Scope {

	public static void main(String[] args) {
		
		int zahl = 0;
		
		for(int i = 0; i < 100; i++) {
			
			int andereZahl = 1000;
			andereZahl++;
			zahl = andereZahl;
			
		}
		
		System.out.println(zahl);
		//System.out.println(andereZahl);
	}

}
