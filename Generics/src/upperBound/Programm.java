package upperBound;

public class Programm {

	public static void main(String[] args) {
		Punkt<Integer> p1 = new Punkt<Integer>(2,3);
		Punkt<Double> p2 = new Punkt<Double>(3.0,4.0);
		System.out.println(p1.abstand(p2));

	}

}
