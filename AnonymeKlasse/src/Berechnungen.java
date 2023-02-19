
public class Berechnungen {
	
	// Achtung: Polymorphie, Param: IntMethode m bzw. Methode m.berechne(...)
	public void Wertetafel(IntMethode m){
		for (int i = 0; i < 11; i++){
			System.out.println(i + " -> " + m.berechne(i));
		}
	}
}
