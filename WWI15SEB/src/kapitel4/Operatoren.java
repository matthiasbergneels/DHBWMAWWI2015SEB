package kapitel4;

public class Operatoren {

	public static void main(String[] args) {
		
		int zahl1 = 100;
		int zahl2 = 54;
		
		int erg;
		
		//zahl1++; // zahl1 = zahl1 + 1;
		
		erg = zahl1-- + zahl2;
		
		System.out.println(zahl1 + " + " + zahl2 + " = " + erg);

		
		System.out.println(zahl1 + " == " + zahl2 + " ==> " + (zahl1 == zahl2));
		System.out.println(zahl1 + " != " + zahl2 + " ==> " + (zahl1 != zahl2));
		System.out.println(zahl1 + " >= " + zahl2 + " ==> " + (zahl1 >= zahl2));
		
		
		zahl1 += zahl2; // ==> zahl1 = zahl1 + zahl2;
		
		System.out.println(zahl1);
	}

}
