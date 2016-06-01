package kapitel9;

public class Vergleichen {

	public static void main(String[] args) {
		StudierendePerson p1 = new StudierendePerson(4711, "Mueller", "Klaus", 23);
		StudierendePerson p2 = new StudierendePerson(5711, "Schmidt", "Gabi", 21);
		StudierendePerson p3 = new StudierendePerson(4711, "Mueller", "Klaus", 23);
		StudierendePerson p4 = p1;
		
		boolean vergleich;
		
		
		// Vergleich über Referenzen!
		vergleich = (p1 == p2); // false
		vergleich = (p1 == p3); // false !!!
		vergleich = (p1 == p4); // true
		
		
		// Vergleich über Inhalt
		vergleich = p1.equals(p2); // false
		vergleich = p1.equals(p3); // Eigene Implementierung --> true !!! Standardimplementierung von Object ==> false
		vergleich = p1.equals(p4); // Standardimplementierung von Object ==> true

	}

}
