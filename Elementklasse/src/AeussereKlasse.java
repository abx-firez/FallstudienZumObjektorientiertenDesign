
public class AeussereKlasse {
	private int auesserezahl;

	public AeussereKlasse(int z){
		setZahl(z);
	}
	public int getZahl() {
		return auesserezahl;
	}

	public void setZahl(int zahl) {
		this.auesserezahl = zahl;
	}
	
	public void meineMethode(){
		InnereKlasse inner = new InnereKlasse(5);
		inner.ausgeben();
	}
	
	private class InnereKlasse{
		private int innereZahl;

		public InnereKlasse(int z){
			setMeineZahl(z);
		}
		public int getMeineZahl() {
			return innereZahl;
		}

		public void setMeineZahl(int meineZahl) {
			this.innereZahl = meineZahl;
		}
		
		public void ausgeben(){
			System.out.println("In InnereKlasse: auesserezahl = " + auesserezahl);
			System.out.println("In InnereKlasse: innerezahl = " + innereZahl);
		}
	}
}
