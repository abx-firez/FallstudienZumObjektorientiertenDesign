package generic;

public class Programm {

	public static void main(String[] args) {
		Punkt<Integer> pint1 = new Punkt<Integer>(2, 3);
		Punkt<Integer> pint2 = new Punkt<Integer>(4, 5);
		System.out.println("Punkte " + pint1 + " und " + pint2 + ".");

		Punkt<Double> pdoub1 = new Punkt<Double>(2.0, 3.0);
		Punkt<Double> pdoub2 = new Punkt<Double>(4.0, 5.0);
		System.out.println("Punkte " + pdoub1 + " und " + pdoub2 + ".");

	}

}
