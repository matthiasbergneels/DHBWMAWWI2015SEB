package kapitel4.weitereBeispiele;

public class Anweisungen {

	
	public static void main(String[] args) {
		
		int a = 30;
		int b = 20;
		
		/*
		if(a > b){
			System.out.println("a ist größer b!");
		}
		else if(a < b){
			System.out.println("a ist kleiner b!");
		}
		else{ 
			System.out.println("a gleich b!");
			System.out.println("Hier war Else!");
		}
		*/
		
		a = 25;
		if(a > 30){
			System.out.println("a größer 30"); 
		}else if(a > 10){
			System.out.println("a größer 10"); 
		}else if(a > 20){
			System.out.println("a größer 20"); 
		}else{
			System.out.println("Es gibt gar keinen Löffel");
		}
		
		/*
		if(a > 10){
			System.out.println("a größer 10"); 
		}
		
		if(a > 20){
			System.out.println("a größer 20"); 
		}
		
		if(a > 30){
			System.out.println("a größer 30"); 
		}else{
			System.out.println("Es gibt gar keinen Löffel");
		}
		
		
		if(a < 10)
		{
			int c = 100;
			if(a < 20){
				System.out.println("a kleiner 20");
				c = a + a + a;
			}
			c = a + b;
		}
		else
			System.out.println("a größer 10");
		
		
		//c = a + a + a;
		 * 
		 * 
		 */
		System.out.println("ENDE");
	}

}
