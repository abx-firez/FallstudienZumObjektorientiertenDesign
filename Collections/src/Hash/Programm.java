package Hash;

import Comparator.Student;

public class Programm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s = new Student("Maier", "Hugo", 123456, 5, 167);
		
		//Gleiche Referenz:
		Student t = s;
		System.out.println(s);
		System.out.println("Hashcode von s: " + s.hashCode());
		System.out.println("Hashcode von t: " + t.hashCode());
		System.out.println(s.equals(t));
		
		//Hugo Maier heiratet. Name �ndert sich in M�ller:
		s.setName("M�ller");
		System.out.println(s);
		System.out.println("Hashcode von s: " + s.hashCode());
		System.out.println("Hashcode von t: " + t.hashCode());
		
		// Hugo M�ller kommt ein Semester weiter:
		s.setSemester(s.getSemester()+1);
		System.out.println(s);
		System.out.println("Hashcode von s: " + s.hashCode());
		System.out.println("Hashcode von t: " + t.hashCode());

	}

}
