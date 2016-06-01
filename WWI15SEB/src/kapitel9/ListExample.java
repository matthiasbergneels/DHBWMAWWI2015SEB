package kapitel9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args){
		
		List<String> liste = new ArrayList<String>();
		
		liste.add("Klaus");
		liste.add("Gabi");
		liste.add("Michael");
		liste.add("Monika");
		liste.add("Klaus");
		
		
		System.out.println(liste.get(0));
		System.out.println(liste.get(4));
		
		System.out.println(liste.get(2));
		liste.remove(2);
		System.out.println(liste.get(2));
		
		System.out.println("Anzahl Elemente: " + liste.size());
		liste.remove("Klaus");
		System.out.println("Anzahl Elemente: " + liste.size());
		System.out.println(liste.get(0));
		liste.remove("Klaus");
		System.out.println("Anzahl Elemente: " + liste.size());
		System.out.println(liste.get(0));
		
		
		liste.add("Jörg");
		System.out.println("Anzahl Elemente: " + liste.size());
		
		System.out.println("Iteration mit Zaehlerschleife:");
		for(int i = 0; i < liste.size(); i++){
			System.out.println(liste.get(i));
		}
		
		System.out.println("Iteration mit For-Each:");
		for(String o : liste){
			System.out.println(o);
		}
		
		System.out.println("Iteration mit Iterator:");
		Iterator<String> i = liste.iterator();
		
		while(i.hasNext()){
			String o = i.next();
			System.out.println(o);
		}
		
		
		
		List<Integer> zahlen = new ArrayList<Integer>();
		//auto-boxing
		zahlen.add(15);  // zahlen.add(new Integer(15));
		zahlen.add(89);
		zahlen.add(61);
		zahlen.add(42);
	
		
		Integer zahl = new Integer(42);
	
		zahlen.add(zahl);
		
		// auto-unboxing
		for(int z : zahlen){
			System.out.println(z);
		}
		
		
	}
}
