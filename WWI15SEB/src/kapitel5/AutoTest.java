package kapitel5;

public class AutoTest {

	public static void main(String[] args) {
		
		Auto.anzahlAutos();
		
		Auto deinAuto = null;
		
		Auto meinAuto = new Auto(null, (short)2015, null);
		
		Auto auto1 = new Auto();
		Auto auto2 = new Auto("rot");
		
		auto2.beschleunigen();
		auto2.bremsen();
		
		Auto.entferneAutoAusListe(auto2);
		auto2 = null;
		
		System.gc();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		auto1.anzahlAutos();
		
		//meinAuto.farbe = "blau";
		
		System.out.println(meinAuto.getFarbe());
		System.out.println(meinAuto.getBaujahr());
		System.out.println(meinAuto.getMarke());
		System.out.println(meinAuto.getKmStand());
		
		//meinAuto.geschwindigkeit = -167;
		//meinAuto.farbe = "Katze";
		Auto.meinAuto = auto1;
		Auto.anzahlAutos();
		Auto.druckeListeAllerMarken();
		
		while(meinAuto.getGeschwindigkeit() < 100){
			if(meinAuto.getGeschwindigkeit() % 10 != 0){
				meinAuto.beschleunigen(3);
			}else{
				meinAuto.beschleunigen((byte)5);
			}
			meinAuto.beschleunigen();
		}
		
		while(meinAuto.getGeschwindigkeit() > 50){
			meinAuto.bremsen();
		}
		
		
		
	}

}
