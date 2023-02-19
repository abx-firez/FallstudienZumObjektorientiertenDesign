package sst;

public class AktuelleKlasse implements GenInterface<Integer>{
	private Integer meinWert;
	
	public AktuelleKlasse(Integer i){
		meinWert = i;
		methode1(meinWert);
		methode2();
	}
	
	public void methode1(Integer i){
		System.out.println("Methode1 von AktuelleKlasse, Wert "+ i);
	}
	
	public void methode2(){
		System.out.println("Methode2 von Abstrakte Klasse.");
	}
}
