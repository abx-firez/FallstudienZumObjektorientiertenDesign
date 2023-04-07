package MitPatternMatching;

public class Main {

	public static void main(String[] args) {
		int number = 5;

		// Pattern Matching
		// Erm�glicht es, neben dem Matching auf eine
		// bestimmte Bedingung zu pr�fen und nur dann den entsprechenden Block
		// auszuf�hren
		// -> siehe z.B. https://www.baeldung.com/java-switch-pattern-matching
		switch (number) {
			case 1 -> System.out.println("Eins");
			case 2 -> System.out.println("Zwei");
			case 3 -> System.out.println("Drei");
			case 4 -> System.out.println("Vier");
			case 5 -> System.out.println("F�nf");
			default -> System.out.println("Kein Match");
		}

		switch ("3") {
			case "1" -> System.out.println("Eins");
			case "2" -> System.out.println("Zwei");
			case "3" -> System.out.println("Drei");
			default -> System.out.println("Kein Match");
		}
	}

}
