package kapitel7.clone;

public class Schaf implements Cloneable {

	private String name;
	private int alter;
	private Stall stall;
	
	public Schaf(String name, int alter, Stall stall){
		setName(name);
		setAlter(alter);
		setStall(stall);
	}
	
	public Stall getStall() {
		return stall;
	}

	public void setStall(Stall stall) {
		this.stall = stall;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
}
