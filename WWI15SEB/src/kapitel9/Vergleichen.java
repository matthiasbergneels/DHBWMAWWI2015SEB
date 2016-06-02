package kapitel9;

public class Vergleichen {

	public static void main(String[] args) {
		StudierendePerson p1 = new StudierendePerson(4711, "Mueller", "Klaus", 23);
		StudierendePerson p2 = new StudierendePerson(5711, "Schmidt", "Gabi", 21);
		StudierendePerson p3 = new StudierendePerson(4711, "Mueller", "Klaus", 23);
		StudierendePerson p4 = p1;
		StudierendePerson p5 = new StudierendePerson(4711, "Mueller", "Klaus", 23);
		
		boolean vergleich;
		
		
		// Vergleich über Referenzen!
		vergleich = (p1 == p2); // false
		vergleich = (p1 == p3); // false !!!
		vergleich = (p1 == p4); // true
		
		
		// Vergleich über Inhalt
		vergleich = p1.equals(p2); // false
		vergleich = p1.equals(p3); // Eigene Implementierung --> true !!! Standardimplementierung von Object ==> false
		vergleich = p1.equals(p4); // Standardimplementierung von Object ==> true

		
		System.out.println("P1 hashCode() " + p1.hashCode());
		System.out.println("P2 hashCode() " + p2.hashCode());
		System.out.println("P3 hashCode() " + p3.hashCode());
		System.out.println("P4 hashCode() " + p4.hashCode());
		
		
		
		// Reminder
		double d1 = 0.0;
		double d2 = -0.0;
		
		if(d1 == d2){
			System.out.println("0.0 == -0.0");
		}
		
		System.out.println(Double.doubleToLongBits(d1));
		System.out.println(Double.doubleToLongBits(d2));
		
		System.out.println(Double.compare(d1, d2));
		
	}

}
