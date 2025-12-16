package lambda;

public class BerechnungenMain {

	public static void main(String[] args) {
		IRectangleCalculator rect = (length, width) -> length * width;
		System.out.println("Flaeche: " + rect.getArea(4, 3));
		
		// "Anweisungskette"
		IRectangleCalculator rectManipulated = (length, width) -> 
			{ length *= 2; width *= 3; return length * width; };
		System.out.println("Flaeche: " + rectManipulated.getArea(4, 3));

	}

}
