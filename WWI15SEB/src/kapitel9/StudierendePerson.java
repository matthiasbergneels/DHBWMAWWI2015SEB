package kapitel9;

public class StudierendePerson implements Comparable<StudierendePerson>{
	
	private int matrikelnummer;
	private String name;
	private String vorname;
	private int alter;
	
	public StudierendePerson(int matrikelnummer, String name, String vorname, int alter){
		setMatrikelnummer(matrikelnummer);
		setName(name);
		setVorname(vorname);
		setAlter(alter);
	}
	
	
	public int getMatrikelnummer() {
		return matrikelnummer;
	}
	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	@Override
	public String toString() {
		
		return this.matrikelnummer + ": " + this.name + ", " + this.vorname + " - " + this.alter;
	}


	@Override
	public int compareTo(StudierendePerson o) {
		
		return this.matrikelnummer - o.getMatrikelnummer();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		// Alias Check
		if(this == obj){
			return true;
		}
		
		// Null check
		if(obj == null){
			return false;
		}
		
		// type check
		if(obj.getClass() != this.getClass()){
			return false;
		}
		
		
		// Ab hier --> Inhaltlichervergleich!
		StudierendePerson o = (StudierendePerson)obj;
		
		if(this.getMatrikelnummer() != o.getMatrikelnummer()){
			return false;
		}
		
		if(!this.getName().equals(o.getName())){
			return false;
		}
		
		if(!this.getVorname().equals(o.getVorname())){
			return false;
		}
		
		return this.getAlter() == o.getAlter();
	}
	
	@Override
	public int hashCode() {
		
		return this.getMatrikelnummer() 
				^ ((this.getName() == null ) ? 0 : this.getName().hashCode()) 
				^ ((this.getVorname() == null ) ? 0 : this.getVorname().hashCode()) 
				^ this.getAlter();
	}
	

}
