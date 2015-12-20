package kapitel5.AutoBsp;

public class AutoTesten {

	public static void main(String[] args) {
		
		System.out.println("Es gibt " + Auto.getAutoZaehler() + " Autos.");
		
		Reifen[] reifen = {new Reifen(), new Reifen(), new Reifen(), new Reifen()};
		
		Auto meinAuto = new Auto(Auto.ERLAUBTE_FARBE_ROT, 230, "HD-HO 2001", 1999, reifen);
		Auto deinAuto = new Auto("bLAu", 160, "HD-XX 1993", 2013, reifen);
		Auto euerAuto = new Auto(Auto.ERLAUBTE_FARBE_ROT, 100, "HD-YY 878", 1996, reifen);
		
		Auto klausAuto;
		
		klausAuto = euerAuto;
		
		System.out.println("Es gibt " + Auto.getAutoZaehler() + " Autos.");
		
		//Auto.verschrotteAuto(euerAuto);
		
		
		euerAuto = new Auto(100, Auto.ERLAUBTE_FARBE_LILA);
		klausAuto = null;

		
		System.gc();
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Es gibt " + Auto.getAutoZaehler() + " Autos.");
		
		//System.out.println(euerAuto.getFarbe());
		
		System.out.println("mein Auto ist " + meinAuto.getFarbe() 
				+ ", hat " + meinAuto.getLeistung() + "PS, das Kennzeichen " 
				+ meinAuto.getKennzeichen() + " und wurde im Jahr " + meinAuto.getBaujahr() + " gebaut!");

	}

}
