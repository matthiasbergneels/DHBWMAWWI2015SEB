package kapitel9;

public class Hund {

	private String namen;
	private int alter;
	private float gewicht;
	private double laenger;
	private boolean vegetarier;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alter;
		result = prime * result + Float.floatToIntBits(gewicht);
		long temp;
		temp = Double.doubleToLongBits(laenger);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((namen == null) ? 0 : namen.hashCode());
		result = prime * result + (vegetarier ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Hund other = (Hund) obj;
		if (alter != other.alter) {
			return false;
		}
		if (Float.floatToIntBits(gewicht) != Float
				.floatToIntBits(other.gewicht)) {
			return false;
		}
		if (Double.doubleToLongBits(laenger) != Double
				.doubleToLongBits(other.laenger)) {
			return false;
		}
		if (namen == null) {
			if (other.namen != null) {
				return false;
			}
		} else if (!namen.equals(other.namen)) {
			return false;
		}
		if (vegetarier != other.vegetarier) {
			return false;
		}
		return true;
	}

	public Hund(String namen, int alter, float gewicht, double laenger,
			boolean vegetarier) {
		this.namen = namen;
		this.alter = alter;
		this.gewicht = gewicht;
		this.laenger = laenger;
		this.vegetarier = vegetarier;
	}
	
	public String getNamen() {
		return namen;
	}
	public void setNamen(String namen) {
		this.namen = namen;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public float getGewicht() {
		return gewicht;
	}
	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	}
	public double getLaenger() {
		return laenger;
	}
	public void setLaenger(double laenger) {
		this.laenger = laenger;
	}
	public boolean isVegetarier() {
		return vegetarier;
	}
	public void setVegetarier(boolean vegetarier) {
		this.vegetarier = vegetarier;
	}
	
	
}
