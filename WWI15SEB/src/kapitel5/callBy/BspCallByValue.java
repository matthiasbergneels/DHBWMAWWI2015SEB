package kapitel5.callBy;

public class BspCallByValue {

	public static void main(String[] args) {
		
		// Definition von Variablen
		int a = 50;
		int b;
		
		// Zuweisung a -> b
		// Der Wert aus a wird in b �bergeben!
		b = a;
		
		// Ver�ndern von b;
		b = b + 100 * 20;
		
		
		if(a == b){
			System.out.println("Das kann nicht passieren!!");
		}else{
			// Ausgabe der Werte
			System.out.println("a hat den Wert: " + a);
			System.out.println("b hat den Wert: " + b);
			//Erl�uterung
			System.out.println("\n\nBei einfachen Datentypen wird in Java Call by value ausgef�hrt - bedeutet: \nBei einer Zuweisung wird nur der Wert �bergeben. Die urspr�ngliche Variable (in diesem Fall a)\n�ndert sich nicht auch wenn die neu zugewiesene Variable (in diesem Fall b)\nmodifiziert wird!");
		}
		
		

	}

}
