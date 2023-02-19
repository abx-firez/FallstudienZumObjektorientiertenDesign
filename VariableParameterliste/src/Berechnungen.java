
public class Berechnungen {
	
	public int intSumme1(int a, int b) {
		return a + b;
	}

	public int intSumme1(int a, int b, int c) {
		return a + b + c;
	}

	public int intSumme1(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public int intSumme2(int[] a) {
		int ergebnis = 0;
		for (int i : a) {
			ergebnis += i;
		}
		return ergebnis;
	}

	public int intSumme3(int... a) {
		int ergebnis = 0;
		for (int i : a) {
			ergebnis += i;
		}
		return ergebnis;
	}
}
