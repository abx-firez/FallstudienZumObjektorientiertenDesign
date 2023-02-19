package sst;

public class GenericKlasse<T> implements GenInterface<T> {
	T meinWert;
	
	public GenericKlasse(T i){
		meinWert = i;
		methode1(meinWert);
		methode2();
	}
	
	public void methode1(T i){
		System.out.println("Methode1 von GenericKlasse, Wert "+ i);
	}
	
	public void methode2(){
		System.out.println("Methode2 von GenericKlasse.");
	}
}
