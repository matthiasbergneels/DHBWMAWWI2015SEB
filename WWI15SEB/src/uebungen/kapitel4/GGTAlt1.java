package uebungen.kapitel4;

public class GGTAlt1 {

	public static void main(String[] args) {
		int x = 120;
		int y = 80;
		
		while(x != y){
			int erg = (x > y) ? (x -= y) : ( y -= x);
		}
		
		System.out.println("Der GGT ist " + x);

	}

}
