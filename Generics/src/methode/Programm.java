package methode;

public class Programm {

	public static void main(String[] args) {
		Punkt<Integer> p1 = new Punkt<Integer>(2,3);
		Punkt<Integer> p2 = new Punkt<Integer>(4,5);
		
		System.out.println("P1: " + p1);
		System.out.println("P2: " + p2);
		
		Berechnungen b = new Berechnungen();
		b.vertauschePunkte(p1, p2);
		
		System.out.println("Vertauschen");
		System.out.println("P1: " + p1);
		System.out.println("P2: " + p2);

	}

}
