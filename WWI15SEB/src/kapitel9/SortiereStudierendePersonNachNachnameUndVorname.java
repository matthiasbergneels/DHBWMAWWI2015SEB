package kapitel9;

import java.util.Comparator;

public class SortiereStudierendePersonNachNachnameUndVorname implements Comparator<StudierendePerson>{

	@Override
	public int compare(StudierendePerson o1, StudierendePerson o2) {
		
		int vergleich = o1.getName().compareTo(o2.getName());
		if(vergleich != 0){
			return vergleich;
		}
		
		vergleich = o1.getVorname().compareTo(o2.getVorname());
		if(vergleich != 0){
			return vergleich;
		}
		
		return o1.getAlter() - o2.getAlter();
		
		//return 0;
	}

	
}
