package methode_weiteresBeispiel;

public class Testprogramm {

	public static void main(String[] args) {
		KlasseMitGenerischerMethode example = new KlasseMitGenerischerMethode();

		double result1 = example.calculateRatio(10, 5); // Aufruf als int, gibt 2.0 zurück
		double result2 = example.calculateRatio(5.5, 2.0); // Aufruf als double, gibt 2.75 zurück
		double result3 = example.calculateRatio(15L, 3L); // Aufruf als long, gibt 5.0 zurück

		// gibt die Ergebnisse aus
		System.out.println("Ergebnis 1: " + result1);
		System.out.println("Ergebnis 2: " + result2);
		System.out.println("Ergebnis 3: " + result3);

	}

}
