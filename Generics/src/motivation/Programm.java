package motivation;

public class Programm {

	public static void main(String[] args) {
		PunktInteger pint1 = new PunktInteger(2, 3);
		PunktInteger pint2 = new PunktInteger(4, 5);
		System.out.println("Punkte " + pint1 + " und " + pint2 + ".");
		
		PunktDouble pdoub1 = new PunktDouble(2, 3);
		PunktDouble pdoub2 = new PunktDouble(4, 5);
		System.out.println("Punkte " + pdoub1 + " und " + pdoub2 + ".");

	}

}
