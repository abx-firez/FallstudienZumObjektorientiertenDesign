package methode;

public class Berechnungen {
	public <T> void vertauschePunkte(Punkt<T> p1, Punkt<T> p2){
		
		// Achtung, verändert nicht die Referenzen beim Aufrufer (Hauptprogramm)
		// Änderung der Referenzen bleibt lokal
//		Punkt<T> hilf = p1;
//		p1 = p2;
//		p2 = hilf;
		
		// Tiefen-Vertauschen
		T hilfX;
		T hilfY;
		
		hilfX = p1.getX();
		hilfY = p1.getY();
		
		p1.setX(p2.getX());
		p1.setY(p2.getY());
		
		p2.setX(hilfX);
		p2.setY(hilfY);
		

	}
}
