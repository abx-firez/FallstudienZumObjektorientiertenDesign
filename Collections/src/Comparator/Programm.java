package Comparator;

import java.util.Collections;
import java.util.LinkedList;

public class Programm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Erstelle Liste mit Studenten und sortiere
		// diese einmal nach Matrikelnummer und einmal
		// nach Gr��e.
		
		LinkedList<Student> studierende = new LinkedList<>();
		
		// Bef�llen der Liste:
		studierende.add(new Student("Maier", "Hugo", 123456, 5, 167));
		studierende.add(new Student("M�ller", "Hans", 654321, 1, 201));
		studierende.add(new Student("Schulze", "Heinz", 321456, 4, 177));
		studierende.add(new Student("Schmid", "Heike", 111111, 2, 195));
		studierende.add(new Student("Meier", "Hanna", 999999, 2, 184));
		
		// Ausgeben as is:
		System.out.println("Ausgabe, wie eingegeben:");
		for (Student x : studierende) System.out.println(x);
		
		// Ausgeben sortiert nach MatrikelNr
		System.out.println("Ausgabe, sortiert nach Matrikelnummer:");
		Collections.sort(studierende, new VglStudentMatrikelNr());
		for (Student x : studierende) System.out.println(x);		
		
		// Ausgeben sortiert nach Gr��e:
		System.out.println("Ausgabe, sortiert nach Groesse:");
		Collections.sort(studierende, new VglStudentGroesse());
		for (Student x : studierende) System.out.println(x);
		
	}

}
