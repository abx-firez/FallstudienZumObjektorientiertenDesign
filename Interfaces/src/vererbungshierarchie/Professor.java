package vererbungshierarchie;

public class Professor extends Hochschulangehoeriger{

	private int persnr;

	@Override
	public boolean groesser(Object obj) {
		
		return ((Integer) obj).intValue() > persnr;
	}

	public int gibBruttoGehalt() {
		return 1000;
	}
	
	public int getPersnr() {
		return persnr;
	}

	public void setPersnr(int persnr) {
		this.persnr = persnr;
	}

}
