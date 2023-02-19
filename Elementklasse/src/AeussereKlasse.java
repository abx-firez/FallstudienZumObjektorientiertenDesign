
public class AeussereKlasse {
	private int zahl;

	public AeussereKlasse(int z){
		setZahl(z);
	}
	public int getZahl() {
		return zahl;
	}

	public void setZahl(int zahl) {
		this.zahl = zahl;
	}
	
	public void meineMethode(){
		InnereKlasse inner = new InnereKlasse(5);
		inner.ausgeben();
	}
	
	private class InnereKlasse{
		private int meineZahl;

		public InnereKlasse(int z){
			setMeineZahl(z);
		}
		public int getMeineZahl() {
			return meineZahl;
		}

		public void setMeineZahl(int meineZahl) {
			this.meineZahl = meineZahl;
		}
		
		public void ausgeben(){
			System.out.println("In InnereKlasse: zahl = " + zahl);
			System.out.println("In InnereKlasse: meineZahl = " + meineZahl);
		}
	}
}
