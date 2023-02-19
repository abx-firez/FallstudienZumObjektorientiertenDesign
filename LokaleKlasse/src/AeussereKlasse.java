
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
		
		class InnereKlasse{
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
			
			private void ausgeben(){
				System.out.println("Aus äußerer Klasse: zahl = " + zahl);
				System.out.println("Aus innerer Klasse: meineZahl = " + meineZahl);
				zahl ++;
				System.out.println("Aus äußerer Klasse: zahl = " + zahl);
			}
			
		}
		
		// Hier geht die Methode meineMethode erst richtig los...
		System.out.println("In meineMethode");
		InnereKlasse inner1 = new InnereKlasse(3);
		inner1.ausgeben();
		InnereKlasse inner2 = new InnereKlasse(4);
		inner2.ausgeben();
	}
}
