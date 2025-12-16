package Hash;

import java.util.HashMap;

import Comparator.Student;

public class Programm {

	public static void main(String[] args) {
		Student s = new Student("Maier", "Hugo", 123456, 5, 167);
		
		HashMap<Integer, Student> hashMap = new HashMap<>();
		hashMap.put(1, s);
		hashMap.put(1, s);
				
				
//		//Gleiche Referenz:
//		Student t = s;
//		System.out.println(s);
//		System.out.println("Hashcode von s: " + s.hashCode());
//		System.out.println("Hashcode von t: " + t.hashCode());
//		System.out.println(s.equals(t));
//		
//		//Hugo Maier heiratet. Name ändert sich in Müller:
//		// Achtung, individuelle Berechnung von hashCode() in Student
//		// ohne Verwendung von Name
//		s.setName("Müller");
//		System.out.println(s);
//		System.out.println("Hashcode von s: " + s.hashCode());
//		System.out.println("Hashcode von t: " + t.hashCode());
//		
//		// Hugo Müller kommt ein Semester weiter:
//		// Achtung, Semester wird zur Berechnung von hashCode() ebenfalls ignoriert
//		s.setSemester(s.getSemester()+1);
//		System.out.println(s);
//		System.out.println("Hashcode von s: " + s.hashCode());
//		System.out.println("Hashcode von t: " + t.hashCode());

	}

}
