package kapitel5.callBy;

import kapitel5.AutoBsp.Auto;
import kapitel5.AutoBsp.Reifen;

public class BspCallByReference {

	public static void main(String[] args) {
		
		// Erstellen eines neuen Autos - komplexe Datentyp bzw. Referenzdatentyp
		Auto meinAuto = new Auto(230, "HD-HO 2005");
		
		// Referenzvariable
		Auto deinAuto;
		
		// �bergeben des erstellten Autos (meinAuto) an Referenzvariable (deinAuto)
		// "Ich verleihe dir mein Auto!"
		deinAuto = meinAuto;
		
		
		
		// "Du" f�hrst damit weg und dort tritt jemand gegen das Auto
		System.out.println("Jemand tritt gegen deinAuto\n\n");
		deinAuto.gegenTreten();
		
		
		if(meinAuto == deinAuto){
			// Ausgabe der Werte
			System.out.println("Hat deinAuto eine Beule? " + (deinAuto.hatBeule() ? "JA" : "NEIN"));
			System.out.println("Hat meinAuto eine Beule? " + (meinAuto.hatBeule() ? "JA" : "NEIN"));
			//Erl�uterung
			System.out.println("\n\nBei komplexen Datentypen wird in Java Call by reference ausgef�hrt - bedeutet: \nBei einer Zuweisung wird die Referenz auf das Objekt �bergeben. Die urspr�ngliche Variable (in diesem Fall meinAuto)\n�ndert sich ab diesem Zeitpunkt auch wenn die neu zugewiesene Variable (in diesem Fall deinAuto)\nmodifiziert wird!\nAnders: Wenn ich jemand mein Auto leihe und jemand tritt dagegen, hat mein Auto trotzdem eine Beule obwohl ich nicht gefahren bin!");
		}else if(meinAuto != deinAuto){
			
			System.out.println("Das kann nicht passieren!!");
		}
		

	}

}
