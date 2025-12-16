package Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Programm {

	public static void main(String[] args) {
		LinkedList<String> liste = new LinkedList<>();
		
		liste.add("Ralf");
		liste.add("Rick");
		liste.add("Rolf");
		liste.add("Rob");
		liste.add("Raoul");
		
		Iterator<String> it = liste.iterator();
		
		System.out.println(it.next());
		System.out.println(it.next());
		
		System.out.println("Jetzt die Schleife:");
		while (it.hasNext()){
			System.out.println(it.next());
		}

	}

}
