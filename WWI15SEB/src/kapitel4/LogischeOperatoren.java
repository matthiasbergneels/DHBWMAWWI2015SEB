package kapitel4;

public class LogischeOperatoren {

	public static void main(String[] args) {
		
		boolean sonneScheint = true;
		boolean regenFaellt = true;
		
		System.out.println(sonneScheint + " && !" + regenFaellt 
							+ " ==> " + (sonneScheint && !regenFaellt));

		String rausgehen = (sonneScheint && !regenFaellt) 
								? "ja, ich gehe raus!" : "nein, ich bleibe drin!";
	
		System.out.println(rausgehen);
	}

}
