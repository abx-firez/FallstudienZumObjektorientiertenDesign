
public class Professorin implements ISortierbar {

	private int persnr;
	
	@Override
	public boolean groesser(Object obj) {
		
		return ((Integer) obj).intValue() > persnr;
	}

	public int getPersnr() {
		return persnr;
	}

	public void setPersnr(int persnr) {
		this.persnr = persnr;
	}

}
