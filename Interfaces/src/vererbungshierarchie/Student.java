package vererbungshierarchie;

public class Student extends Hochschulangehoeriger {

	private int matrikelnr;
	
	@Override
	public boolean groesser(Object obj) {
		
		return ((Integer) obj).intValue() > matrikelnr;
	}

	public int getMatrikelnr() {
		return matrikelnr;
	}

	public void setMatrikelnr(int matrikelnr) {
		this.matrikelnr = matrikelnr;
	}

}
