package methode_weiteresBeispiel;

public class Testprogramm {

	public static void main(String[] args) {
		KlasseMitGenerischerMethode example = new KlasseMitGenerischerMethode();

		double result1 = example.calculateRatio(10, 5); // Aufruf als int, gibt 2.0 zur�ck
		double result2 = example.calculateRatio(5.5, 2.0); // Aufruf als double, gibt 2.75 zur�ck
		double result3 = example.calculateRatio(15L, 3L); // Aufruf als long, gibt 5.0 zur�ck

		// gibt die Ergebnisse aus
		System.out.println("Ergebnis 1: " + result1);
		System.out.println("Ergebnis 2: " + result2);
		System.out.println("Ergebnis 3: " + result3);

	}

}
