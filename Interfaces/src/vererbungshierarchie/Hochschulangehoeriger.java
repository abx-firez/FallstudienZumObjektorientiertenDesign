package vererbungshierarchie;

public class Hochschulangehoeriger extends Person implements ISortierbar {

	protected String hochschule;
	
	@Override
	public boolean groesser(Object obj) {
		return false;
	}

	@Override
	public boolean kleiner(Object obj) {
		return false;
	}

	@Override
	public boolean gleich(Object obj) {
		return false;
	}

}
