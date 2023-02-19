
public class Parameter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Berechnungen b = new Berechnungen();

		System.out.println("intSumme1(3, 4) = " + b.intSumme1(3, 4));

		System.out.println("intSumme1(3, 4, 5) = " + b.intSumme1(3, 4, 5));

		System.out.println("intSumme1(3, 4, 12, 14) = " + b.intSumme1(3, 4, 12, 14));

		int[] a = { 3, 4, 12, 14, 18, 32 };
		System.out.println("intSumme2(3, 4, 12, 14, 18, 32) = " + b.intSumme2(a));

		System.out.println("intSumme3(3, 4, 12, 14, 18, 32) = " + b.intSumme3(3, 4, 12, 14, 18, 32));

		System.out.println(d);

	}

}
