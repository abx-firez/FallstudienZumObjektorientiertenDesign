public class Programm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Berechnungen b = new Berechnungen();
		Kubik k = new Kubik();
		System.out.println("Kubische Werte:");
		b.Wertetafel(k);
		
		// Was muss ich tun, wenn ich quardratische Werte berechnen m�chte mit meiner Wertetafel?
		// Nat�rlich mit anonymer Klasse
		System.out.println("Quadratische Werte:");
		
		
		
	}

}
