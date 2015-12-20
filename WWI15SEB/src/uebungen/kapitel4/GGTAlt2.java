package uebungen.kapitel4;

public class GGTAlt2 {


	public static void main(String[] args) {
		
		int x = 120;
		int y = 80;
		
		if(args.length == 2){
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			
		}
		
		if((x == 0)||(y == 0)){
			System.out.println("Keine L�sung!");
			return;
		}
		
		System.out.print("Der GGT von " + x + " und " + y + " ist: ");
		
		while(x != y){
			if(x > y){
				x -= y; // x = x - y;
			}else{
				y -= x; // y = y - x;
			}
		}
		
		System.out.println(x);

	}

}
