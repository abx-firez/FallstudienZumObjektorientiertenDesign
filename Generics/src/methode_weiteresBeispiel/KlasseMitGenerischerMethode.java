package methode_weiteresBeispiel;

public class KlasseMitGenerischerMethode {

	/**
	 * eine nicht-generische Methode
	 */
	public void doSomething() {
		
	}

	/**
	 * eine generische Methode, die das Verhältnis zwischen 
	 * zwei numerischen Werten berechnet
	 * @param <T> generischer Typparameter
	 * @param value1 erster Wert
	 * @param value2 zweiter Wert
	 * @return Verhältnis zwischen Wert 1 und Wert 2
	 */
	public <T extends Number> double calculateRatio(T value1, T value2) {
		double ratio = value1.doubleValue() / value2.doubleValue();
		return ratio;
	}
}