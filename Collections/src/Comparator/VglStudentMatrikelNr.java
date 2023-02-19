package Comparator;

import java.util.Comparator;

// Die Klasse ist lediglich Träger der Methode compare, die
// in dieser Implementierung Studenten nach Matrikelnummer 
// sortiert.

public class VglStudentMatrikelNr implements Comparator<Student> {
	public int compare(Student s1, Student s2){
		return s1.getMatrikelNr() - s2.getMatrikelNr();
	}

}
