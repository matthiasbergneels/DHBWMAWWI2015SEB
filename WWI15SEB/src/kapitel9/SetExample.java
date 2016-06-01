package kapitel9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> namen = new TreeSet<String>();

		namen.add("Klaus");
		namen.add("Gabi");
		namen.add("Wildrief");
		namen.add("Klaus");
		namen.add("Marco");
		
		System.out.println("Aktuelle Anzahl Namen: " + namen.size());
		
		Iterator<String> i = namen.iterator();
		
		while(i.hasNext()){
			String name = i.next();
			System.out.println(name);
		}
		
		for(String name : namen){
			System.out.println(name);
		}

	}

}
