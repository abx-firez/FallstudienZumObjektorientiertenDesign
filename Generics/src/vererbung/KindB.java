package vererbung;

public class KindB <S> extends ElternA<S>{
	public void methodeB(S s){
		System.out.println("In Methode methodeB mit Wert " + s);
	}
}
