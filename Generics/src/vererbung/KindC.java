package vererbung;

public class KindC<U> extends ElternA<Integer> {
	public void methodeC(U u){
		System.out.println("In Methode methodeC mit Wert " + u);
	}
}
