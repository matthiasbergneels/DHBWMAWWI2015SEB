package kapitel9;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String> werte = new HashMap<String, String>();
		
		werte.put("Eins", "erster Wert");
		werte.put("Banane", "Klaus");
		werte.put("Droelf", "erster Wert");
		werte.put("Banane", "Apfel");
		
		
		System.out.println(werte.get("Eins"));
		
		System.out.println(werte.containsKey("Droelf"));
		System.out.println(werte.containsValue("Michael"));
		
		for(String key : werte.keySet()){
			System.out.println(key + ": " + werte.get(key) + " , HashCode() " + key.hashCode());
		}
		
		werte.remove("Droelf");
		
		for(String value : werte.values()){
			System.out.println(value);
		}
		
	}

}
