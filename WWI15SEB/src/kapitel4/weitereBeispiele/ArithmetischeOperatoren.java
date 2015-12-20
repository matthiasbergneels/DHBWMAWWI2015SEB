package kapitel4.weitereBeispiele;

public class ArithmetischeOperatoren {

	
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		
		double d1 = 5;
		double d2 = 2.5;
		
		
		int erg;
		
		erg = a % b;
		
		double derg = d1 % d2;
		
		
		System.out.println(erg);
		System.out.println(derg);
		
		++a; // a = a + 1;
		
		a--; // a = a - 1;
		
		erg = b + ++a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(erg);
		
		boolean berg = (a >= b) & (d1 == d2);
		
		System.out.println(!berg); 
		
		
		short s1 = -5;
		short s2 = 2;
		
		int serg;
		
		s1 &= s2;
		
		System.out.println(s1);
		
		
		//a += (b + s2);  // a = a + b;
		
		
		erg = (a < b) ? a : b;
		
		System.out.println(erg);
		
		
		String text1 = "Hallo ";
		String text2 = "Welt!";
		
		String ergText = a + "" + b + text1 + text2 + (a + b);
		
		System.out.println(ergText);
		
	}

}
