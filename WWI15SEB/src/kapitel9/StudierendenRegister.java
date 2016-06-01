package kapitel9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudierendenRegister{

	public static void main(String[] args) {
		
		List<StudierendePerson> register = new ArrayList<StudierendePerson>();
		
		Set<StudierendePerson> registrierteMenge = new TreeSet<StudierendePerson>(new SortiereStudierendePersonNachNachnameUndVorname());
		
		
		register.add(new StudierendePerson(4771, "Müller", "Karl", 23));
		register.add(new StudierendePerson(4871, "Schmidt", "Gabi", 21));
		register.add(new StudierendePerson(1562, "Mayer", "Michael", 35));
		register.add(new StudierendePerson(2771, "Müller", "Karl", 23));
		register.add(new StudierendePerson(4771, "Müller", "Karl", 23));
		register.add(new StudierendePerson(1962, "Mayer", "Klaus", 35));
		register.add(new StudierendePerson(9962, "Mayer", "Klaus", 36));
		register.add(register.get(1));
		register.add(new StudierendePerson(4771, "Heber", "Karl", 23));
		
		
		System.out.println("Ausgabe Liste:");
		for(StudierendePerson person : register){
			System.out.println(person);
			registrierteMenge.add(person);
		}
		
		

		System.out.println("Ausgabe Menge:");
		for(StudierendePerson person : registrierteMenge){
			System.out.println(person);
		}

		
		
		Collections.sort(register);
		System.out.println("Ausgabe Liste - natürlich sortiert:");
		for(StudierendePerson person : register){
			System.out.println(person);
			
		}
		
		Collections.sort(register, new SortiereStudierendePersonNachNachnameUndVorname());
		System.out.println("Ausgabe Liste - sortiert nach Nachname, Vorname, Alter:");
		for(StudierendePerson person : register){
			System.out.println(person);
			
		}
		
	}

}
