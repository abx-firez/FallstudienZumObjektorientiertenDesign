package wildcard;

public class Programm {

	public static void main(String[] args) {
		Punkt<?>[] punkte = new Punkt<?>[4];
		punkte[0] = new Punkt<Integer>(2,3);
		punkte[1] = new Punkt<Double>(4.0,5.0);
		punkte[2] = new Punkt<Integer>(6,7);
		punkte[3] = new Punkt<Byte>((byte)2,(byte)3);
		
		for (Punkt<?> x : punkte){
			System.out.println("Punkt:" + x);
		}
	}

}
