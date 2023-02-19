package vererbung;

public class Programm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ElternA<Double> eA = new KindB<Double>();
		eA.methodeA(4.5);
	
		
		KindB<Double> kB = (KindB<Double>)eA;
		kB.methodeB(3.4);
		kB.methodeA(3.0);
		
		KindC<Double> kC = new KindC<Double>();
		kC.methodeA(4);
		kC.methodeC(5.6);
//		
//		ElternA<Integer> eAA = (ElternA<Integer>) kC;
//		eAA.methodeA(5);
		
		KindD kD = new KindD();
		kD.methodeA((byte)123);
		kD.methodeD(7.8);
		
		ElternA<Byte> eAAA = (ElternA<Byte>) kD;
		eAAA.methodeA((byte)111);

	}

}
